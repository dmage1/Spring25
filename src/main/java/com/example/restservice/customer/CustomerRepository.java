package com.example.restservice.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class CustomerRepository {

    private final static Logger LOGGER = LoggerFactory.getLogger(CustomerRepository.class.getName());

    List<Customer> getCustomers() {
        LOGGER.info("getCustomers()");
        return Arrays.asList(CUSTOMERS);
    }

    Customer create(Customer customer) {
        return customer;
    }

    Customer getCustomer(int id) throws InvalidCustomerId {
        LOGGER.info("getCustomer({})", id);

        boolean validId = id >= 0 && id <= CUSTOMERS.length - 1;
        if (!validId) {
            throw new InvalidCustomerId(String.format("Invalid Customer Id [%s]", id));
        }

        return CUSTOMERS[id];
    }

    public static Customer[] CUSTOMERS = {
            new Customer(0, "firstName", "lastName", "gender", new Date(), "address","city","state","postCode", "phone", "email", new BigDecimal(0)),
            new Customer(1, "firstName", "lastName", "gender", new Date(), "address","city","state","postCode", "phone", "email", new BigDecimal(0)),
            new Customer(2, "firstName", "lastName", "gender", new Date(), "address","city","state","postCode", "phone", "email", new BigDecimal(0)),
            new Customer(3, "firstName", "lastName", "gender", new Date(), "address","city","state","postCode", "phone", "email", new BigDecimal(0)),
            new Customer(4, "firstName", "lastName", "gender", new Date(), "address","city","state","postCode", "phone", "email", new BigDecimal(0))
    };
}
