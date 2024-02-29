package com.example.restservice.customer;

import org.springframework.stereotype.Component;

@Component
class CustomerMapper {

    Customer map(Customer customer) {
        customer.setPhone("++(0044) " + customer.getPhone());
        return customer;
    }
}
