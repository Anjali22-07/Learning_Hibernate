package com.firstcache;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

import org.hibernate.*;

public class SecondDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  SessionFactory sif= new Configuration().configure().buildSessionFactory();
  Session s= sif.openSession();
 Student student= s.get(Student.class, 4);
 System.out.println(student);
  
  
  s.close();
  
  Session s1= sif.openSession();
 Student student1= s.get(Student.class, 4);
 System.out.println(student1);
  
  
  
  s1.close();
  sif.close();
		
	}

}
