package com.Ito.BookingShowsInCinemaHall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ito.BookingShowsInCinemaHall.dto.BookingDto;
import com.Ito.BookingShowsInCinemaHall.dto.CinemaDto;
import com.Ito.BookingShowsInCinemaHall.entity.Booking;
import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
import com.Ito.BookingShowsInCinemaHall.exception.BookingException;
import com.Ito.BookingShowsInCinemaHall.services.BookingService;
@RestController
public class BookingController 
{
	@Autowired
	private BookingService bookingService;

	/*
	 * public ResponseEntity<List<Cinema>> moviesBetweenDates(@RequestBody
	 * BookingDto bookingDto) throws BookingException {
	 * 
	 * return new
	 * ResponseEntity<>(bookingService.moviesBetweenDates(bookingDto.startDate,
	 * bookingDto.endDate,bookingDto.movieName)); }
	 */@PostMapping("/booking")
		public ResponseEntity<String> bookingCinemaById(@RequestBody BookingDto bookingDto) 
		{
			return new ResponseEntity<>(bookingService.bookingCinemaById(bookingDto),HttpStatus.ACCEPTED);
		}
		
		@DeleteMapping("/booking/{id}")
		public ResponseEntity<String> deletingBookedCinemaById(@PathVariable String id) throws BookingException
		{
			return new ResponseEntity<>(bookingService.deletingBookedCinemaById(id),HttpStatus.ACCEPTED);
		}
		
		@GetMapping("/booking/{id}")
		public ResponseEntity<Booking> getBookUsingId(@PathVariable String id) throws BookingException
		{
			return new ResponseEntity<>(bookingService.getBookUsingId(id),HttpStatus.FOUND);
		}

		
		@GetMapping("/booking_name/{id}")
		public ResponseEntity<Booking> getBookByUsingName(@PathVariable String id) throws BookingException
		{
			return new ResponseEntity<>(bookingService.getBookByUsingName(id),HttpStatus.FOUND);
		}
		
		@GetMapping("/booking_contact/{id}")
		public ResponseEntity<Booking> getBookByUsingContact(@PathVariable long id) throws BookingException
		{
			return new ResponseEntity<>(bookingService.getBookByUsingContact(id),HttpStatus.FOUND);
		}
		@GetMapping("/booking_email/{id}")
		public ResponseEntity<Booking> getBookByUsingEmail(@PathVariable String id) throws BookingException
		{
			return new ResponseEntity<>(bookingService.getBookByUsingEmail(id),HttpStatus.FOUND);
		}
		
		@PutMapping("/booking/{id}")
		public ResponseEntity<Booking> editBookUsingId(@PathVariable String id,@RequestBody BookingDto bookingDto) throws BookingException
		{
			return new ResponseEntity<>(bookingService.editBookUsingId(id,bookingDto),HttpStatus.FOUND);
		}

}
