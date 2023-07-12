package com.zinash.projecttwo.services;

import com.zinash.projecttwo.models.Movie;

import java.util.List;

public interface MovieServiceInterface {

 List<Movie>getAllMovie();

 Movie getMovieById(int id);

 void saveMovie(Movie movie);

 void deleteMovie(int id);

}
