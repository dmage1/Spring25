package com.example.restservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class CustomerService {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerService.class.getName());

    private CustomerMapper mapper;
    private CustomerRepository repository;

    @Autowired
    CustomerService(CustomerMapper mapper, CustomerRepository repository) {
        super();
        this.mapper = mapper;
        this.repository = repository;
    }

    Customer getCustomer(int id) throws InvalidCustomerId {
        LOGGER.info("getCustomer({})", id);
        Customer customer = repository.getCustomer(id);
        return mapper.map(customer);
    }

    Customer create(Customer customer) {
        LOGGER.info("create({})", customer.toString());
        return repository.create(customer);
    }

    List<Customer> getCustomers() {
        LOGGER.info("getCustomers()");
        List<Customer> customers = repository.getCustomers();
        customers.forEach(customer -> mapper.map(customer));
        return repository.getCustomers();
    }


}
