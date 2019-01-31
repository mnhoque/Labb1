package com.company;

import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String customerName;
    private String customerCity;

    private ArrayList<CustomerBascket> EachCustomerBacket=new ArrayList<CustomerBascket>();



    public ArrayList<CustomerBascket> getProductArrayList() {
        return EachCustomerBacket;
    }

    public void setProductArrayList(ArrayList<CustomerBascket>EachCustomerBacket) {
        this.EachCustomerBacket = EachCustomerBacket;
    }
    /*public void addInList(){
        Product product=new Product("car",123456,123.45);
        productArrayList.add(product);
    }*/

    public String getCustomerCity() {
        return customerCity;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Customer(String customerId, String customerName, String customerCity ){

        this.customerCity=customerCity;
        this.customerId=customerId;
        this.customerName=customerName;
    }



}
