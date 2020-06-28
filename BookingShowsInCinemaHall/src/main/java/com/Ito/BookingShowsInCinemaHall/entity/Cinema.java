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
public class Cinema
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int movieId;
	 String movieName;
     String movieGenre;
	 Date releasedDate;
	 String producer;
	 String director;
	 @OneToMany(mappedBy = "cinema", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
				CascadeType.REFRESH })
	List<CinemaScreens> cinemaScreens;
public Cinema()
{
	
}
	public List<CinemaScreens> getCinemaScreens() {
		return cinemaScreens;
	}

	public void setCinemaScreens(List<CinemaScreens> cinemaScreens) {
		this.cinemaScreens = cinemaScreens;
	}

	public Cinema(int movieId, String movieName, String movieGenre, Date releasedDate, String producer, String director,
			List<CinemaScreens> cinemaScreens) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieGenre = movieGenre;
		this.releasedDate = releasedDate;
		this.producer = producer;
		this.director = director;
		this.cinemaScreens = cinemaScreens;
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
