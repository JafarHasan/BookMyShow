package com.acciojob.BookMyShowMAY.Services;

import com.acciojob.BookMyShowMAY.Models.Movie;
import com.acciojob.BookMyShowMAY.Repositories.MovieRepository;
import com.acciojob.BookMyShowMAY.Requests.AddMovieRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepositoryObj;
    public String addMovie(AddMovieRequest movieRequest){

        //from my request Entry i am creating the entity:bca entity saves into the DB
        Movie movie=new Movie();
        movie.setMovieName(movieRequest.getMovieName());
        movie.setLanguage(movieRequest.getLanguage());
        movie.setDuration(movieRequest.getDuration());
        movie.setRating(movieRequest.getRating());
        movie.setReleaseDate(movieRequest.getReleaseDate());

        //saved to Db
        movie=movieRepositoryObj.save(movie);

        return "Movie Added with id="+movie.getMovieId();
    }
}
