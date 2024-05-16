package com.acciojob.BookMyShowMAY.Repositories;

import com.acciojob.BookMyShowMAY.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

    Movie findMovieByMovieName(String movieName);
}

