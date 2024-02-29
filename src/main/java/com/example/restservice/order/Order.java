package com.example.restservice.order;

import com.example.restservice.customer.Customer;
import com.example.restservice.product.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Order {
    // @Data is like having implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor annotations on the class

    @NotNull
    private int id;

    private Date orderDate;
    private String orderMode;
    private String orderStatus;
    private BigDecimal orderTotal;

    private Customer customer;

    private List<Product> purchasedProducts;

}
