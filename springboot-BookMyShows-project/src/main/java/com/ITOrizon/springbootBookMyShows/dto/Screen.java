package com.ITOrizon.springbootBookMyShows.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table (name="screen")
public class Screen
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="screenId")
	private int screenId;

	@Column(name="sCapacity")
	private String sCapacity;

	@Column(name="sShowDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date sShowDate;

	@Column(name="sShowTime")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date sShowTime;

	@Column(name="sBooked")
	private String sBooked;

	
	@Column(name="movieName")
	private String movieName;


	
	@Column(name="chName")
	@JoinColumn(name="screenId")
	private String chName;
	
	@OneToMany(mappedBy = "screen", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	List<NoOfScreensInaDay> noOfScreensInaDay;


	/*
	 * @Column(name="screennmubers") private int ScreenNumbers;
	 */

	public Screen(int screenId, String sCapacity, Date sShowDate, Date sShowTime, String sBooked, String movieName,
			String chName, List<NoOfScreensInaDay> noOfScreensInaDay) {
		super();
		this.screenId = screenId;
		this.sCapacity = sCapacity;
		this.sShowDate = sShowDate;
		this.sShowTime = sShowTime;
		this.sBooked = sBooked;
		this.movieName = movieName;
		this.chName = chName;
		this.noOfScreensInaDay = noOfScreensInaDay;
	}
	public List<NoOfScreensInaDay> getNoOfScreensInaDay() {
		return noOfScreensInaDay;
	}
	public void setNoOfScreensInaDay(List<NoOfScreensInaDay> noOfScreensInaDay) {
		this.noOfScreensInaDay = noOfScreensInaDay;
	}
	public int getScreenId() {
		return screenId;
	}
	public void setScreenId(int screenId) {
		this.screenId = screenId;
	}
	public String getsCapacity()
	{
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
	public String getsBooked()
	{
		return sBooked;
	}
	public void setsBooked(String sBooked)
	{
		this.sBooked = sBooked;
	}
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/*
	 * public int getScreenNumbers() { return ScreenNumbers; } public void
	 * setScreenNumbers(int screenNumbers) { ScreenNumbers = screenNumbers; }
	 */

}
