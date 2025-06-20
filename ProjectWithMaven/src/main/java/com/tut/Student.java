package com.tut;

import jakarta.persistence.Entity;
import jakarta.persistence.Cacheable;
import jakarta.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity     //to change the name of entity we use Entity(name="")
//@Table(name="") is used to change the name of the table
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class Student {

	//we will treat this class as an entity
	@Id
	private int id;   //to make this primary key
	
	private String name;
	
	private String city;
	
	private Certificate certi;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	//overriding toString method-By overriding toString(), you can display the object’s data in a readable format: in a human-readable format.because by default it prints classname with some hashcode
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id+" : "+this.name+" : "+this.city;
				
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
	
}
