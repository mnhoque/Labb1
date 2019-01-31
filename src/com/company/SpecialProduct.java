package com.company;

public class SpecialProduct extends Product {

    private String productName;
    private int productArticleNumber;
    private double productPrice;
    private String productType;

    public SpecialProduct(String productName,int productArticleNumber,double productPrice,String productType){
        super(productName,productArticleNumber,productPrice);
        this.productType=productType;

    }
    public void CheckProduct(){

    }


}
