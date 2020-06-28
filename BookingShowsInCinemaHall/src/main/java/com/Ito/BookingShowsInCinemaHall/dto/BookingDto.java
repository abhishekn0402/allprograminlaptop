package com.Ito.BookingShowsInCinemaHall.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BookingDto
{
public String movieName;
public String chName;
public String customerName;
@Temporal(TemporalType.TIMESTAMP)
public Date date;
public String email;
public long contactNo;
@Temporal(TemporalType.TIMESTAMP)
public Date startDate;
@Temporal(TemporalType.TIMESTAMP)
public Date endDate;
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public String getChName() {
	return chName;
}
public void setChName(String chName) {
	this.chName = chName;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getContactNo() {
	return contactNo;
}
public void setContactNo(long contactNo) {
	this.contactNo = contactNo;
}
public Date getStartDate() {
	return startDate;
}
public void setStartDate(Date startDate) {
	this.startDate = startDate;
}
public Date getEndDate() {
	return endDate;
}
public void setEndDate(Date endDate) {
	this.endDate = endDate;
}

}
