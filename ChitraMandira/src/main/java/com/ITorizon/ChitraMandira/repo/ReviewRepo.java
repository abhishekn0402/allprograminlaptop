package com.ITorizon.ChitraMandira.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITorizon.ChitraMandira.dto.Reviews;
@Repository
public interface ReviewRepo extends JpaRepository<Reviews, Integer>{

}
