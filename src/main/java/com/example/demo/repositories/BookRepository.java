package com.example.demo.repositories;

import com.example.demo.domain.Book;
import com.example.demo.domain.Genre;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface BookRepository extends CrudRepository<Book, Integer> {
    public Set<Book> findByGenre(Genre genre);
}
