package com.example.HibernateOTOMap;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	
	@Id
	int p_id;
	String p_name;
	int p_age;
	
	@OneToOne
	Bike b;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int p_id, String p_name, int p_age, Bike b) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_age = p_age;
		this.b = b;
	}
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
	public int getP_age() {
		return p_age;
	}
	public void setP_age(int p_age) {
		this.p_age = p_age;
	}
	public Bike getB() {
		return b;
	}
	public void setB(Bike b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + ", b=" + b + "]";
	}
	
	

}
