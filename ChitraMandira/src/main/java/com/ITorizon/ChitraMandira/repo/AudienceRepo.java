package com.ITorizon.ChitraMandira.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITorizon.ChitraMandira.dto.Audience;
@Repository
public interface AudienceRepo extends JpaRepository<Audience, Integer>
{

}
