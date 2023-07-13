package com.zinash.projecttwo.services;

import com.zinash.projecttwo.daos.MovieDao;
import com.zinash.projecttwo.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService implements MovieServiceInterface {

    @Autowired
    private MovieDao mDao;

  @Override
   @Transactional
   public List<Movie> getAllMovie() {
      List<Movie>  listOfMovie = mDao.getAllMovie();
      for(Movie m: listOfMovie) {
          System.out.println("Title: " + m.getTitle());
          System.out.println("Movie Detail: " + m);

      }
      return listOfMovie;
   }

    @Override
    @Transactional
   public Movie getMovieById(int id) {
      Movie getMovieById = mDao.getMovieById(id);
        System.out.println("The Id of the movie is " + getMovieById.getId());
        System.out.println("The Title is " + getMovieById.getTitle());
        System.out.println("Details of the movie is " + getMovieById);

      return getMovieById;
   }

    @Override
    @Transactional
   public void saveMovie(Movie movie) {
      mDao.saveMovie(movie);

        System.out.println(movie);

   }

    @Override
    @Transactional
   public void deleteMovie(int id) {
       mDao.deleteMovie(id);
     System.out.println("The move with id number "  + id + " is deleted!");
   }

}
