package com.acciojob.BookMyShowMAY.Controller;

import com.acciojob.BookMyShowMAY.Models.Movie;
import com.acciojob.BookMyShowMAY.Requests.AddMovieRequest;
import com.acciojob.BookMyShowMAY.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("movie")
public class MovieController {
  @Autowired
  private MovieService movieServiceObj;
  @PostMapping("add")
    public ResponseEntity addMovie(@RequestBody AddMovieRequest movieRequest){

      String response= movieServiceObj.addMovie(movieRequest);
      return new ResponseEntity(response, HttpStatus.OK);

  }

}
