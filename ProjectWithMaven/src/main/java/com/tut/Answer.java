package com.tut;

import jakarta.persistence.*;

//Learning one to one mapping 

@Entity
public class Answer {
	
	@Id
	private int answer_id;
	private String answers;
	
	@ManyToOne
	private Questions question;   //this field will be joining columns 
	
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int answer_id, String answers, Questions question) {
		super();
		this.answer_id = answer_id;
		this.answers = answers;
		this.question = question;
	}
	public int getAnswer_id() {
		return answer_id;
	}
	public void setAnswer_id(int answer_id) {
		this.answer_id = answer_id;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public Questions getQuestion() {
		return question;
	}
	public void setQuestion(Questions question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [answer_id=" + answer_id + ", answers=" + answers + ", question=" + question + "]";
	}
	
	
	

}
