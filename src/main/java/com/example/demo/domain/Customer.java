package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer customer_id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    @ManyToOne
    @JoinColumn(name="address_id")
    private Address address;


    @Data
    public static class Request {
        private Customer customer;
        private Address address;
    }

}
