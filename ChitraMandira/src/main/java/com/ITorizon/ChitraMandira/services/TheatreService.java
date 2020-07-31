package com.ITorizon.ChitraMandira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITorizon.ChitraMandira.dto.Theatre;
import com.ITorizon.ChitraMandira.repo.TheatreRepo;
@Service
public class TheatreService
{
	@Autowired
private TheatreRepo theatreRepo;
	public List<Theatre> showTheatre()
	{
		return theatreRepo.findAll();
	}
	public Theatre addTheatre(Theatre theatre)
	{
		
		return theatreRepo.save(theatre);
	}

}
