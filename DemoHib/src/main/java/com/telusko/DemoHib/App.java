package com.telusko.DemoHib;

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
		EmbedAddress em=new EmbedAddress();
		em.setStreet("4th street");
		em.setCity("bommanahalli");
		em.setState("Banglore");
		em.setPin(570068);
		Aliens telusko= new Aliens();
		telusko.setAid(200);
		telusko.setColor("red");
		AlienFullname an=new AlienFullname();
		an.setFname("Madival");
		an.setMname("Abhishek");
		an.setLname("NagarajShetty");

		telusko.setAname(an);
		telusko.setAddress(em);
		Configuration con=new Configuration().configure().addAnnotatedClass(Aliens.class);
		SessionFactory sessionfactory=con.buildSessionFactory();
		Session session= sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(telusko); //to store the data to the database
		//telusko=(Aliens)session.get(Aliens.class, 20);
		//System.out.println(telusko); to fetch the data
		tx.commit();

	}
}
