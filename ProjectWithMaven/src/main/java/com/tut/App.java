package com.tut;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	System.out.println( "project started" );
    	//creating the object of session factory
    //thread safe object-- which is created once for one project.
    	SessionFactory factory = new Configuration().configure().buildSessionFactory();
        //we can use factory to get session-- this helps to save data
    	
    	System.out.println(factory);
    	System.out.println(factory.isClosed());
    	
    	//to store data in database we need to create tables but
    	//the primary benefit of using hibernate is we do not need to create table manually 
    	//mapping : database table <--> java class. we have class and table and we will map the variables(instance wale) of the class to the columns of the tables.
    	//we can use both xml or annotations
    	
    	//creating student
    	Student  st= new Student();
    	st.setId(101);
    	st.setName("John");
    	st.setCity("Lucknow");
    	System.out.println(st);
    	
    	//Creating object of address class
    	Address ad=new Address();
    	ad.setStreet("ln 5");
        ad.setCity("Lucknow");
        ad.setAddedDate(new Date());
        
        //Reading image 
        FileInputStream fis=new FileInputStream("src/main/java/pic1.png");
         byte[] data=new byte[fis.available()];
         fis.read(data);
         ad.setImage(data);
    	
    	//to save the st object--object of student class
    	
         //we need session because get and load both methods are with session
    	Session session=factory.openSession();
   
    
    	//to begin transaction--n Hibernate, changes (like save, update, delete) must be wrapped in a transaction to ensure data consistency
    	session.beginTransaction();
    	//save st because The object isn't immediately inserted into the DB — it’s queued in Hibernate's internal memory (called the persistence context).
    	session.save(st);
    	//saving the address object
    	session.save(ad);
    	//after saving we need to commit transaction--because--Hibernate now flushes all queued operations (like save) to the database.
    	session.getTransaction().commit();
    	
    	
    	//to release the database connection and clean up resources after you're done using the session.
    	session.close();
    	System.out.println("Done..");
    }
    
}
