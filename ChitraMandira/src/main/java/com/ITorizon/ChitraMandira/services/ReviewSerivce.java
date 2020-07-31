package com.ITorizon.ChitraMandira.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ITorizon.ChitraMandira.dto.Reviews;
import com.ITorizon.ChitraMandira.repo.ReviewRepo;
@Service
public class ReviewSerivce
{
	@Autowired
private ReviewRepo reviewRepo;
	public List<Reviews> showReview()
	{
		// TODO Auto-generated method stub
		return reviewRepo.findAll();
	}
	public Reviews addReview(Reviews reviews)
	{
		// TODO Auto-generated method stub
		return reviewRepo.save(reviews);
	}
	

}
