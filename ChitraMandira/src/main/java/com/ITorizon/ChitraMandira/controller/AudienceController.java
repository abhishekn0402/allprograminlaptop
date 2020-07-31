package com.ITorizon.ChitraMandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITorizon.ChitraMandira.dto.Audience;
import com.ITorizon.ChitraMandira.services.AudienceService;

@RestController
public class AudienceController 
{
	@Autowired
	private AudienceService audienceService;
	@GetMapping("/audience")
	public List<Audience> showAudience()
	{
		return audienceService.showAudience();
	}
	@PostMapping("/audience")
	public Audience addAudience(@RequestBody Audience audience)
	{
		return audienceService.addAudience(audience);
	}
}
