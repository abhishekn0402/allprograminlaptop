package com.Ito.BookingShowsInCinemaHall.dto;

public class CinemaHallDto
{
    private int chId;
	private String chName;
	private String chCity;
	private String chState;
	private String chCountry;
	public CinemaHallDto(int chId, String chName, String chCity, String chState, String chCountry) {
		super();
		this.chId = chId;
		this.chName = chName;
		this.chCity = chCity;
		this.chState = chState;
		this.chCountry = chCountry;
	}
	public CinemaHallDto() {
		super();
	}
	public int getChId() {
		return chId;
	}
	public void setChId(int chId) {
		this.chId = chId;
	}
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public String getChCity() {
		return chCity;
	}
	public void setChCity(String chCity) {
		this.chCity = chCity;
	}
	public String getChState() {
		return chState;
	}
	public void setChState(String chState) {
		this.chState = chState;
	}
	public String getChCountry() {
		return chCountry;
	}
	public void setChCountry(String chCountry) {
		this.chCountry = chCountry;
	}
	
}
