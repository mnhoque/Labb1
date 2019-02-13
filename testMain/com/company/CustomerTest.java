package com.company;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
    Customer customer=new Customer(2,"Nazmul","gamlestaden");
     @Test
    public void getName_returnsname_sameaslocallycreatedname() throws Exception{




        assertEquals("Nazmul",customer.getCustomerName());

    }
    @Test
    public void getId() throws Exception{
         assertEquals(2,customer.getCustomerId());
    }

}