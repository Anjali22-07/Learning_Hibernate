package com.pagination;

import org.hibernate.SessionFactory;

import java.util.List;

import org.hibernate.*;
import com.tut.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HQLPagination {
	
	public static void main(String[] args) {
		
		//Pagination means dividing a large set of data into smaller chunks (pages) so that 
		//we don't show or load everything at once.

		SessionFactory sif= new Configuration().configure().buildSessionFactory();

	     Session s = sif.openSession();
	     
	     Query q= s.createQuery("from Student");
	     
	     //implementing pagination to the hibernate
	     
	     q.setFirstResult(0);    //from the starting index
	     
	     //number of elements needed first time
	     q.setMaxResults(5);     //to the index till which you want to print in the first page
	     
	     List<Student> list= q.list();
	     
	     //for each student st in the list
	     for(Student st: list) {
	    	 System.out.println(st.getId()+" : "+ st.getName()+" : "+st.getCity());
	     }
	     
	     
	     
	     s.close();
	     sif.close();
}
	
}
