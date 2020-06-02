package com.telusko.DemoHib;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Aliens
{
@Id
private int aid;
//@Column(name="columnname")
private AlienFullname aname;
//@Transient
private String color;
@Embedded
private EmbedAddress address;

public EmbedAddress getAddress() {
	return address;
}
public void setAddress(EmbedAddress address) {
	this.address = address;
}
public int getAid()
{
	return aid;
}
public void setAid(int aid) {
	this.aid = aid;
}

public AlienFullname getAname() {
	return aname;
}
public void setAname(AlienFullname aname) {
	this.aname = aname;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Aliens [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
}

}
