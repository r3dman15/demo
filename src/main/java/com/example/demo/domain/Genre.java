package com.example.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Genre {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer genre_id;


    String genre_name;

    public Integer getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Integer id) {
        this.genre_id = id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String name) {
        this.genre_name = name;
    }
}