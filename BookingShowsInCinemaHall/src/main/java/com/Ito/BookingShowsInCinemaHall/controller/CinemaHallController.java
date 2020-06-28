package com.Ito.BookingShowsInCinemaHall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Ito.BookingShowsInCinemaHall.dto.CinemaHallDto;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaHall;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaException;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaHallException;
import com.Ito.BookingShowsInCinemaHall.services.CinemaHallService;

@RestController
public class CinemaHallController
{
	@Autowired
	private CinemaHallService cinemaHallService;
	@GetMapping("/cinemahall")
	public ResponseEntity<List<CinemaHallDto>> getAllCinemaHall() throws  CinemaHallException {
		return new ResponseEntity<List<CinemaHallDto>>(cinemaHallService.getAllCinemaHall(), HttpStatus.FOUND);
	}

	@GetMapping("/cinemahall/{chId}")
	public ResponseEntity<CinemaHallDto> getCinemaHall(@PathVariable int chId) throws CinemaHallException {
		return new ResponseEntity<CinemaHallDto>(cinemaHallService.getCinemaHall(chId), HttpStatus.FOUND);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/cinemahall")
	public ResponseEntity<String> addCinemaHall(@RequestBody CinemaHall cinemaHall) {
		cinemaHallService.addCinemaHall(cinemaHall);
		return new ResponseEntity<String>("Restaurant added successfully", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/cinemahall/{chId}")
	public ResponseEntity<String> updateCinemaHall(@RequestBody CinemaHall cinemaHall, @PathVariable int chId)
			throws CinemaException, CinemaHallException {
		cinemaHallService.updateCinemaHall(chId, cinemaHall);
		return new ResponseEntity<String>("Restaurant updated successfully", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/cinemahall/{chId}")
	public ResponseEntity<String> deleteCinemaHall(@PathVariable int chId) throws CinemaHallException {
		cinemaHallService.deleteCinemaHall(chId);
		return new ResponseEntity<String>("Restaurant deleted successfully", HttpStatus.ACCEPTED);
	}
}
