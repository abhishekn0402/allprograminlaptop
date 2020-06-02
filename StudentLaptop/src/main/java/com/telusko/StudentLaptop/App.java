package com.telusko.StudentLaptop;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Laptop laptop=new Laptop();
    	laptop.setLid(555);
    	laptop.setLname("Hp");
		/*
		 * Laptop laptop1=new Laptop(); laptop1.setLid(88); laptop1.setLname("Dell");
		 */
        Student student=new Student();
    	student.setMarks(35);
    	student.setName("Abhishek");
    	student.setRollno(666);
    	 Student student1=new Student();
     	student1.setMarks(36);
     	student1.setName("Madhukumar");
     	student1.setRollno(777);
    	laptop.getStudent().add(student);
    	laptop.getStudent().add(student1);
    	//student.getLaptop().add(laptop);
    	//student.getLaptop().add(laptop1);
    	Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	SessionFactory sf=con.buildSessionFactory();
    	Session session=sf.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(laptop);
    	//session.save(laptop1);
    	session.save(student);
    	session.save(student1);
    	tx.commit();
    }
}
