package com.example.springbootmasterclass.customer;

import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Arrays;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    /*@Override
    public List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer(1L, "James Bond", "amit@gmail.com"),
                new Customer(2L, "Amit Hasan", "amit@gmail.com")
        );
    }*/

}
