package com.company;

public class Product {
    private String productName;
    private int productArticleNumber;
    private double productPrice;

    public double getProductPrice() {
        return productPrice;
    }

    public int getProductArticleNumber() {
        return productArticleNumber;
    }

    public String getProductName() {
        return productName;
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
    public Product(String productName, int productArticleNumber, double productPrice){
        this.productName=productName;
        this.productArticleNumber=productArticleNumber;
        this.productPrice=productPrice;
    }
}
