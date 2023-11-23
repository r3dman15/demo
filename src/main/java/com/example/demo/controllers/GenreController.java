package com.example.demo.controllers;


import com.example.demo.domain.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.repositories.GenreRepository;

@Component
@Controller
@RequestMapping("bookstore")
// This means that this class is a Controller
public class GenreController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private GenreRepository genreRepository;

    @PostMapping(path="/genre", consumes = MediaType.APPLICATION_JSON_VALUE) // Map ONLY POST Requests
    public @ResponseBody String addNewGenre(@RequestBody String genreName){
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        Genre n = new Genre();
        n.setGenre_name(genreName);
        genreRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/genre")
    public @ResponseBody Iterable<Genre> getAllUsers() {
        // This returns a JSON or XML with the users
        return genreRepository.findAll();
    }

    @GetMapping
    public String helloWorld(){
        return "HEllo World";
    }
}