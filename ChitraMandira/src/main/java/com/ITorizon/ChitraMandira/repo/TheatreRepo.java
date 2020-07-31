package com.ITorizon.ChitraMandira.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITorizon.ChitraMandira.dto.Theatre;
@Repository
public interface TheatreRepo extends JpaRepository<Theatre, Integer>
{

}
