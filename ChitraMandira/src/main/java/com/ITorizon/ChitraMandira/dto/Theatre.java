package com.ITorizon.ChitraMandira.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
public class Theatre
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int theatreId;
	private String theatreName;
	private String theatreLocation;
	private String movieName;
	@OneToMany(mappedBy = "theatre",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	//@JsonManagedReference
	private List<Reviews> reviews;
	public Theatre()
	{
		
	}
	
	public Theatre(int theatreId, String theatreName, String theatreLocation, String movieName, List<Reviews> reviews) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreLocation = theatreLocation;
		this.movieName = movieName;
		this.reviews = reviews;
	}

	public int getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(int theatreId) {
		this.theatreId = theatreId;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public String getTheatreLocation() {
		return theatreLocation;
	}
	public void setTheatreLocation(String theatreLocation) {
		this.theatreLocation = theatreLocation;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public List<Reviews> getReviews() {
		return reviews;
	}
	public void setReviews(List<Reviews> reviews) {
		this.reviews = reviews;
	}                                             

}
