package com.Dependency.Dependency;

import org.springframework.stereotype.Component;

@Component
public class Employee
{
private int eid;
private String name;
private int dnumber;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getDnumber() {
	return dnumber;
}
public void setDnumber(int dnumber) {
	this.dnumber = dnumber;
}
public void emp()
{
	System.out.println("this is employee class object...");
}
}
