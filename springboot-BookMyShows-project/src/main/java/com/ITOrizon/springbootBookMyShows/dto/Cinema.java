package com.ITOrizon.springbootBookMyShows.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table (name="cinema")
public class Cinema 
{
	@Id
	@Column(name="movieId")
	private int movieId;

	@Column(name="movieName")
	private String movieName;

	@Column(name="movieGenre")
	private String movieGenre;

	@Column(name="releasedDate")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date releasedDate;

	@Column(name="producer")
	private String producer;

	@Column(name="director")
	private String director;
	
	@OneToMany(mappedBy = "cinema", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
	
			CascadeType.REFRESH })
	List<NoOfScreensInaDay> noOfScreensInaDay;

	public Cinema()
	{

	}

	public Cinema(int movieId, String movieName, String movieGenre, Date releasedDate, String producer, String director,
			List<NoOfScreensInaDay> noOfScreensInaDay)
	{
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.releasedDate = releasedDate;
		this.producer = producer;
		this.director = director;
		this.noOfScreensInaDay = noOfScreensInaDay;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public Date getReleasedDate() {
		return releasedDate;
	}

	public void setReleasedDate(Date releasedDate) {
		this.releasedDate = releasedDate;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director)
	{
		this.director = director;
	}
    
	public List<NoOfScreensInaDay> getNoOfScreensInaDay()
	{
		return noOfScreensInaDay;
	}
	public void setNoOfScreensInaDay(List<NoOfScreensInaDay> noOfScreensInaDay)
	{
		this.noOfScreensInaDay = noOfScreensInaDay;
	}
}
