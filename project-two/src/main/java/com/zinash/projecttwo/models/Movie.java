package com.zinash.projecttwo.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Objects;

@Entity
@Table(name = "movie")
@Data
@ToString
@RequiredArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "director")
    private String director;

    @Column(name = "r_year")
    private int r_year;

    @Column(name = " movie_type")
    private String movie_type;

    @Column(name = " duration")
    private String duration;

    @Column(name = " status")
    private String status;

    @Column(name = "rent_price")
    private double rent_price;

    @Column(name = "rating")
    private double rating;

}
