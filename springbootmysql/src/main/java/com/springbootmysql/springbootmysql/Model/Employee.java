package com.springbootmysql.springbootmysql.Model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table (name="Employee")
@EntityListeners(AuditingEntityListener.class)
public class Employee
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	
	private String designation;


	private String expertise;
	
	private Date createdAt;
}
