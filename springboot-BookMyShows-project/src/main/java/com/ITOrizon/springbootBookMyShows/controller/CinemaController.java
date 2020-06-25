package com.ITOrizon.springbootBookMyShows.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ITOrizon.springbootBookMyShows.dto.Cinema;
import com.ITOrizon.springbootBookMyShows.service.CinemaService;




@RestController
@RequestMapping("/cinema")
public class CinemaController
{
	@Autowired
	private CinemaService cinemaService;
	@GetMapping
	public List<Cinema> getAllCinema()
	{
		return cinemaService.getAllCinema();
	}
	@GetMapping("/{movieId}")
	public Cinema getCinemaById(@PathVariable(value="movieId") int movieId)
	{
		return cinemaService.getCinemaById(movieId);
	}
	@PostMapping("")
	public Cinema addCinema(@RequestBody Cinema cinema)
	{
		return cinemaService.addCinema(cinema);
	}
	@PutMapping("/{movieId}")
	public Cinema updateCinema(@RequestBody Cinema cinema,@PathVariable(value="movieId") int movieId)
	{
		return cinemaService.updateCinema(cinema,movieId);
	}
	@DeleteMapping("/{movieId}")
	public void deleteCinema(@PathVariable(value="movieId") int movieId)
	{
		cinemaService.deleteCinema(movieId);
	}
}
