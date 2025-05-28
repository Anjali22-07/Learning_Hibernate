package com.tut;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sif= new Configuration().configure().buildSessionFactory();
		
		Questions qt=new Questions();
		qt.setQuestion_id(1212);
		qt.setQuestion("What is Java?");
		
		
		Answer ans=new Answer();
		ans.setAnswer_id(343);
		ans.setAnswers("Java is a Programming Language");
		ans.setQuestion(qt);

		Answer ans2=new Answer();
		ans2.setAnswer_id(344);
		ans2.setAnswers("It is an Object Oriented Programming Language");
		ans2.setQuestion(qt);;

		List<Answer> list=new ArrayList<Answer>();
		list.add(ans);
		list.add(ans2);
		qt.setAnswer(list);
		
		Session session=sif.openSession();
		Transaction rx= session.beginTransaction();
		
		session.save(qt);
		
	//	session.save(ans);
		//session.save(ans2);
		
		rx.commit(); 
		
	//	to clear everything from the cache:
		// session.clear();
		
		//fetching data

	 Questions q=(Questions)session.get(Questions.class, 1212);
		
		
		System.out.println(q.getQuestion_id());
		System.out.println(q.getQuestion());
		
		
		
		
		//Lazy loading will only load the answer when it is called using getAnswer
		/*for(Answer a: q.getAnswer()) {
			System.out.println(q.getAnswer());
			
		}*/
		
		session.close();
		sif.close();
		
	}

}
