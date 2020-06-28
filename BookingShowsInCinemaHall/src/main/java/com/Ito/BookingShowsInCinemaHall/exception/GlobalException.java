package com.Ito.BookingShowsInCinemaHall.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class GlobalException extends ResponseEntityExceptionHandler
{
	@ExceptionHandler(CinemaException.class)
	public ResponseEntity<ErrorResponse> cinemaError(CinemaException cinemaException)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessage(cinemaException.getMessage());
		errorResponse.setCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(CinemaHallException.class)
	public ResponseEntity<ErrorResponse> cinemaHallError(CinemaHallException cinemaHallException)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessage(cinemaHallException.getMessage());
		errorResponse.setCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(ScreenException.class)
	public ResponseEntity<ErrorResponse> screenError(ScreenException screenException)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessage(screenException.getMessage());
		errorResponse.setCode(HttpStatus.NOT_FOUND.value());
		
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(BookingException.class)
	public ResponseEntity<ErrorResponse> BookingError(BookingException bookingException)
	{
		ErrorResponse errorResponse=new ErrorResponse();
		errorResponse.setMessage(bookingException.getMessage());
		errorResponse.setCode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}

}
