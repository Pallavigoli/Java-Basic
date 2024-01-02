package com.example.HibernateOTOMap;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	int  b_engine;
	String b_brand;
	int b_cost;
	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Bike(int b_engine, String b_brand, int b_cost) {
		super();
		this.b_engine = b_engine;
		this.b_brand = b_brand;
		this.b_cost = b_cost;
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


	@Override
	public String toString() {
		return "Bike [b_engine=" + b_engine + ", b_brand=" + b_brand + ", b_cost=" + b_cost + "]";
	}
	
	
}
