package com.Ito.BookingShowsInCinemaHall.services;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ito.BookingShowsInCinemaHall.Repo.BookingRepository;
import com.Ito.BookingShowsInCinemaHall.dto.BookingDto;
import com.Ito.BookingShowsInCinemaHall.dto.CinemaDto;
import com.Ito.BookingShowsInCinemaHall.entity.Booking;
import com.Ito.BookingShowsInCinemaHall.exception.BookingException;

@Service
public class BookingService
{
	@Autowired
private BookingRepository bookingRepository;
	public String bookingCinemaById(BookingDto bookingDto) {
		
		try {
			Booking booking =new Booking();
			
			BeanUtils.copyProperties(bookingDto, booking);
			booking.setDate(new Date());
			booking.setContactNo(bookingDto.getContactNo());
			booking.setCustomerName(bookingDto.getCustomerName());
			booking.setMovieName(bookingDto.getMovieName());
			booking.setBookingId(UUID.randomUUID().toString().substring(0, 8));
			bookingRepository.save(booking);
			return booking.getBookingId();
			}
			catch(Exception e)
			{
				return "something went wrong";
			}
			
	}

	public String deletingBookedCinemaById(String id) throws BookingException
	{
		Optional<Booking> booking=bookingRepository.findById(id);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		bookingRepository.deleteById(id);
		return "deleted successfully";
	}

	public Booking getBookUsingId(String id) throws BookingException {
		Optional<Booking> booking=bookingRepository.findById(id);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		return booking.get();
	}

	public Booking getBookByUsingName(String name) throws BookingException {
		Optional<Booking> booking=bookingRepository.findByEmail(name);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		return booking.get();
	}

	public Booking getBookByUsingContact(long contact) throws BookingException {
		Optional<Booking> booking=bookingRepository.findByContactNo(contact);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		return booking.get();
	}

	public Booking getBookByUsingEmail(String email) throws BookingException {
		Optional<Booking> booking=bookingRepository.findByChName(email);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		return booking.get();
	}

	public Booking editBookUsingId(String id,BookingDto bookingDto) throws BookingException
	{
		Optional<Booking> booking=bookingRepository.findById(id);
		if(!booking.isPresent())
			throw new BookingException("invalid booking id");
		booking.get().setChName(bookingDto.getChName());
		booking.get().setContactNo(bookingDto.getContactNo());
		booking.get().setCustomerName(bookingDto.getCustomerName());
		booking.get().setDate(bookingDto.getDate());
		booking.get().setEmail(bookingDto.getEmail());
		booking.get().setMovieName(bookingDto.getMovieName());
		booking.get().setStartDate(bookingDto.getStartDate());
		booking.get().setEndDate(bookingDto.getEndDate());
		return booking.get();
	}

	/*
	 * public Booking moviesBetweenDates(Date startDate, Date endDate,String
	 * movieName) throws BookingException { return
	 * bookingRepository.findByStartDateEndDate(startDate,endDate,movieName);
	 * 
	 * }
	 */

}
