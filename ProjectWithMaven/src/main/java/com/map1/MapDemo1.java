package com.map1;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class MapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sif = new Configuration().configure().buildSessionFactory();
		
		
		//we will have to create min of two employees and two projects
		Employees e1=new Employees();
		Employees e2=new Employees();
		e1.setE_id(12);
		e1.setE_name("Ram");
		e2.setE_id(13);
		e2.setE_name("Shyam");
		
		
		Project p1=new Project();
		Project p2=new Project();
		Project p3=new Project();
		p1.setP_id(2);
		p1.setP_name("Library Management System");
		p2.setP_id(12123);
		p2.setP_name("Chatbot");
		p3.setP_id(35);
		p3.setP_name("School Management");
		
		//for setting project in empl1oyees and employees in project we will use list
		
		List<Employees> emp1=new ArrayList<Employees>();
		List<Project> pro1=new ArrayList<Project>();
		
		//adding employees to the list
		emp1.add(e1);
		emp1.add(e2);
		//adding projects to the list
		pro1.add(p1);
		pro1.add(p2);
		pro1.add(p3);
		
		//setting the project in employees
		e1.setProjects(pro1);
		//setting the employees in project 
		p1.setEmp(emp1);
		
		
		Session session =sif.openSession();
		Transaction tx=session.beginTransaction();
		
		//saving the data
		
		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tx.commit();
		
		session.close();
		
		
		sif.close();
	}

}
