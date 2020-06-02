package com.telusko.Embeddableannotation;



import java.util.Date;

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
    	UserDetail userDetails= new UserDetail();
    	userDetails.setId(10);
    	userDetails.setName("Abhishek");
    	userDetails.setDob(new Date());
    	userDetails.setPhno(7337800402l);
    	Address address=new Address();
    	address.setStreet("4th street");
    	address.setCity("bommanahalli");
    	address.setState("Banglore");
    	
    	
    	address.setPin(570068);
    	userDetails.setAddress(address);
    	Configuration con=new Configuration().configure().addAnnotatedClass(UserDetail.class);
  
    	SessionFactory sessionFactory=con.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(userDetails);
        tx.commit();
    	
    	
    	
    }
}
