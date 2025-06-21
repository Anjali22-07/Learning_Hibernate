package com.sqlquery;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.*;

import com.tut.Student;

public class SQLExample {

	public static void main(String[] args) {
		
		SessionFactory sif= new Configuration().configure().buildSessionFactory();
		Session s=sif.openSession();
		
		String q="select * from Student";
		
		//Specifying the result mapping--- so hibernate knows how to convert the native SQL queries into Student Objects.
		NativeQuery nq=s.createNativeQuery(q, Student.class);
		
		List<Student> list=nq.list();
		
		for(Student st: list) {
			System.out.println(st.getId()+":"+st.getName()+":"+st.getCity());
		}
		
		s.close();
		sif.close();
		
	}
}
