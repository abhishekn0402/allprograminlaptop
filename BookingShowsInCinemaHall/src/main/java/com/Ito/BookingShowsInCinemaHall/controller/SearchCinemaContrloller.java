package com.Ito.BookingShowsInCinemaHall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Ito.BookingShowsInCinemaHall.dto.CinemaDto;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaException;
import com.Ito.BookingShowsInCinemaHall.exception.ScreenException;
import com.Ito.BookingShowsInCinemaHall.services.CinemaService;

@RestController
public class SearchCinemaContrloller
{
	
	//private CinemaRepository cinemaRepository;
	@Autowired
	private CinemaService cinemaService;
	@GetMapping("cinemaSearchmovieName/{movieName}")
public ResponseEntity<List<CinemaDto>> searchCinemaBymovieName(@PathVariable("movieName")String movieName) throws CinemaException
{
	return new ResponseEntity<List<CinemaDto>>(cinemaService.getCinemaBymovieName(movieName),HttpStatus.FOUND);
}
	
	@GetMapping("cinemaSearchBychName/{chName}")
public ResponseEntity<List<CinemaDto>> searchCinemaBychName(@PathVariable("chName")String chName)throws CinemaException, ScreenException
{
	return new ResponseEntity<List<CinemaDto>>(cinemaService.getCinemaBychName(chName),HttpStatus.FOUND);
}
	
	
	
/*
 * @GetMapping("cinemaSearchBysShowDate/{sShowDate}") public
 * ResponseEntity<List<CinemaDto>>
 * searchCinemaBysShowDate(@PathVariable("sShowDate")String sShowDate)throws
 * CinemaException { return new
 * ResponseEntity<List<CinemaDto>>(cinemaService.getCinemaBySshowDate(sShowDate)
 * ,HttpStatus.FOUND); }
 */
/*
 * @GetMapping("cinemaSearchBychCity/{chCity}") public
 * ResponseEntity<List<CinemaDto>>
 * searchcinemaBychCity(@PathVariable("chCity")String chCity)throws
 * CinemaException { return new
 * ResponseEntity<List<CinemaDto>>(cinemaService.getcinemaBychCity(chCity),
 * HttpStatus.FOUND); }
 */
	
	
}
