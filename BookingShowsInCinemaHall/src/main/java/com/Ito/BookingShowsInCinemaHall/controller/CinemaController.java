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

import com.Ito.BookingShowsInCinemaHall.dto.CinemaDto;
import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaException;
import com.Ito.BookingShowsInCinemaHall.services.CinemaService;
@RestController
public class CinemaController
{
	@Autowired
	private CinemaService cinemaService;

	@GetMapping("/cinema")
	public ResponseEntity<List<CinemaDto>> getAllCinema() throws CinemaException {
		return new ResponseEntity<List<CinemaDto>>(cinemaService.getAllCinema(), HttpStatus.FOUND);
	}

	@GetMapping("/cinema/{movieId}")
	public ResponseEntity<CinemaDto> getCinema(@PathVariable int movieId) throws CinemaException {
		return new ResponseEntity<CinemaDto>(cinemaService.getCinema(movieId), HttpStatus.FOUND);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/cinema")
	public ResponseEntity<String> addCinema(@RequestBody Cinema cinema) {
		cinemaService.addCinema(cinema);
		return new ResponseEntity<String>("cinema added successfully", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/cinema/{movieId}")
	public ResponseEntity<String> updateCinema(@RequestBody Cinema cinema, @PathVariable int movieId)
			throws CinemaException {
		cinemaService.updateCinema(movieId, cinema);
		return new ResponseEntity<String>("cinema updated successfully", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/cinema/{movieId}")
	public ResponseEntity<String> deleteCinema(@PathVariable int movieId) throws CinemaException {
		cinemaService.deleteCinema(movieId);
		return new ResponseEntity<String>("cinema deleted successfully", HttpStatus.ACCEPTED);
	}
}
