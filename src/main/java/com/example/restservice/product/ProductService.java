package com.example.restservice.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ProductService {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProductService.class.getName());

    private ProductRepository repository;

    @Autowired
    ProductService(ProductRepository repository) {
        super();
        this.repository = repository;
    }

    List<Product> getProducts() {
        LOGGER.info("getProductList()");
        return repository.getProducts();
    }

    Product getProduct(int id) {
        LOGGER.info("getProduct({})", id);
        return repository.getProduct(id);
    }
}
