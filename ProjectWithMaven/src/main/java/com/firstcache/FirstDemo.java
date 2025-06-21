package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.tut.*;

public class FirstDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sif=  new Configuration().configure().buildSessionFactory();
		 Session s= sif.openSession();
		 
		 //First level cache -- by default enabled
		 
		Student student= s.get(Student.class,3);
		System.out.println(student);
		 System.out.println("Testing First Level Cache");
		 Student student1= s.get(Student.class, 3);
		 System.out.println(student1);
		 
		 		 //to check if there's anyobject in session cache memory
		 
		 System.out.println(s.contains(student1));  //returns true if the value is in session
		 
		 s.close();
		 sif.close();
		 
		 
		
	}

}
