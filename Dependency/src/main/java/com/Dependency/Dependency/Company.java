package com.Dependency.Dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Company
{
	private int cid;
	private String dname;
	private String branch;
	@Autowired
	private Employee empdetails;
	
	public Employee getEmpdetails() {
		return empdetails;
	}
	public void setEmpdetails(Employee empdetails) {
		this.empdetails = empdetails;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
public void com()
{
	System.out.println("this is company class object.....");
	empdetails.emp();
}

}
