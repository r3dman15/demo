package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Data // Getters and Setters
public class Genre {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer genre_id;

    String name;

}