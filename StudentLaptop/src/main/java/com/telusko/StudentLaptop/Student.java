package com.telusko.StudentLaptop;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student
{
	@Id
	private int rollno;
	private String name;
	private int marks;
	//@OneToMany
	//private List<Laptop> laptop=new ArrayList<Laptop>();
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks)
	{
		this.marks = marks;
	}
	/*
	 * public List<Laptop> getLaptop() { return laptop; } public void
	 * setLaptop(List<Laptop> laptop) { this.laptop = laptop; }
	 */

}
