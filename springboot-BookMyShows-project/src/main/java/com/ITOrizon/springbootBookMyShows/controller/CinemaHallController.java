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

import com.ITOrizon.springbootBookMyShows.dto.CinemaHall;
import com.ITOrizon.springbootBookMyShows.service.CinemaHallService;

@RestController
@RequestMapping("/cinemaHall")
public class CinemaHallController
{
	@Autowired
	private CinemaHallService cinemaHallService;
	@GetMapping
	public List<CinemaHall> getAllCinema()
	{
		return cinemaHallService.getAllCinema();
	}
	@GetMapping("/{chId}")
	public CinemaHall getCinemaById(@PathVariable(value="chId") int chId)
	{
		return cinemaHallService.getCinemaHallById(chId);
	}
	@PostMapping
	public CinemaHall addCinema(@RequestBody CinemaHall cinemaHall)
	{
		return cinemaHallService.addCinemaHall(cinemaHall);
	}
	@PutMapping("/{chId}")
	public CinemaHall updateCinemaHall(@RequestBody CinemaHall cinemaHall,@PathVariable(value="chId") int chId)
	{
		return cinemaHallService.updateCinemaHall(cinemaHall,chId);
	}
	@DeleteMapping("/{chId}")
	public void deleteCinemaHall(@PathVariable(value="chId") int chId)
	{
		cinemaHallService.deleteCinemaHall(chId);
	}
}
