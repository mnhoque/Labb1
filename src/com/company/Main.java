package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    static CustomerRegister customerBook=new CustomerRegister();
    //static String a="";
    public static void main(String[] args) {
        Read_SaveFile readFile=new Read_SaveFile();
        readFile.readFile();

        System.out.println("How many custemer you want to enter ");
        int customersTotalNumber=sc.nextInt();
        sc.nextLine();
        int CustomerCount=0;
        String customerName;





        do{
            int productCountForEachCustomer=0;
            double totalPriceForEachCustomer=0;
            Customer customer= new Customer();
            while(true) {
                try {
                    //System.out.println("enter a number");
                    System.out.println("Write customer Name :");
                    customerName=sc.nextLine();
                    if(customer.isFirstLetterUpperCase(customerName)){
                        customer.setCustomerName(customerName);
                        break;
                    }
                } catch (Exception e) {
                    System.out.println("Invalid data!!!You have reenter a String.\n");
                }
            }
            //System.out.println("Write the customer name :" );

            //customer.setCustomerName(customerName);

            while(true) {
                try {
                    //System.out.println("enter a number");
                    System.out.println("Write customer id :");
                    int customerId = Integer.parseInt(sc.nextLine());
                    //int customerId=sc.nextInt();

                    //sc.nextLine();
                    customer.setCustomerId(customerId);
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid data.\nYou have reenter.\n");
                }
            }

            System.out.println("Write the customer address :" );
            String customerAddress=sc.nextLine();
            customer.setCustomerCity(customerAddress);

            System.out.println(customer.toString());
            customerBook.registerCustomer(customer);
            CustomerCount++;
            do{
                String y ="1. Solid "+"\n"+"2. Liquid product ";
                System.out.println(y);
                String answer = sc.nextLine();
                if(answer.equals("1")){
                    SolidProduct solidProduct=new SolidProduct();
                    solidProduct.setProductName("beef");
                    solidProduct.setProductArticleNumber(89);
                    solidProduct.setProductPrice(12.3);
                    solidProduct.setQuantuty(1);
                    solidProduct.setKg(7);
                    productCountForEachCustomer++;
                    customer.productsList.add(solidProduct);
                    double x =solidProduct.productCost();
                    totalPriceForEachCustomer=x+totalPriceForEachCustomer;
                }

                    else if(answer.equals("2")){
                    LiquidProduct liquid=new LiquidProduct();
                    liquid.setProductName("Milk");
                    liquid.setProductArticleNumber(29);
                    liquid.setProductPrice(7.99);
                    liquid.setQuantuty(2);
                    liquid.setLiter(1.5);
                    productCountForEachCustomer++;
                    customer.productsList.add(liquid);
                    double x =liquid.productCost();
                    totalPriceForEachCustomer=x+totalPriceForEachCustomer;
                    }
            }while(productCountForEachCustomer<2);

        }while(CustomerCount<customersTotalNumber);

        for(int i =0;i<=customerBook.customerList.size()-1;i++){
            System.out.println(customerBook.customerCount+".Customer in the customerList : "+customerBook.customerList.get(i).getCustomerName());
            for(int j =0; j<=customerBook.customerList.get(i).productsList.size()-1; j++){
                System.out.println("Each customer have the following checked out "+customerBook.customerList.get(i).productsList.get(j)+ " "+customerBook.customerList.get(i).productCount);
            }
        }
        readFile.saveFile();
    }

}
