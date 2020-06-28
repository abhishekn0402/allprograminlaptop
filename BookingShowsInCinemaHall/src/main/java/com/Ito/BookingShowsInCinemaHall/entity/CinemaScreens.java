package com.Ito.BookingShowsInCinemaHall.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class CinemaScreens
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int cinemaScreensid;
	@ManyToOne
	Cinema cinema;
	@ManyToOne
	Screen screen;
	
	public int getCinemaScreensid() {
		return cinemaScreensid;
	}
	public void setCinemaScreensid(int cinemaScreensid) {
		this.cinemaScreensid = cinemaScreensid;
	}
	public Cinema getCinema() {
		return cinema;
	}
	public void setCinema(Cinema cinema) {
		this.cinema = cinema;
	}
	public Screen getScreen() {
		return screen;
	}
	public void setScreen(Screen screen) {
		this.screen = screen;
	}
	
}
