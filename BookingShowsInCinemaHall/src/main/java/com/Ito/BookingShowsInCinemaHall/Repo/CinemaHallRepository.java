package com.Ito.BookingShowsInCinemaHall.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaHall;
@Repository
public interface CinemaHallRepository extends JpaRepository<CinemaHall,Integer>
{
	
}
