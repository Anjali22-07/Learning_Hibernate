package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.tut.*;

public class CascadingExample {
	
	public static void main(String[] args) {
		
		SessionFactory sif = new Configuration(). configure().buildSessionFactory();
		Session s= sif.openSession();
		Transaction tx= s.beginTransaction();		
		
		Questions q1= new Questions();
		q1.setQuestion_id(569);
		q1.setQuestion("What is Cascading");
		
		Answer a1= new Answer();
		Answer a2=new Answer();
		Answer a3=new Answer();
		a1.setAnswer_id(780);
		a1.setAnswers("cascading is automatic propogation from a parent entity to its associated child entities");
		a2.setAnswer_id(986);
		a2.setAnswers("Second result");
		a3.setAnswer_id(1009);
		a3.setAnswers("Third answer");

		List<Answer> list= new ArrayList<>();
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		//set answer in q1-- one to many mapping 
		q1.setAnswer(list);
		
		//This will only save questions information and not answer 
		//That is why we need cascading to save class entity with parent entity automatically
		
		s.save(q1);   //we have included cascadeType.ALL in Questions class on the mapped object
		//This will automatically save the answers as well as questions
		tx.commit();
		
		
		sif.close();
		
	}

}
