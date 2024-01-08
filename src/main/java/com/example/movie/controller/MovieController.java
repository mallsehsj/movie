package com.example.movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.movie.service.*;
import com.example.movie.model.Movie;

@RestController
public class MovieController {
    @Autowired
    public MovieH2Service movieService;

    @GetMapping("/movies")
    public ArrayList<Movie> getMovies() {
        return movieService.getMovies();
    }

    @PostMapping("/movies")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);

    }

    @GetMapping("/movies/{movieid}")
    public Movie getMovieById(@PathVariable("movieid") int movieid) {
        return movieService.getMovieById(movieid);

    }

    @PutMapping("/movies/{movieid}")
    public Movie updateMovie(@PathVariable("movieid") int movieid, @RequestBody Movie movie) {
        return updateMovie(movieid, movie);

    }

    @DeleteMapping("/movies/{movieid}")
    public void deleteMovie(@PathVariable("movieid") int movieid) {
        movieService.deleteMovie(movieid);

    }
}