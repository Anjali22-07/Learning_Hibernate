package com.map1;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Employees {

	@Id
	private int e_id;
	private String e_name;
	
	@ManyToMany
	@JoinTable(name="emp_pro",
	joinColumns= {@JoinColumn(name="e_id")},
	inverseJoinColumns= {@JoinColumn(name="p_id")})
	private List<Project> projects;

	public Employees() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employees(int e_id, String e_name, List<Project> projects) {
		super();
		this.e_id = e_id;
		this.e_name = e_name;
		this.projects = projects;
	}

	public int getE_id() {
		return e_id;
	}

	public void setE_id(int e_id) {
		this.e_id = e_id;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
