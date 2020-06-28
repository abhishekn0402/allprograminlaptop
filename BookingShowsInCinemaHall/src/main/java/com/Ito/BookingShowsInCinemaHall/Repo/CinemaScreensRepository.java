package com.Ito.BookingShowsInCinemaHall.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ito.BookingShowsInCinemaHall.entity.CinemaScreens;
@Repository
public interface CinemaScreensRepository extends JpaRepository<CinemaScreens,Integer>
{

}
