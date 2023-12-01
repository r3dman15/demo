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
    @JoinColumn(name = "author_id")
    private Set<Author> authors;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;

    private String price;

    private Integer availability;

    private String description;

    private String image_url;



}
