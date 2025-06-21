package com.hql;

import java.util.Arrays;

import java.util.List;
import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.tut.*;

public class HqlExample {

	public static void main(String[] args) {
		
		
		//creating sessionFactory
		SessionFactory sif= new Configuration().configure().buildSessionFactory();
		
		Session s= sif.openSession();
		Transaction tx=  s.beginTransaction();
		
		//HQL
		//Syntax
		
		//selecting query
		String query="from Student where city='Lucknow'";
		
		//to fire query
		
		Query q = s.createQuery(query);
		
		//either single result or multiple result
		
		//q.uniqueResult();-- returns single object
		List<Student> list = q.list();  //returns list of objects
		
		for(Student student: list) {
			System.out.println(student.getName()+" :"+student.getCerti().getCourse());
		}
		
		System.out.println("---------------------------------------------------------------");
		
	/*	Query q1= s.createQuery("delete from Student as s where s.city=:c");
		
		q1.setParameter("c", "Noida");
		int r=q1.executeUpdate();

		System.out.println("Deleted:"+r);
		*/
		
		//Update Query
	/*	Query q2= s.createQuery("update Student set city=:c where name=:n");
		
		q2.setParameter("c","Delhi");
		q2.setParameter("n","Anjali");
		int r1= q2.executeUpdate();
		System.out.println(r1+"objects updated");
		
		*/
           tx.commit();
		
           //how to execute join query
          
		//we are using Questions table and answer table
        
           Query q3= s.createQuery("select q.question, q.question_id, a.answers  from Questions as q INNER JOIN q.answer as a ");
		      
           
           // list  of arrays of object 
           List<Object []> list2= q3.getResultList();
           
           for(Object[] arr: list2) {
        	   System.out.println(Arrays.toString(arr));
           }
           s.close();
		//closing sessionfactory
		sif.close();
	}
}
