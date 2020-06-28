package com.Ito.BookingShowsInCinemaHall.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ito.BookingShowsInCinemaHall.Repo.CinemaHallRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.CinemaHallScreenRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.CinemaRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.CinemaScreensRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.ScreenRepository;
import com.Ito.BookingShowsInCinemaHall.dto.ScreenDto;
import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaHall;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaHallScreen;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaScreens;
import com.Ito.BookingShowsInCinemaHall.entity.Screen;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaException;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaHallException;
import com.Ito.BookingShowsInCinemaHall.exception.ScreenException;

@Service
public class ScreenService
{
	@Autowired
     ScreenRepository screenRepository;
	@Autowired
	CinemaRepository cinemaRepository;
	@Autowired
	CinemaScreensRepository cinemaScreensRepository;
	@Autowired
	CinemaHallRepository cinemaHallRepository;
	@Autowired
	CinemaHallScreenRepository cinemaHallScreenRepository;
	
	public List<ScreenDto> getAllScreen() throws ScreenException
	{
		List<Screen> screens = screenRepository.findAll();

		if(screens.isEmpty())
			
			throw new ScreenException("Dish not found");
			return screens.stream().map(screen ->
			{
				ScreenDto screenDto=new ScreenDto();
				BeanUtils.copyProperties(screen, screenDto);
				return screenDto;
			}).collect(Collectors.toList());

	}


	public void addScreen(Screen screen)
	{
		screenRepository.save(screen);
		}


	public void addScreenToCinema(int movieId, int screenId)
	{
		try {
			Optional<Cinema> cinema=cinemaRepository.findById(movieId);
			if(!cinema.isPresent())
				throw new CinemaException("Restaurant not found");
			Optional<Screen> screen=screenRepository.findById(screenId);
			if(!screen.isPresent())
				throw new ScreenException("Dish not found to add to restaurant");
			CinemaScreens cinemaScreens=new CinemaScreens();
			cinemaScreens.setScreen(screen.get());
			cinemaScreens.setCinema(cinema.get());
		
		//	restaurant.get().setDishes(dishes);
			
		cinemaScreensRepository.save(cinemaScreens);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}
	public void addScreenToCinemaHall(int chId, int screenId)
	{
		try {
			Optional<CinemaHall> cinemaHall=cinemaHallRepository.findById(chId);
			if(!cinemaHall.isPresent())
				throw new CinemaHallException("Restaurant not found");
			Optional<Screen> screen=screenRepository.findById(screenId);
			if(!screen.isPresent())
				throw new ScreenException("Dish not found to add to restaurant");
			CinemaHallScreen cinemaHallScreen=new CinemaHallScreen();
			cinemaHallScreen.setScreen(screen.get());
			cinemaHallScreen.setCinemaHall(cinemaHall.get());
		
		//	restaurant.get().setDishes(dishes);
			
		cinemaHallScreenRepository.save(cinemaHallScreen);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
	}
	


	public void updateScreen(int screenId, Screen screen) throws ScreenException
	{
		Optional<Screen> screenOptional=screenRepository.findById(screenId);
		if(!screenOptional.isPresent())
			throw new ScreenException("Dish not found to update");
		screenOptional.get().setsCapacity(screen.getsCapacity());
		screenOptional.get().setsShowDate(screen.getsShowDate());
		screenOptional.get().setsShowTime(screen.getsShowTime());
		screenOptional.get().setsBooked(screen.getsBooked());
		screenOptional.get().setMovieName(screen.getMovieName());
		screenOptional.get().setChName(screen.getChName());
		screenRepository.save(screenOptional.get());
		
	}


	public void deleteScreen(int screenId) throws ScreenException
	{
		try {
			screenRepository.deleteById(screenId);
			}
			catch(Exception e)
			{
				throw new ScreenException("invalid dish id");
			}
	}


	
	
		
}

