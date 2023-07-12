package com.zinash.projecttwo.daos;

import com.zinash.projecttwo.models.Movie;

import java.util.List;

public interface MovieDaoInterface {


 List<Movie> getAllMovie();

 Movie getMovieById(int id);

 void saveMovie(Movie movie);


}
