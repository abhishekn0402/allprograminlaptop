package com.ITorizon.ChitraMandira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITorizon.ChitraMandira.dto.Tickets;
import com.ITorizon.ChitraMandira.repo.TicketsRepo;
@Service
public class TicketsSerivce
{
	@Autowired
	private TicketsRepo ticketsRepo;
	public List<Tickets> showTickets()
	{

		return ticketsRepo.findAll();
	}
	public Tickets addTickets(Tickets tickets)
	{
		// TODO Auto-generated method stub
		return ticketsRepo.save(tickets);
	}

}
