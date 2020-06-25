package com.ITOrizon.springbootBookMyShows.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name="cinemahall")
public class CinemaHall
{
	
	@Id
	@Column(name="chId")
	private int chId;
	
	@Column(name="chName")
	private String chName;
	
	@Column(name="chCity")
	private String chCity;
	
	@Column(name="chState")
	private String chState;
	
	@Column(name="chCountry")
	private String chCountry;
	
	@OneToMany(mappedBy = "cinemahall", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	List<NoOfScreensInaDay> noOfScreensInaDay;

	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name = "chid") private List<Screen> screenNumbers;
	 */
	public CinemaHall() {
	}
	
	

	public CinemaHall(int chId, String chName, String chCity, String chState, String chCountry,
			List<NoOfScreensInaDay> noOfScreensInaDay) {
		super();
		this.chId = chId;
		this.chName = chName;
		this.chCity = chCity;
		this.chState = chState;
		this.chCountry = chCountry;
		this.noOfScreensInaDay = noOfScreensInaDay;
	}
	public String getChName() {
		return chName;
	}
	
	public void setChName(String chName) {
		this.chName = chName;
	}
	public int getChId() {
		return chId;
	}
	public void setChId(int chId) {
		this.chId = chId;
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
	/*
	 * public List<Screen> getScreenNumbers() { return screenNumbers; } public void
	 * setScreenNumbers(List<Screen> screenNumbers) { this.screenNumbers =
	 * screenNumbers; }
	 */
	public List<NoOfScreensInaDay> getNoOfScreensInaDay() {
		return noOfScreensInaDay;
	}
	public void setNoOfScreensInaDay(List<NoOfScreensInaDay> noOfScreensInaDay) {
		this.noOfScreensInaDay = noOfScreensInaDay;
	}

}
