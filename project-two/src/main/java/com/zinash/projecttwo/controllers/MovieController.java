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
    public String saveMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        System.out.println(movie.getTitle() + " is Saved!");
        return "The Movie is Saved!";
    }

    @PutMapping("/updateMovie")
    public Movie updateMovie(@RequestBody Movie movie) {
        movieService.saveMovie(movie);
        System.out.println(movie.getTitle() + " is updated!");
        return movie;
    }


    @DeleteMapping("/movie/delete/{id}")
    public String deleteMovie(@PathVariable int id) {
    movieService.deleteMovie(id);
    return "Id number " + id + " is deleted!";
    }






}
