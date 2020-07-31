package com.ITorizon.ChitraMandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITorizon.ChitraMandira.dto.Theatre;
import com.ITorizon.ChitraMandira.services.TheatreService;

@RestController
public class TheatreController
{
	@Autowired
private TheatreService theatreService;
	@GetMapping("/theatre")
	public List<Theatre> showTheatre()
	{
		return theatreService.showTheatre();
	}
	@PostMapping("/theatre")
	public Theatre addTheatre(@RequestBody Theatre theatre)
	{
		return theatreService.addTheatre(theatre);
	}
}
