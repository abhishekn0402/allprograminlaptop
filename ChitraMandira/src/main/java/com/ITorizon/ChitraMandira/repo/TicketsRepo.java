package com.ITorizon.ChitraMandira.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ITorizon.ChitraMandira.dto.Tickets;
@Repository
public interface TicketsRepo extends JpaRepository<Tickets, Integer>
{

}
