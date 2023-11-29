package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
public class Order {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer order_id;

    private Integer customer_id;

    private Date order_date;

    private Double total_price;

}
