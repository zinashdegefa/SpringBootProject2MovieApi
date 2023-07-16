package com.zinash.projecttwo.daos;

import com.zinash.projecttwo.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieDaoInterface extends JpaRepository<Movie, Integer> {


}
