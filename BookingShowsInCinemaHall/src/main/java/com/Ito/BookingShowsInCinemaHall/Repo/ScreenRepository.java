package com.Ito.BookingShowsInCinemaHall.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ito.BookingShowsInCinemaHall.entity.Screen;
@Repository
public interface ScreenRepository extends JpaRepository<Screen,Integer>
{
	public List<Screen> findByChName(String chName);
}
