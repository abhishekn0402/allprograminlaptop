package com.telusko.QuestionAnswers;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="answer")
public class Answer 
{
	@Id
	private Integer answerid;
	private String  personname;
	private String  answers;
	
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public Integer getAnswerid() {
		return answerid;
	}
	public void setAnswerid(Integer answerid) {
		this.answerid = answerid;
	}
	public String getPersonname() {
		return personname;
	}
	public void setPersonname(String personname) {
		this.personname = personname;
	}

}
