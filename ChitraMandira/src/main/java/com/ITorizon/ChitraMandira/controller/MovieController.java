package com.ITorizon.ChitraMandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITorizon.ChitraMandira.dto.Movie;
import com.ITorizon.ChitraMandira.services.MovieService;

@RestController
public class MovieController
{
	@Autowired
	private MovieService movieService;
	@GetMapping("/movie")
public List<Movie> showMovies()
{
	return movieService.showMovies();
}
	@PostMapping("/movie")
	public Movie addMovie(@RequestBody Movie movie)
	{
		return movieService.addMovie(movie);
	}
}
