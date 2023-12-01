package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private Date date;

    @ManyToMany
    @JoinColumn(name = "book_id")
    private Set<Book> books;

}
