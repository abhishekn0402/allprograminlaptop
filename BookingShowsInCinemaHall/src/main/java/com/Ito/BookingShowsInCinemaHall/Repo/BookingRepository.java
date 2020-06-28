package com.Ito.BookingShowsInCinemaHall.Repo;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ito.BookingShowsInCinemaHall.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,String>
{
	Optional<Booking> findByEmail(String email);

	Optional<Booking> findByContactNo(long contact);
	
	Optional<Booking> findByChName(String name);
	
	//Optional<Booking> findByStartDateEndDate(Date startDate,Date endDate,String movieName);
}
