package com.example.restservice.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/products")
public class ProductController {

    private final static Logger LOGGER = LoggerFactory.getLogger(ProductController.class.getName());

    @Autowired
    private ProductService service;

    // Aggregate root - http://localhost:8080/products

    @RequestMapping(value="/{id}", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Product getProduct(@PathVariable int id) {
        LOGGER.info("getProduct({})", id);
        return service.getProduct(id);
    }

    // Single item

    @RequestMapping(method=RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Product> getProducts() {
        LOGGER.info("getProducts({})");
        return service.getProducts();
    }
}
