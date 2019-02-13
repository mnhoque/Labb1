package com.company;

import java.io.*;

public class Read_SaveFile {
    String path = System.getProperty("user.home")
            + File.separator + "Documents"
            + File.separator + "customer.bin";
    File file = new File(path);
    public void readFile(){

        //Load from file, run this code first in your program on start.
        try (ObjectInputStream in =
                     new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            Main.customerBook = (CustomerRegister) in.readObject();

            //System.out.println(b);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //On first start you will end up here. No file available.
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //Save object to file, run before closing the program
    public void saveFile(){
        try (ObjectOutputStream out =
                     new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            out.writeObject(Main.customerBook);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
