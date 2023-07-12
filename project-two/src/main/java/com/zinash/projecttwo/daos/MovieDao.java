package com.zinash.projecttwo.daos;

import com.zinash.projecttwo.models.Movie;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MovieDao implements MovieDaoInterface{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Movie> getAllMovie() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Movie> query = currentSession.createQuery("From Movie", Movie.class);
        return query.getResultList();
    }

    @Override
    public Movie getMovieById(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        return  currentSession.get(Movie.class, id);

    }

    @Override
    public void saveMovie(Movie movie) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(movie);

    }





}
