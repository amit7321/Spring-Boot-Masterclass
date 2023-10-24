package com.example.springbootmasterclass.customer;

import com.example.springbootmasterclass.SpringBootMasterclassApplication;
import com.example.springbootmasterclass.exception.ApiExceptionHandler;
import com.example.springbootmasterclass.exception.ApiRequestException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/customers")
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("{customerId}")
    Customer getCustomer(@PathVariable("customerId") Long id) {
        return customerService.getCustomer(id);
    }

    @GetMapping("{customerId}/exception")
    Customer getCustomerException(@PathVariable("customerId") Long id) {
        throw new ApiRequestException(
                "ApiRequestException customer Id" + id
        );
    }

    @PostMapping
    void createUser(@Valid @RequestBody Customer customer) {
        System.out.println("Post request");
    }

    @PutMapping
    void updateCustomer(@RequestBody Customer customer) {
        System.out.println("update customer");
    }

    @DeleteMapping("/{customerId}")
    void deleteCustomer(@PathVariable("customerId") Long id) {
        System.out.println("deleting customer....");
    }
}
