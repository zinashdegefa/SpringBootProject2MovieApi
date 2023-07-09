package com.zinash.projecttwo.controllers;

import com.zinash.projecttwo.models.Movie;
import com.zinash.projecttwo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/getAllMovies")

    public List<Movie> getAllMovie() {
        return movieService.getAllMovie();

    }

    ;

}
