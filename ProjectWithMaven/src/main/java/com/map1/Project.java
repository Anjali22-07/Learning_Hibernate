package com.map1;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Project {

	@Id
	private int p_id;
	private String p_name;
	
	@ManyToMany(mappedBy="projects")
	private List<Employees> emp;

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public List<Employees> getEmp() {
		return emp;
	}

	public void setEmp(List<Employees> emp) {
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int p_id, String p_name, List<Employees> emp) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.emp = emp;
	}
	
	
}
