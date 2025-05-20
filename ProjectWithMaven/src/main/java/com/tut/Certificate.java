package com.tut;

import jakarta.persistence.Embeddable;

//this class teaches Embeddable annotation


//if we don't use the annotations the table is not created in sql and the compiler is unable to find it.so we will embedd this class into student table

@Embeddable
public class Certificate {
	
	private String course;
	private String duration;

	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Certificate(String course, String duration) {
		super();
		this.course = course;
		this.duration = duration;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
