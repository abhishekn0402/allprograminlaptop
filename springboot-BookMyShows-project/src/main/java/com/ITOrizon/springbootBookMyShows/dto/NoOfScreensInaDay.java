package com.ITOrizon.springbootBookMyShows.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="noofscreensinaday")
public class NoOfScreensInaDay
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int id;
	
	@ManyToOne
	private CinemaHall cinemahall;
	
	@ManyToOne
	 Screen screen;
	
	@ManyToOne
	 Cinema cinema;
	
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public Screen getScreen()
	{
		return screen;
	}
	public void setScreen(Screen screen)
	{
		this.screen = screen;
	}
	public CinemaHall getCinemaHall()
	{
		return cinemahall;
	}
	public void setCinemaHall(CinemaHall cinemaHall)
	{
		this.cinemahall = cinemaHall;
	}
	public Cinema getCinema()
	{
		return cinema;
	}
	public void setCinema(Cinema cinema)
	{
		this.cinema = cinema;
	}

}
