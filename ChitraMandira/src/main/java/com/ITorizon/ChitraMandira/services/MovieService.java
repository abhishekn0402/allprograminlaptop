package com.ITorizon.ChitraMandira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITorizon.ChitraMandira.dto.Movie;
import com.ITorizon.ChitraMandira.repo.MovieRepo;

@Service
public class MovieService
{
	@Autowired
private MovieRepo movieRepo;
	public List<Movie> showMovies()
	{
		
		return movieRepo.findAll();
	}
	public Movie addMovie(Movie movie)
	{
		
		return movieRepo.save(movie);
	}

}
