package com.Ito.BookingShowsInCinemaHall.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class CinemaHallScreen
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)	
int cinemaHallScreenId;

@ManyToOne
Screen screen;

@ManyToOne
CinemaHall cinemaHall;

public int getCinemaHallScreenId() {
	return cinemaHallScreenId;
}

public void setCinemaHallScreenId(int cinemaHallScreenId) {
	this.cinemaHallScreenId = cinemaHallScreenId;
}



public Screen getScreen() {
	return screen;
}

public void setScreen(Screen screen) {
	this.screen = screen;
}

public CinemaHall getCinemaHall() {
	return cinemaHall;
}

public void setCinemaHall(CinemaHall cinemaHall) {
	this.cinemaHall = cinemaHall;
}


}
