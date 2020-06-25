package com.ITOrizon.springbootBookMyShows.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITOrizon.springbootBookMyShows.dto.Cinema;
@Repository
public interface CinemaRepository extends JpaRepository<Cinema,Integer>
{

}
