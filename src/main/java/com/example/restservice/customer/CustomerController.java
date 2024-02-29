package com.example.restservice.customer;

import com.example.restservice.model.Greeting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class CustomerController {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerController.class.getName());

    @Autowired
    private CustomerService service;

    @Autowired
    private CustomerValidator validator;

    // Aggregate root - http://localhost:8080/customers

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @GetMapping("/customers")
    public List<Customer> getCustomers() {
        LOGGER.info("getCustomers()");
        return service.getCustomers();
    }

    @PostMapping(value = "/customers")
    public Customer createCustomer(@RequestBody @Valid Customer customer, BindingResult result) throws MethodArgumentNotValidException {
        LOGGER.info("create({})", customer.toString());

        validator.validate(customer, result);

        if (result.hasErrors()) {
            throw new MethodArgumentNotValidException(null, result);
        }
        return service.create(customer);
    }

    // Single item
    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable int id) throws InvalidCustomerId {
        LOGGER.info("getCustomer({})", id);
        return service.getCustomer(id);
    }
}
