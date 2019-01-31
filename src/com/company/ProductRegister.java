package com.company;

import java.util.ArrayList;

public class ProductRegister {
    public int productCount=0;
    private ArrayList<Product> productArrayList=new ArrayList<Product>();

    public void registerProduct(){
        Product product= new Product("Water",12345,123.00);
        productArrayList.add(product);
        productCount++;
    }

}
