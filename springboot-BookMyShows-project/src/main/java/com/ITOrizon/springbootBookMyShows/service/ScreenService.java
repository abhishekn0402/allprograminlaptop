package com.ITOrizon.springbootBookMyShows.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.ITOrizon.springbootBookMyShows.dto.Screen;
import com.ITOrizon.springbootBookMyShows.exception.ResourceNotFoundException;
import com.ITOrizon.springbootBookMyShows.repo.ScreenRepository;

@Service
public class ScreenService
{
	@Autowired
	private ScreenRepository screenRepository;
	public List<Screen>  getAllScreen()
	{
		return screenRepository.findAll();
	}

	public Screen getScreenById(@PathVariable(value="screenId") int screenId)
	{
		return screenRepository.findById(screenId).orElseThrow(()-> 
		new ResourceNotFoundException("User not found with the id "+screenId));
	}

	public Screen addScreen(Screen screen) 
	{
		return this.screenRepository.save(screen);
	}


	public Screen updateScreen(Screen screen, int screenId) 
	{
		Screen existing=this.screenRepository.findById(screenId).orElseThrow(()-> 
		new ResourceNotFoundException("User not found with the id "+screenId));
	//	existing.setScreenId(screen.getScreenId());
		existing.setsCapacity(screen.getsCapacity());
		existing.setsShowDate(screen.getsShowDate());
		existing. setsShowTime(screen.getsShowTime());
		existing.setsBooked(screen.getsBooked());
		existing.setChName(screen.getChName());
		existing.setMovieName(screen.getMovieName());
	//	existing.setNoOfScreensInaDay(screen.getNoOfScreensInaDay());
		
   //existing.setScreenNumbers(screen.getScreenNumbers());
		return screenRepository.save(existing);
	}

	public void deleteScreen(@PathVariable(value="screenId") int screenId)
	{
		screenRepository.deleteById(screenId);
	}
}
