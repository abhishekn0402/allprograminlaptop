package com.telusko.QuestionAnswers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Question question=new Question();
    	question.setQid(10);
    	question.setSubject("JAVA");
    	question.setQuestionasked("is java difficult?");
    	Answer answer=new Answer();
    	answer.setAnswerid(1);
    	answer.setPersonname("Abhishek");
    	answer.setAnswers("No..");
    	Answer answer1=new Answer();
    	answer1.setAnswerid(2);
    	answer1.setPersonname("Madhu");
    	answer1.setAnswers("yes..");
    	Answer answer2=new Answer();
    	answer2.setAnswerid(3);
    	answer2.setPersonname("prafulla");
    	answer2.setAnswers("Half half..");
    	answer2.setAnswers("i dont know..");
    	
    	question.getAnswers().add(answer);
    	question.getAnswers().add(answer1);
    	question.getAnswers().add(answer2);
    	Configuration con= new Configuration().configure().addAnnotatedClass(Question.class).addAnnotatedClass(Answer.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.persist(question);
    	tx.commit();
    	
    }
    
}
