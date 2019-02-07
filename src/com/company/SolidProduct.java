package com.company;

public class SolidProduct extends Product {


    private double kg;



    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }






    public SolidProduct(){

    }
    public SolidProduct(String productName, int productArticleNumber, double productPrice,int quantuty,double kg){
        super(productName,productArticleNumber,productPrice,quantuty);
        this.kg=kg;

    }
    public String toString()
    {
        String viewProduct = new String("Product Name: " + super.getProductName() + "\nProduct ID: "+super.getProductArticleNumber() +"\nProduct price : "+ super.getProductPrice() + "\nQuantity is : "+ super.getQuantuty()+"\n kg  : "+ getKg());
        return viewProduct;
    }
    public double productCost(){
        double eachproductCost=0;
        eachproductCost=super.getProductPrice()*super.getQuantuty()*this.kg;
        return eachproductCost;
    }
}
