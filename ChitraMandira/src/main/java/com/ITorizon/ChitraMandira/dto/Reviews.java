package com.ITorizon.ChitraMandira.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Reviews
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;
	private int rating;
	private String reviews;
	@ManyToOne
	@JoinColumn(name = "MOVIE_ID")
	
	private Movie movie;
	
	@ManyToOne
	@JoinColumn(name="THEATRE_ID")
	
	private Theatre theatre;
	public Reviews()
	{
		
	}
	
	
	public Reviews(int reviewId, int rating, String reviews, Movie movie, Theatre theatre) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.reviews = reviews;
		this.movie = movie;
		this.theatre = theatre;
	}


	public int getReviewId() {
		return reviewId;
	}
	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}
	public String getReviews() {
		return reviews;
	}
	public void setReviews(String reviews) {
		this.reviews = reviews;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@JsonBackReference
	public Movie getMovie() {
		return movie;
	}


	public void setMovie(Movie movie) {
		this.movie = movie;
	}

//	@JsonBackReference
	public Theatre getTheatre() {
		return theatre;
	}


	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}

}
