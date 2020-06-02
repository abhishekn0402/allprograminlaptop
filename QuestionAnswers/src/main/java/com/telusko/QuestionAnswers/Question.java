package com.telusko.QuestionAnswers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="question")
public class Question
{
	@Id
	private Integer qid;
	private String subject;
	private String questionasked;
    @OneToMany(cascade=CascadeType.PERSIST)
	private List<Answer> answers=new ArrayList<Answer>();

	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getQuestionasked() {
		return questionasked;
	}
	public void setQuestionasked(String questionasked) {
		this.questionasked = questionasked;
	}


}
