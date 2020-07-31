package com.ITorizon.ChitraMandira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITorizon.ChitraMandira.dto.Audience;
import com.ITorizon.ChitraMandira.repo.AudienceRepo;

@Service
public class AudienceService
{
	@Autowired
	private AudienceRepo audienceRepo;
	public List<Audience> showAudience()
	{
		return audienceRepo.findAll();
	}
	public Audience addAudience(Audience audience)
	{
		// TODO Auto-generated method stub
		return audienceRepo.save(audience);
	}
   
}
