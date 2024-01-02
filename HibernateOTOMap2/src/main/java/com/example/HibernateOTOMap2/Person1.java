package com.example.HibernateOTOMap2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person1 {

	@Id
	int p_id;
	String p_name;
	int p_age;
	
	@OneToOne
	Bike2 b;
	public Person1() {
		super();
	}
	public Person1(int p_id, String p_name, int p_age, Bike2 b) {
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
	public Bike2 getB() {
		return b;
	}
	public void setB(Bike2 b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Person1 [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + ", b=" + b + "]";
	}

}
