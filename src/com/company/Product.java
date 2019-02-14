package com.company;

import java.io.Serializable;

public class Product  implements Serializable {
    public static final long serialVersionUID = 2333428322167285198L;

    private String productName;
    private int productArticleNumber;
    private double productPrice;
    private int quantuty;

    public double getProductPrice() {

        return productPrice;
    }

    public int getProductArticleNumber() {

        return productArticleNumber;
    }

    public String getProductName() {

        return productName;
    }

    public int getQuantuty() {

        return quantuty;
    }

    public void setProductArticleNumber(int productArticleNumber) {

        this.productArticleNumber = productArticleNumber;
    }
    public void setProductName(String productName1){
        this.productName=productName1;

    }

    public void setProductPrice(double productPrice) {

        this.productPrice = productPrice;
    }

    public void setQuantuty(int quantuty) {

        this.quantuty = quantuty;
    }

    public Product(){

    }
    public Product(String productName, int productArticleNumber, double productPrice,int quantuty){
        this.productName=productName;
        this.productArticleNumber=productArticleNumber;
        this.productPrice=productPrice;
        this.quantuty=quantuty;
    }
    public double productCost(){
        double eachproductCost=0;
        eachproductCost=this.productPrice*this.quantuty;
        return eachproductCost;
    }
    public  boolean isFirstLetterUpperCase(String name) {

        if (name == null || name.length() < 1)
            return false;

        if ( Character.isUpperCase(name.codePointAt(0))) {
            return true;
        } else {
            return false;
        }
    }
    public static String firstLetterToUpperCase(String input) {

        String first = input.substring(0, 1).toUpperCase();
        //String rest = input.substring(1).toLowerCase();

        return first;
        //return first + rest;
    }
    public String toString()
    {
        String viewProduct = new String("Product Name: " + productName + "\nProduct ID: "+productArticleNumber +"\nProduct price : "+ productPrice+"\nProduct total price : "+ productCost() );
        return viewProduct;
    }

}
