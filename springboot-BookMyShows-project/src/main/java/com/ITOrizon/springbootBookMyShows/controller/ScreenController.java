package com.ITOrizon.springbootBookMyShows.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ITOrizon.springbootBookMyShows.dto.Screen;
import com.ITOrizon.springbootBookMyShows.service.ScreenService;

@RestController
@RequestMapping("/screen")
public class ScreenController
{
	@Autowired
	private ScreenService screenService;
	
	@GetMapping
	public List<Screen> getAllScreen()
	{
		return screenService.getAllScreen();
	}
	@GetMapping("/{screenId }")
	public Screen getScreenById(@PathVariable(value="screenId") int screenId )
	{
		return screenService.getScreenById(screenId );
	}
	@PostMapping
	public Screen addScreen(@RequestBody Screen screen)
	{
		return screenService.addScreen(screen);
	}
	@PutMapping("/{screenId}")
	public Screen updateScreen(@RequestBody Screen screen,@PathVariable(value="screenId") int screenId)
	{
		return screenService.updateScreen(screen,screenId);
	}
	@DeleteMapping("/{screenId}")
	public void deleteScreen(@PathVariable(value="movieId") int screenId)
	{
		screenService.deleteScreen(screenId);
	}
}
