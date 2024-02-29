package com.example.restservice.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    // @Data is like having implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor annotations on the class

    @NotNull
    private int id;

    private String name;
    private String description;
    private String category;
    private String status;

    private BigDecimal listPrice;
    private BigDecimal minPrice;
}

