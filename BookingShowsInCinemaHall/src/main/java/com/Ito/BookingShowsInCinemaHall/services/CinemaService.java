package com.Ito.BookingShowsInCinemaHall.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ito.BookingShowsInCinemaHall.Repo.CinemaHallRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.CinemaRepository;
import com.Ito.BookingShowsInCinemaHall.Repo.ScreenRepository;
import com.Ito.BookingShowsInCinemaHall.dto.CinemaDto;
import com.Ito.BookingShowsInCinemaHall.entity.Cinema;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaScreens;
import com.Ito.BookingShowsInCinemaHall.entity.Screen;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaException;
import com.Ito.BookingShowsInCinemaHall.exception.ScreenException;
@Service
public class CinemaService
{
	@Autowired
    private CinemaRepository cinemaRepository;
	@Autowired
	private CinemaHallRepository cinemaHallRepository;
	
	@Autowired
	private ScreenRepository screenRepository;
	public List<CinemaDto> getAllCinema() throws CinemaException
	{
		       //  List<Cinema> res = new ArrayList<>();
				List<Cinema> cini = cinemaRepository.findAll();
				if (cini.isEmpty())
					throw new CinemaException("cinema not found");
				return cini.stream().map(screen ->
				{
					CinemaDto screenDto = new CinemaDto();
					BeanUtils.copyProperties(screen, screenDto);
					return screenDto;
					
				}).collect(Collectors.toList());

	}

	public CinemaDto getCinema(int movieId) throws CinemaException 
	{
		Optional<Cinema> cinema = cinemaRepository.findById(movieId);
		if (!cinema.isPresent())
			throw new CinemaException("cinema not found");
		CinemaDto cinemaDto = new CinemaDto();
		cinemaDto.setMovieId(cinema.get().getMovieId());
		cinemaDto.setMovieName(cinema.get().getMovieName());
		cinemaDto.setMovieGenre(cinema.get().getMovieGenre());
		cinemaDto.setReleasedDate(cinema.get().getReleasedDate());
		cinemaDto.setProducer(cinema.get().getProducer());
		cinemaDto.setDirector(cinema.get().getDirector());
		return cinemaDto;

	}


	public void addCinema(Cinema cinema)
	{
		cinemaRepository.save(cinema);
		
	}

	public void updateCinema(int movieId, Cinema cinema) throws CinemaException
	{
		try {
			Optional<Cinema> ciniOptional = cinemaRepository.findById(movieId);

			ciniOptional.get().setMovieName(cinema.getMovieName());
			ciniOptional.get().setMovieGenre(cinema.getMovieGenre());
			ciniOptional.get().setReleasedDate(cinema.getReleasedDate());
			ciniOptional.get().setProducer(cinema.getProducer());
			ciniOptional.get().setDirector(cinema.getDirector());
		
			cinemaRepository.save(ciniOptional.get());
		} catch (Exception e) {
			throw new CinemaException("cinema id not found");
		}
	}
		

	public void deleteCinema(int movieId) throws CinemaException
	{
		try {
			cinemaRepository.deleteById(movieId);
		} catch (Exception e) {
			throw new CinemaException("cinema id not found");
		}
	}
    public List<CinemaDto> getCinemaBymovieName(String movieName) throws CinemaException
	{
		 
		List<Cinema> cinemas=cinemaRepository.findByMovieName(movieName);
		
		if(cinemas.isEmpty())
		
			throw new CinemaException("cinema not found");
			return cinemas.stream().map(cinema->{
				CinemaDto cinemaDto=new CinemaDto();
				BeanUtils.copyProperties(cinema, cinemaDto);
				return cinemaDto;
			}).collect(Collectors.toList());
	}

	
	
	public List<CinemaDto> getCinemaBychName(String chName) throws ScreenException
	{
		
		//res is screen dish cinema
		List<Screen> screen=screenRepository.findByChName(chName);
		if(screen.isEmpty())
		{
			throw new ScreenException("no screen found");
		}
		List<Cinema> cinemas=new ArrayList<Cinema>();
		for (Screen screen2 : screen)
                 {
			
			for (CinemaScreens cinema2 : screen2.getCinemaScreens())
                        {
				cinemas.add(cinema2.getCinema());
			}
		}	
		return cinemas.stream().map(cinema->{
			CinemaDto cinemaDto=new CinemaDto();
			BeanUtils.copyProperties(cinema, cinemaDto);
			return cinemaDto;
		}).collect(Collectors.toList());	
	}		
		
	
	/*
	 * public List<CinemaDto> getcinemaBychCity(String chCity) throws
	 * CinemaException {
	 * 
	 * List<Cinema> cinemas=cinemaRepository.findByChCity(chCity);
	 * 
	 * if(cinemas.isEmpty()) throw new CinemaException("cinema not found"); return
	 * cinemas.stream().map(cinema->{ CinemaDto cinemaDto=new CinemaDto();
	 * BeanUtils.copyProperties(cinemas, cinemaDto); return cinemaDto;
	 * }).collect(Collectors.toList()); }
	 */
}

