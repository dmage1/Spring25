package com.example.restservice.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Repository
class ProductRepository {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProductRepository.class.getName());

    List<Product> getProducts() {
        LOGGER.info("getProducts()");
        return Arrays.asList(PRODUCTS);
    }

    Product getProduct(int id) {
        LOGGER.info("getProduct({})", id);
        return PRODUCTS[id];
    }

    private static Product[] PRODUCTS = {
            new Product(0, "name", "description", "category", "status", new BigDecimal(0), new BigDecimal(0)),
            new Product(1, "name", "description", "category", "status", new BigDecimal(0), new BigDecimal(0)),
            new Product(2, "name", "description", "category", "status", new BigDecimal(0), new BigDecimal(0)),
            new Product(3, "name", "description", "category", "status", new BigDecimal(0), new BigDecimal(0)),
            new Product(4, "name", "description", "category", "status", new BigDecimal(0), new BigDecimal(0))
    };
}