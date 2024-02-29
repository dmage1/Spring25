package com.example.restservice.order;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class OrderService {

    private final static Logger LOGGER = LoggerFactory.getLogger(OrderService.class.getName());

    private OrderRepository repository;

    @Autowired
    OrderService(OrderRepository repository) {
        super();
        this.repository = repository;
    }

    List<Order> getOrders() {
        LOGGER.info("getOrders()");
        return repository.getOrders();
    }

    Order getOrder(int id) {
        LOGGER.info("getOrder({})", id);
        return repository.getOrder(id); }
}
