package com.ITOrizon.springbootBookMyShows.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ITOrizon.springbootBookMyShows.dto.Cinema;
import com.ITOrizon.springbootBookMyShows.exception.ResourceNotFoundException;
import com.ITOrizon.springbootBookMyShows.repo.CinemaRepository;



@Service
public class CinemaService
{
	@Autowired
	private CinemaRepository cinemaRepository;
	public List<Cinema>  getAllCinema()
	{
		return cinemaRepository.findAll();
	}

	public Cinema getCinemaById(@PathVariable(value="movieId") int movieId)
	{
		return cinemaRepository.findById(movieId).orElseThrow(()-> 
		new ResourceNotFoundException("User not found with the id "+movieId));
	}

	public Cinema addCinema(Cinema cinema) 
	{
		return this.cinemaRepository.save(cinema);
	}

	public Cinema updateCinema(Cinema cinema, int movieId) 
	{
		Cinema existing=this.cinemaRepository.findById(movieId).orElseThrow(()-> 
		new ResourceNotFoundException("User not found with the id "+movieId));
		existing.setMovieId(cinema.getMovieId());
		existing.setMovieGenre(cinema.getMovieGenre());
		existing.setMovieName(cinema.getMovieName());
		existing.setReleasedDate(cinema.getReleasedDate());
		existing.setProducer(cinema.getProducer());
		existing.setDirector(cinema.getDirector());
		
		return this.cinemaRepository.save(existing);
	}

	public void deleteCinema(@PathVariable(value="movieId") int movieId)
	{
		cinemaRepository.deleteById(movieId);
	}
}
