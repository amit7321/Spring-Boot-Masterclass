package com.example.springbootmasterclass.customer;

 import com.example.springbootmasterclass.exception.NotFoundException;
 import org.slf4j.Logger;
 import org.slf4j.LoggerFactory;
 import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final static Logger logger = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    List<Customer> getCustomers() {
        logger.info("getCustomer is called");
        return customerRepository.findAll();
    }

    Customer getCustomer(Long id) {
        return customerRepository.findById(id)
                .orElseThrow(() -> {
                    logger.error("eeeeerrrrrrrrrrroooooooor");
                    return new NotFoundException("customer with " + id + " not found");
                });
    }
}
