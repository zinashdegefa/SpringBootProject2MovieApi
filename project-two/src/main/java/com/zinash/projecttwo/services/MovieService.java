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

      return mDao.getAllMovie();
   }

    @Override
    @Transactional
   public Movie getMovieById(int id) {
      return mDao.getMovieById(id);
   }

}
