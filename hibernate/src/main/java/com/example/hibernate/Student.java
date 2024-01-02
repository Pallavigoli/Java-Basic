package com.example.hibernate;

import javax.persistence.*;

@Entity
public class Student {
	
	@Id
	int rol;
	String name;
	int marks;
	public Student() {
		super();
	}
	public Student(int rol, String name, int marks) {
		super();
		this.rol = rol;
		this.name = name;
		this.marks = marks;
	}
	public int getRol() {
		return rol;
	}
	public void setRol(int rol) {
		this.rol = rol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rol=" + rol + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
