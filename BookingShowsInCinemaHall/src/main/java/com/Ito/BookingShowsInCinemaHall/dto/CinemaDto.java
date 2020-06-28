package com.Ito.BookingShowsInCinemaHall.dto;

import java.util.Date;

public class CinemaDto
{
	private int movieId;
	private String movieName;
	private String movieGenre;
	private Date releasedDate;
	private String producer;
	private String director;
	public CinemaDto(int movieId, String movieName, String movieGenre, Date releasedDate, String producer,
			String director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.releasedDate = releasedDate;
		this.producer = producer;
		this.director = director;
	}
	public CinemaDto() {
		super();
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
	public void setDirector(String director) {
		this.director = director;
	}
	
}
