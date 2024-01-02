package com.example.HibernateOTOMap2;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike2 {

	@Id
	int  b_engine;
	String b_brand;
	int b_cost;
	
	@OneToOne
	Person1 p;
	
	public Bike2() {
		super();
	}

	public int getB_engine() {
		return b_engine;
	}

	public void setB_engine(int b_engine) {
		this.b_engine = b_engine;
	}

	public String getB_brand() {
		return b_brand;
	}

	public void setB_brand(String b_brand) {
		this.b_brand = b_brand;
	}

	public int getB_cost() {
		return b_cost;
	}

	public void setB_cost(int b_cost) {
		this.b_cost = b_cost;
	}

	public Person1 getP() {
		return p;
	}

	public void setP(Person1 p) {
		this.p = p;
	}

	public Bike2(int b_engine, String b_brand, int b_cost, Person1 p) {
		super();
		this.b_engine = b_engine;
		this.b_brand = b_brand;
		this.b_cost = b_cost;
		this.p = p;
	}


	@Override
	public String toString() {
		return "Bike2 [b_engine=" + b_engine + ", b_brand=" + b_brand + ", b_cost=" + b_cost + ", p=" + p + "]";
	}
}
