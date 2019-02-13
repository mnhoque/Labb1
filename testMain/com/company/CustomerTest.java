package com.company;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerTest {
     @Test
    public void getName_returnsname_sameaslocallycreatedname() throws Exception{



        Customer customer=new Customer(2,"Nazmul","gamlestaden");
        assertEquals("Nazmul",customer.getCustomerName());
    }

}