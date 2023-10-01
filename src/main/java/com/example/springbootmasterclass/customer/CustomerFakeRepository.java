package com.example.springbootmasterclass.customer;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo{
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "amit@gmail.com"),
                new Customer(2L, "guunur gunnur", "amit@gmail.com")
                );
    }
}
