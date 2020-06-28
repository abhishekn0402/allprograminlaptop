package com.Ito.BookingShowsInCinemaHall.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ito.BookingShowsInCinemaHall.entity.CinemaHallScreen;
@Repository
public interface CinemaHallScreenRepository extends JpaRepository<CinemaHallScreen,Integer>
{

}
