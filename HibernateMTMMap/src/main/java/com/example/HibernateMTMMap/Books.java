package com.example.HibernateMTMMap;

import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Books {
	@Id
	int b_id;
	String b_name;
	String b_title;
	@ManyToMany
	List<Author> a;
	
	public Books() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Books(int b_id, String b_name, String b_title, List<Author> a) {
		super();
		this.b_id = b_id;
		this.b_name = b_name;
		this.b_title = b_title;
		this.a = a;
	}



	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public String getB_name() {
		return b_name;
	}

	public void setB_name(String b_name) {
		this.b_name = b_name;
	}

	public String getB_title() {
		return b_title;
	}

	public void setB_title(String b_title) {
		this.b_title = b_title;
	}

	public List<Author> getA() {
		return a;
	}

	public void setA(List<Author> a) {
		this.a = a;
	}



	@Override
	public String toString() {
		return "Books [b_id=" + b_id + ", b_name=" + b_name + ", b_title=" + b_title + ", a=" + a + "]";
	}
	

}
