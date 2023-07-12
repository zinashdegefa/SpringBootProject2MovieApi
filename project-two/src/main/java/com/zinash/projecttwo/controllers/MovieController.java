package com.zinash.projecttwo.controllers;

import com.zinash.projecttwo.models.Movie;
import com.zinash.projecttwo.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/movie/{id}")
    public Movie getMovieById(@PathVariable int id){

        return movieService.getMovieById(id);
    }

    @PostMapping("/saveMovie")
    public void saveMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
    }

    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        return movie;
    }









}
