package com.example.springbootmasterclass.customer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

public class CustomerRepository implements CustomerRepo {
    @Override
    public List<Customer> getCustomers() {
        return Collections.emptyList();
    }
}
