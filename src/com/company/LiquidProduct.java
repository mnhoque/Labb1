
    package com.company;

    public class LiquidProduct extends Product {

        private double liter;

        public double getLiter(){
            return liter;
        }

        public void setLiter(double liter) {
            this.liter = liter;
        }


        public LiquidProduct(){

        }
        public LiquidProduct(String productName, int productArticleNumber, double productPrice,int quantuty,double liter){
            super(productName,productArticleNumber,productPrice,quantuty);
            this.liter=liter;

        }
        public double productCost(){
            double eachproductCost=0;
            eachproductCost=super.getProductPrice()*super.getQuantuty()*this.getLiter();
            return eachproductCost;
        }
        public String toString()
        {
            String viewProduct = new String("Product Name: " + super.getProductName() + "\nProduct ID: "+super.getProductArticleNumber() +"\nProduct price : "+ super.getProductPrice()+"\nQuantity is : "+ super.getQuantuty()+"+nproduct shape in paket "+this.getLiter() );
            return viewProduct;
        }
    }


