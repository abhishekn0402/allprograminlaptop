package com.ITorizon.ChitraMandira.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITorizon.ChitraMandira.dto.Movie;
@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer>
{

}
