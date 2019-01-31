package com.company;

import java.util.ArrayList;

public class CustomerRegister {
    public static ArrayList<Customer> customerList=new ArrayList<Customer>();
    public int customerCount;
    public Customer custromer;
    public void registerCustomer(Customer customer){
        customerCount=0;
        customerList.add(customer);
        customerCount++;
    }
}
