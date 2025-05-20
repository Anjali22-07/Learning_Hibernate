package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//in this class-- we will learn about fetching the data

//this class contains get() and load() methods
public class FetchDemo {

	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
	
/* we can also use this--:
    Configuration cfg=new Configuration
    cfg.configure("hibernate.cfg.xml")
    SessionFactory sf= cfg.buildSessionFactory()   * */	
	
	    //we need session because get and load both methods are with session
		Session session= sf.openSession();
		//get--student-101--we know the primary key of the table
		Student st=(Student)session.get(Student.class, 101);  //we need to get the object of student with id 101
		Address ad=(Address)session.load(Address.class, 1);  //we need to get the object of student with id 101
		
		System.out.println(st);
		System.out.println(ad);
		session.close();
		sf.close();
	}
	
}
