package com.example.restservice.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    // @Data is like having implicit @Getter, @Setter, @ToString, @EqualsAndHashCode and @RequiredArgsConstructor annotations on the class

    private int id;

    @NotNull
    @Size(min = 2, message = "First Name should have at least 2 characters")
    private String firstName;

    @NotNull
    @Size(min = 2, message = "Last Name should have at least 2 characters")
    private String lastName;

    private String gender;
    private Date dob;

    private String address;
    private String city;
    private String state;
    private String postCode;

    private String phone;
    private String email;

    private BigDecimal creditLimit;
}
