package com.company;

import java.util.ArrayList;

public class CustomerBascket {
   public ArrayList<Product> productArrayList=new ArrayList<Product>();
   int productCount=0;
   double totalToPay=0;
   Product product;

    public void customerOwnCheckOut(){
        for(int i = 0;i<=productArrayList.size()-1;i++){
            totalToPay=totalToPay+productArrayList.get(i).getProductPrice();
            productCount++;
            }
    }
    public CustomerBascket(Product product,int productCount){
        this.productCount=productCount;
        this.product=product;
    }


}


