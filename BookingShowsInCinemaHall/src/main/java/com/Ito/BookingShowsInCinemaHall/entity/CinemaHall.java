package com.Ito.BookingShowsInCinemaHall.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class CinemaHall
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	     int chId;
		 String chName;
		 String chCity;
		 String chState;
		 String chCountry;
		 @OneToMany(mappedBy = "cinemaHall", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
					CascadeType.REFRESH })
		 List<CinemaHallScreen> cinemaHallScreen;
		public List<CinemaHallScreen> getCinemaHallScreen() {
			return cinemaHallScreen;
		}
		public void setCinemaHallScreen(List<CinemaHallScreen> cinemaHallScreen) {
			this.cinemaHallScreen = cinemaHallScreen;
		}
		public CinemaHall()
		{
			
		}
		public CinemaHall(int chId, String chName, String chCity, String chState, String chCountry,
				List<CinemaHallScreen> cinemaHallScreen) {
			super();
			this.chId = chId;
			this.chName = chName;
			this.chCity = chCity;
			this.chState = chState;
			this.chCountry = chCountry;
			this.cinemaHallScreen = cinemaHallScreen;
		}
		public int getChId() {
			return chId;
		}
		public void setChId(int chId) {
			this.chId = chId;
		}
		public String getChName() {
			return chName;
		}
		public void setChName(String chName) {
			this.chName = chName;
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
}
