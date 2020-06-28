package com.Ito.BookingShowsInCinemaHall.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Screen
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int screenId;
	 String sCapacity;
	 Date sShowDate;
	 Date sShowTime;
	 String sBooked;
	 String movieName;
	 String chName;
	 public Screen()
	 {
		 
	 }
	 @OneToMany(mappedBy = "screen", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
				CascadeType.REFRESH })
	List<CinemaScreens> cinemaScreens;

	public List<CinemaScreens> getCinemaScreens()
	{
		return cinemaScreens;
	}
	public void setCinemaScreens(List<CinemaScreens> cinemaScreens)
	{
		this.cinemaScreens = cinemaScreens;
	}
	
	
	 @OneToMany(mappedBy = "cinemaHall", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
				CascadeType.REFRESH })
	 List<CinemaHallScreen> cinemaHallScreen;
	public List<CinemaHallScreen> getCinemaHallScreen()
	{
		return cinemaHallScreen;
	}
	public void setCinemaHallScreen(List<CinemaHallScreen> cinemaHallScreen)
	{
		this.cinemaHallScreen = cinemaHallScreen;
	}
	
	
	public Screen(int screenId, String sCapacity, Date sShowDate, Date sShowTime, String sBooked, String movieName,
			String chName, List<CinemaScreens> cinemaScreens, List<CinemaHallScreen> cinemaHallScreen) {
		super();
		this.screenId = screenId;
		this.sCapacity = sCapacity;
		this.sShowDate = sShowDate;
		this.sShowTime = sShowTime;
		this.sBooked = sBooked;
		this.movieName = movieName;
		this.chName = chName;
		this.cinemaScreens = cinemaScreens;
		this.cinemaHallScreen = cinemaHallScreen;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getsCapacity() {
		return sCapacity;
	}
	public void setsCapacity(String sCapacity) {
		this.sCapacity = sCapacity;
	}
	public Date getsShowDate() {
		return sShowDate;
	}
	public void setsShowDate(Date sShowDate) {
		this.sShowDate = sShowDate;
	}
	public Date getsShowTime() {
		return sShowTime;
	}
	public void setsShowTime(Date sShowTime) {
		this.sShowTime = sShowTime;
	}
	public String getsBooked() {
		return sBooked;
	}
	public void setsBooked(String sBooked) {
		this.sBooked = sBooked;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	
}
