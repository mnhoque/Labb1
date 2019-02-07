package com.company;

import java.io.Serializable;
import java.util.ArrayList;

public class Customer implements Serializable {
    public static final long serialVersionUID;

    static {
        serialVersionUID = 2333428322167285198L;
    }

    private int customerId;
    private String customerName;
    private String customerCity;
    public int productCount=0;

    //protected ArrayList<CustomerBascket> EachCustomerBasket=new ArrayList<CustomerBascket>();

     ArrayList<Product>productsList=new ArrayList<Product>();

    public ArrayList<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Product>productsList) {
        this.productsList = productsList;
    }

    /*public ArrayList<CustomerBascket> getProductArrayList() {
        return EachCustomerBasket;
    }

    public void setProductArrayList(ArrayList<CustomerBascket>EachCustomerBacket) {
        this.EachCustomerBasket = EachCustomerBacket;
    }*/
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Customer(){

    }
    public Customer(int customerId, String customerName, String customerCity ){

        this.customerCity=customerCity;
        this.customerId=customerId;
        this.customerName=customerName;
    }
    public void registerProductInEveryCustomer(Product product){

        productsList.add(product);
        productCount++;
    }

    public String toString()
    {
        String viewCustomer = new String("Name: " + customerName + "\nCustomer ID: "+customerId +"\nCustomer's address: "+ customerCity );
        return viewCustomer;
    }



}
