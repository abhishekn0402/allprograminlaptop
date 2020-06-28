package com.Ito.BookingShowsInCinemaHall.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ito.BookingShowsInCinemaHall.Repo.CinemaHallRepository;
import com.Ito.BookingShowsInCinemaHall.dto.CinemaHallDto;
import com.Ito.BookingShowsInCinemaHall.entity.CinemaHall;
import com.Ito.BookingShowsInCinemaHall.exception.CinemaHallException;

@Service
public class CinemaHallService
{
	@Autowired
private CinemaHallRepository cinemaHallRepository;
	public List<CinemaHallDto> getAllCinemaHall() throws CinemaHallException 
	{
		 //  List<Cinema> res = new ArrayList<>();
		List<CinemaHall> cinihall = cinemaHallRepository.findAll();
		if (cinihall.isEmpty())
			throw new CinemaHallException("cinema not found");
		return cinihall.stream().map(screen ->
		{
			CinemaHallDto screenDto = new CinemaHallDto();
			BeanUtils.copyProperties(screen, screenDto);
			return screenDto;
			
		}).collect(Collectors.toList());

	}

	public CinemaHallDto getCinemaHall(int chId) throws CinemaHallException
	{
		
		Optional<CinemaHall> cinemaHall = cinemaHallRepository.findById(chId);
		if (!cinemaHall.isPresent())
			throw new CinemaHallException("cinemaHall not found");
		CinemaHallDto cinemaHallDto = new CinemaHallDto();
		cinemaHallDto.setChName(cinemaHall.get().getChName());
		cinemaHallDto.setChCity(cinemaHall.get().getChCity());
		cinemaHallDto.setChState(cinemaHall.get().getChState());
		cinemaHallDto.setChCountry(cinemaHall.get().getChCountry());
		return cinemaHallDto;
	}

	public void addCinemaHall(CinemaHall cinemaHall) {
		cinemaHallRepository.save(cinemaHall);
		
	}

	public void updateCinemaHall(int chId, CinemaHall cinemaHall) throws CinemaHallException
	{
		try {
			Optional<CinemaHall> ciniHallOptional = cinemaHallRepository.findById(chId);

			ciniHallOptional.get().setChName(cinemaHall.getChName());
			ciniHallOptional.get().setChCity(cinemaHall.getChCity());
			ciniHallOptional.get().setChState(cinemaHall.getChState());
			ciniHallOptional.get().setChCountry(cinemaHall.getChCountry());
		
		
			cinemaHallRepository.save(ciniHallOptional.get());
			
		} catch (Exception e) {
			throw new CinemaHallException("cinemaHall id not found");
		}	
		
	}

	public void deleteCinemaHall(int chId) throws CinemaHallException {
		try {
			cinemaHallRepository.deleteById(chId);
		} catch (Exception e) {
			throw new CinemaHallException("cinemaHall id not found");
		}
		
	}

}
