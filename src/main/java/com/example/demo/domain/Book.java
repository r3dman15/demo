package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer book_id;

    private String title;

    @ManyToMany
    private Set<Author> authors;

    private Integer genre_id;

    private String price;

    private Integer quantity_available;

}
