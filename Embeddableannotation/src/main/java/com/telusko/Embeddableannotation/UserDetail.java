package com.telusko.Embeddableannotation;

import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_detail")
public class UserDetail
{
@Id
private Integer id;
private String name;
private Long phno;
private Date dob;
//@Embedded
private Address address;


public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Long getPhno() {
	return phno;
}
public void setPhno(Long phno) {
	this.phno = phno;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
}
