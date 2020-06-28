package com.Ito.BookingShowsInCinemaHall.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer>
{
	public List<Cinema> findByMovieName(String movieName);
	
	//public List<Cinema> findBySshowDate(Date sShowDate);
	//public List<Cinema> findByChCity(String chCity);
}
