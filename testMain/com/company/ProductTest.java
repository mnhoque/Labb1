package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ProductTest {

    Product product=new Product();

    @Test
    void getProductName() {
        product.setProductName("kukis");
        assertEquals("kukis",product.getProductName());

    }
    @Test
    void checkUpperCase(){
        boolean result = product.isFirstLetterUpperCase("Cookies");
        assertTrue(result);
    }
    @Test
    void checkempty(){
        boolean result = product.isFirstLetterUpperCase("");
        assertFalse(result);
    }
    @Test
    void checkelse(){
        boolean result = product.isFirstLetterUpperCase("cookies");
        assertFalse(result);
    }
    @Test
    void checkProductCost(){
        double eachProductPrice =product.productCost();
        assertEquals(product.getQuantuty()*product.getProductPrice(),eachProductPrice
        );

    }

}