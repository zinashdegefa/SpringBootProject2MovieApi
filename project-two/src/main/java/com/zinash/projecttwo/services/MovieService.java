package com.zinash.projecttwo.services;

import com.zinash.projecttwo.daos.MovieDaoInterface;
import com.zinash.projecttwo.models.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService implements MovieServiceInterface {

    @Autowired
    private MovieDaoInterface mDaoIn;

  @Override
   @Transactional
   public List<Movie> getAllMovie() {
      List<Movie>  listOfMovie = mDaoIn.findAll();
      for(Movie m: listOfMovie) {
          System.out.println("Title: " + m.getTitle());
          System.out.println("Movie Detail: " + m);

      }
      return listOfMovie;
   }

    @Override
    @Transactional
   public Movie getMovieById(int id) {
      Optional<Movie> getMovieById = mDaoIn.findById(id);
      if (getMovieById.isPresent()) {
          System.out.println("The Id of the movie is " + getMovieById.get().getId());
          System.out.println("The Title is " + getMovieById.get().getTitle());
          System.out.println("Details of the movie is " + getMovieById);

          return getMovieById.get();
      }
      return null;
   }

    @Override
    @Transactional
   public void saveMovie(Movie movie) {
        mDaoIn.save(movie);

        System.out.println(movie);

   }

    @Override
    @Transactional
    public void updateMovie(Movie movie) {
        mDaoIn.save(movie);
    }

    @Override
    @Transactional
   public void deleteMovie(int id) {
        mDaoIn.deleteById(id);
     System.out.println("The move with id number "  + id + " is deleted!");
   }

}
