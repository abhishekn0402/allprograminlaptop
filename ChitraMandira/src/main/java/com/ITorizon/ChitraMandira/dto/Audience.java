package com.ITorizon.ChitraMandira.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Audience
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int audienceId;
	private String audienceName;
	//@JsonManagedReference
	@OneToMany(mappedBy = "audience",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Tickets>tickets;
	
	
	@ManyToOne
	@JoinColumn(name="MOVIE_ID")
	private Movie movie;
	public Audience()
	{
		
	}

	public Audience(int audienceId, String audienceName, List<Tickets> tickets, Movie movie) {
		super();
		this.audienceId = audienceId;
		this.audienceName = audienceName;
		this.tickets = tickets;
		this.movie = movie;
	}

	public int getAudienceId() {
		return audienceId;
	}
	public void setAudienceId(int audienceId) {
		this.audienceId = audienceId;
	}
	public String getAudienceName() {
		return audienceName;
	}
	public void setAudienceName(String audienceName) {
		this.audienceName = audienceName;
	}
	public List<Tickets> getTickets() {
		return tickets;
	}
	public void setTickets(List<Tickets> tickets) {
		this.tickets = tickets;
	}
   // @JsonBackReference
	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

}
