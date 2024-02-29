package com.example.restservice.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.example.restservice.customer.CustomerRepository.CUSTOMERS;

@Repository
class OrderRepository {

    private final static Logger LOGGER = LoggerFactory.getLogger(OrderRepository.class.getName());

    List<Order> getOrders() {
        LOGGER.info("getOrders()");
        return Arrays.asList(ORDERS);
    }

    Order getOrder(int id) {
        LOGGER.info("getOrder({})", id);
        return ORDERS[id];
    }

    private static Order[] ORDERS = {
            new Order(0, new Date(), "orderMode", "orderStatus", new BigDecimal(0), CUSTOMERS[0], new ArrayList<>()),
            new Order(1, new Date(), "orderMode", "orderStatus", new BigDecimal(0), CUSTOMERS[1], new ArrayList<>()),
            new Order(2, new Date(), "orderMode", "orderStatus", new BigDecimal(0), CUSTOMERS[2], new ArrayList<>()),
            new Order(3, new Date(), "orderMode", "orderStatus", new BigDecimal(0), CUSTOMERS[3], new ArrayList<>()),
            new Order(4, new Date(), "orderMode", "orderStatus", new BigDecimal(0), CUSTOMERS[4], new ArrayList<>())
    };
}
