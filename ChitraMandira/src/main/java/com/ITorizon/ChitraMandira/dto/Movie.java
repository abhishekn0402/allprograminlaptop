package com.ITorizon.ChitraMandira.dto;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="movie")
public class Movie
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String movieLocation;
	private String theatreName;
	
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonManagedReference
	private List<Tickets>tickets;
	
	@OneToMany(mappedBy = "movie",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
//	@JsonManagedReference
	private List<Reviews> reviews; 
	
	
    @OneToMany(mappedBy = "movie",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
   // @JsonManagedReference
	private List<Audience> audience;
	//@Temporal(TemporalType.TIME)
	//@DateTimeFormat(style = "hh:mm")
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="hh:mm")
	private Date showTime;
	@Temporal(TemporalType.DATE)
	//@DateTimeFormat(style = "yyyy-MM-dd")
	private Date showDate;
	private String hero;
	private String heroin;
	private String director;
	private String movieType;
	public Movie()
	{
	}
	
	public Movie(int movieId, String movieName, String movieLocation, String theatreName, List<Tickets> tickets,
			List<Reviews> reviews, List<Audience> audience, Date showTime, Date showDate, String hero,
			String heroin, String director, String movieType) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieLocation = movieLocation;
		this.theatreName = theatreName;
		this.tickets = tickets;
		this.reviews = reviews;
		this.audience = audience;
		this.showTime = showTime;
		this.showDate = showDate;
		this.hero = hero;
		this.heroin = heroin;
		this.director = director;
		this.movieType = movieType;
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
	public String getMovieLocation() {
		return movieLocation;
	}
	public void setMovieLocation(String movieLocation) {
		this.movieLocation = movieLocation;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public List<Tickets> getTickets() {
		return tickets;
	}
	public void setTickets(List<Tickets> tickets) {
		this.tickets = tickets;
	}
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}
	public List<Audience> getAudience() {
		return audience;
	}
	public void setAudience(List<Audience> audience) {
		this.audience = audience;
	}
	public Date getShowTime() {
		return showTime;
	}
	public void setShowTime(Date showTime) {
		this.showTime = showTime;
	}
	public Date getShowDate() {
		return showDate;
	}
	public void setShowDate(Date showDate) {
		this.showDate = showDate;
	}
	public String getHero() {
		return hero;
	}
	public void setHero(String hero) {
		this.hero = hero;
	}
	public String getHeroin() {
		return heroin;
	}
	public void setHeroin(String heroin) {
		this.heroin = heroin;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getMovieType() {
		return movieType;
	}
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	

}
