package com.zinash.projecttwo.models;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie")
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

    @Column(name = "rent_price")
    private int rent_price;


    public Movie() {
    }

    public Movie(int id, String title, String director, int r_year, String movie_type, String duration, int rent_price) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.r_year = r_year;
        this.movie_type = movie_type;
        this.duration = duration;
        this.rent_price = rent_price;
    }

    public Movie(String title, String director, int r_year, String movie_type, String duration, int rent_price) {
        this.title = title;
        this.director = director;
        this.r_year = r_year;
        this.movie_type = movie_type;
        this.duration = duration;
        this.rent_price = rent_price;
    }

    @Override
    public String toString() {
        return "Movie " + id + " { " +
                "id is: " + id +
                ", title is:'" + title + '\'' +
                ", director is:'" + director + '\'' +
                ", r_year=" + r_year +
                ", movie_type='" + movie_type + '\'' +
                ", duration='" + duration + '\'' +
                ", rent_price=" + rent_price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getR_year() {
        return r_year;
    }

    public void setR_year(int r_year) {
        this.r_year = r_year;
    }

    public String getMovie_type() {
        return movie_type;
    }

    public void setMovie_type(String movie_type) {
        this.movie_type = movie_type;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getRent_price() {
        return rent_price;
    }

    public void setRent_price(int rent_price) {
        this.rent_price = rent_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return getId() == movie.getId() && getR_year() == movie.getR_year() && getRent_price() == movie.getRent_price() && Objects.equals(getTitle(), movie.getTitle()) && Objects.equals(getDirector(), movie.getDirector()) && Objects.equals(getMovie_type(), movie.getMovie_type()) && Objects.equals(getDuration(), movie.getDuration());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getDirector(), getR_year(), getMovie_type(), getDuration(), getRent_price());
    }
}
