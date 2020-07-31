package com.ITorizon.ChitraMandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITorizon.ChitraMandira.dto.Tickets;
import com.ITorizon.ChitraMandira.services.TicketsSerivce;

@RestController
public class TicketsController
{
	@Autowired
	private TicketsSerivce ticketsSerivce;
	@GetMapping("/tickets")
public List<Tickets> showTickets()
{
		return ticketsSerivce.showTickets();
}
	@PostMapping("/tickets")
	public Tickets addTickets(@RequestBody Tickets tickets)
	{
		return ticketsSerivce.addTickets(tickets);
	}
}
