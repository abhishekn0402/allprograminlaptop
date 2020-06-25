package com.ITOrizon.springbootBookMyShows.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITOrizon.springbootBookMyShows.dto.CinemaHall;
@Repository
public interface CinemaHallRepository extends JpaRepository<CinemaHall,Integer>
{

}
