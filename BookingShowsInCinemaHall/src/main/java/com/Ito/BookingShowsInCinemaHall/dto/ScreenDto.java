package com.Ito.BookingShowsInCinemaHall.dto;

import java.sql.Time;
import java.util.Date;

public class ScreenDto
{
	private int screenId;
	private String sCapacity;
	private Date sShowDate;
	private Date sShowTime;
	private String sBooked;
	private String movieName;
	private String chName;
	public ScreenDto(int screenId, String sCapacity, Date sShowDate, Date sShowTime, String sBooked, String movieName,
			String chName) {
		super();
		this.screenId = screenId;
		this.sCapacity = sCapacity;
		this.sShowDate = sShowDate;
		this.sShowTime = sShowTime;
		this.sBooked = sBooked;
		this.movieName = movieName;
		this.chName = chName;
	}
	public ScreenDto() {
		super();
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
