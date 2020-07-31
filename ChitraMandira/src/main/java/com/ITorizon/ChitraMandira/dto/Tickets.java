package com.ITorizon.ChitraMandira.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

@Entity
public class Tickets 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketId;
	private double ticketPrice;
	private String movieName;
	private String theatreName;
	private String ticketType;
	private String theatreLocation;

	@ManyToOne
	@JoinColumn(name="AUDIENCE_ID")
	private Audience audience;
	
	@ManyToOne
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;
	
	public Tickets()
	{

	}


	public Tickets(int ticketId, double ticketPrice, String movieName, String theatreName, String ticketType,
			String theatreLocation, Audience audience, Movie movie) {
		super();
		this.ticketId = ticketId;
		this.ticketPrice = ticketPrice;
		this.movieName = movieName;
		this.theatreName = theatreName;
		this.ticketType = ticketType;
		this.theatreLocation = theatreLocation;
		this.audience = audience;
		this.movie = movie;
	}

//	@JsonBackReference
	public Audience getAudience() {
		return audience;
	}

	
	public void setAudience(Audience audience) {
		this.audience = audience;
	}

//	@JsonBackReference
	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}


	public int getTicketId() {
		return ticketId;
	}
	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}

}
