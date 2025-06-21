package com.tut;


import java.util.List;

import jakarta.persistence.CascadeType;
//Learning one-to-one mapping
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Questions {

	@Id
	private int question_id;
	private String question;
	/*@OneToOne
	@JoinColumn(name="a_id")  //this annotation is used to rename column
	private Answer ans;*/
	
	// for OneToMany mapping-- we'll use list because one question can store multiple answer
	
	@OneToMany(mappedBy="question", fetch=FetchType.EAGER, cascade = CascadeType.ALL)  //this won't create a new table and will only give us a join column
	private List<Answer> answer;

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answer;
	}

	public void setAnswer(List<Answer> answer) {
		this.answer = answer;
	}

	public Questions(int question_id, String question, List<Answer> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answer = answer;
	}

	public Questions() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
}
