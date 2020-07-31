package com.ITorizon.ChitraMandira.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ITorizon.ChitraMandira.dto.Reviews;
import com.ITorizon.ChitraMandira.services.ReviewSerivce;

@RestController
public class ReviewController
{
	@Autowired
	private ReviewSerivce reviewSerivce;
	@GetMapping("/review")
	public List<Reviews> showReview()
	{
		return reviewSerivce.showReview();
	}
	@PostMapping("/review")
	public Reviews addReview(@RequestBody Reviews reviews)
	{
		return reviewSerivce.addReview(reviews);
	}
}
