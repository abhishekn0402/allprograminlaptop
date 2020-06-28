package com.Ito.BookingShowsInCinemaHall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Ito.BookingShowsInCinemaHall.dto.ScreenDto;
import com.Ito.BookingShowsInCinemaHall.entity.Screen;
import com.Ito.BookingShowsInCinemaHall.exception.ScreenException;
import com.Ito.BookingShowsInCinemaHall.services.ScreenService;

@RestController
public class ScreenController
{
	@Autowired
	private ScreenService screenService;
	@RequestMapping("/screens")
	public ResponseEntity<List<ScreenDto>> getAllDish() throws ScreenException {
		return new ResponseEntity<List<ScreenDto>>(screenService.getAllScreen(), HttpStatus.FOUND);
	}
	
	
	@PostMapping("/screens")
	public ResponseEntity<String> addScreen(@RequestBody Screen screen) {
		screenService.addScreen(screen);
		return new ResponseEntity<String>("screen added Successfully", HttpStatus.ACCEPTED);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/screen/{screenId}/cinema/{movieId}")
	public ResponseEntity<String> addScreenToCinema(@PathVariable("movieId") int movieId, @PathVariable("screenId") int screenId) {
		screenService.addScreenToCinema(movieId, screenId);
		return new ResponseEntity<String>("screen Successfully added to cinema", HttpStatus.ACCEPTED);
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/screen/{screenId}/cinemahall/{chId}")
	public ResponseEntity<String> addScreenToCinemaHall(@PathVariable("chId") int chId, @PathVariable("screenId") int screenId) {
		screenService.addScreenToCinemaHall(chId, screenId);
		return new ResponseEntity<String>("screen Successfully added to cinemaHall", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/screen/{movieId}/screen/{screenId}")
	public ResponseEntity<String> updateScreen(@RequestBody Screen screen, @PathVariable int screenId)
			throws ScreenException {
		screenService.updateScreen(screenId, screen);
		return new ResponseEntity<String>("screen Updated Successfully", HttpStatus.ACCEPTED);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/screen/{screenId}")
	public ResponseEntity<String> deleteScreen(@PathVariable int screenId) throws ScreenException {
		screenService.deleteScreen(screenId);
		return new ResponseEntity<String>("screen deleted Successfully", HttpStatus.ACCEPTED);
	}
}
