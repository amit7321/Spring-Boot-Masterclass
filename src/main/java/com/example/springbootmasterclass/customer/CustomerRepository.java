package com.example.springbootmasterclass.customer;

import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond"),
                new Customer(2L, "Amit Hasan")
        );
    }
}
