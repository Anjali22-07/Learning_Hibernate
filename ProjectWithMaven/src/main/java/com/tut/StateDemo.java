package com.tut;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Practical of Hibernate Object States:
		//-- Transient State
		//-- Persistent State
		//-- Detached State
		//-- Removed
		
		System.out.println("Example :");
		
		//creating session
		
		SessionFactory f= new Configuration().configure().buildSessionFactory();
		
		//creating student object
		
		Student s1=new Student();
		s1.setId(1);
		s1.setName("Anjali");
		s1.setCity("Lucknow");
		s1.setCerti(new Certificate("Java Hibernate Course","2 months"));
		
		//here s1: is in Transient state
		
		Session s= f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(s1);
		//here s1: is in persistent state-- Associated with session and is stored in database
		tx.commit();
		
		
		s.close();
		//object is now in Detached state
		//value of the object won't change anymore because the object is no more associated with the database
		
		
		//Removed state-- when you want to remove the database but want to keep it associated with the session. we delete the session.thenobject moves from persistent state to removed state
		
		f.close();
		
		
		
	}

}

