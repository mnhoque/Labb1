package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class CustomerRegister implements Serializable {
    public static final long serialVersionUID = 2333428322167285198L;
    public  ArrayList<Customer> customerList=new ArrayList<Customer>();
    public int customerCount=0;



    public void registerCustomer(Customer customer){

        customerList.add(customer);
        customerCount++;
    }

}
