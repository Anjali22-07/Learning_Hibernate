package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();

		//creating object of student class
		Student st1= new Student();
		st1.setId(103);
		st1.setName("Anjali");
		st1.setCity("Delhi");
		
		Student st2= new Student();
		st2.setId(104);
		st2.setName("SSB");
		st2.setCity("Gwalior");
		
		//creating object of certificate class
		Certificate ct=new Certificate();
		ct.setCourse("Web Development");
		ct.setDuration("6 months");
		
		Certificate ct1=new Certificate();
		ct1.setCourse("DSA");
		ct1.setDuration("10 months");
		
		st1.setCerti(ct);
		
		
		//to Save session
		
		Session s1=sf.openSession();
		Transaction tx=s1.beginTransaction();
		
		//saving objects
		
		s1.save(st1);
		s1.save(st2);
		
		tx.commit();
		s1.close();
	}
	
	

}
