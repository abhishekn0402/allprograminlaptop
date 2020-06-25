package com.ITOrizon.springbootBookMyShows.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ITOrizon.springbootBookMyShows.dto.CinemaHall;
import com.ITOrizon.springbootBookMyShows.exception.ResourceNotFoundException;
import com.ITOrizon.springbootBookMyShows.repo.CinemaHallRepository;

@Service
public class CinemaHallService
{
	@Autowired
	private CinemaHallRepository cinemaHallRepository;
	public List<CinemaHall> getAllCinema()
	{
		return cinemaHallRepository.findAll();
	}
	public CinemaHall getCinemaHallById(@PathVariable(value="chId") int chId)
	{
		return cinemaHallRepository.findById(chId).orElseThrow(()-> 
		new ResourceNotFoundException("CinemaHall not found with the id "+chId));
	}

	public CinemaHall addCinemaHall(CinemaHall cinemaHall) 
	{
		return this.cinemaHallRepository.save(cinemaHall);
	}
	public CinemaHall updateCinemaHall(CinemaHall cinemaHall, int chId)
	{
		
		CinemaHall existing=this.cinemaHallRepository.findById(chId).orElseThrow(()-> 
		new ResourceNotFoundException("CinemaHall not found with the id "+chId));
		existing.setChId(cinemaHall.getChId());
		existing.setChCity(cinemaHall.getChCity());
		existing.setChState(cinemaHall.getChState());
		existing. setChCountry(cinemaHall.getChCountry());
		//existing.setScreenNumbers(cinemaHall.getScreenNumbers());
		
		
		return this.cinemaHallRepository.save(existing);
	}
	public void deleteCinemaHall(int chId)
	{
		
		cinemaHallRepository.deleteById(chId);
	}
}
