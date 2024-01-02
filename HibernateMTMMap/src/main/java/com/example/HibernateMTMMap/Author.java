package com.example.HibernateMTMMap;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {
	@Id
	int a_id;
	String a_name;
	char gender;
	
	@ManyToMany
	List<Books> b;
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(int a_id, String a_name, char gender, List<Books> b) {
		super();
		this.a_id = a_id;
		this.a_name = a_name;
		this.gender = gender;
		this.b = b;
	}

	public int getId() {
		return a_id;
	}

	public void setId(int id) {
		this.a_id = id;
	}

	public String getName() {
		return a_name;
	}

	public void setName(String a_name) {
		this.a_name = a_name;
	}

	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public List<Books> getB() {
		return b;
	}

	public void setB(List<Books> b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Author [id=" + a_id + ", name=" + a_name  + ", gender=" + gender + ", b=" + b + "]";
	}

}
