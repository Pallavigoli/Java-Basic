package com.example.HibernateOneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Technology {
	 @Id
	 int t_id;
	 String t_name;
	 
	 @ManyToOne
	 SoftwareEng s;
	public Technology() {
		super();
	}
	
	public Technology(int t_id, String t_name, SoftwareEng s) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.s = s;
	}

	public int getT_id() {
		return t_id;
	}
	public void setT_id(int t_id) {
		this.t_id = t_id;
	}
	public String getT_name() {
		return t_name;
	}
	public void setT_name(String t_name) {
		this.t_name = t_name;
	}
	public SoftwareEng getS() {
		return s;
	}
	public void setS(SoftwareEng s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "Technology [t_id=" + t_id + ", t_name=" + t_name + ", s=" + s + "]";
	}

	
	
	

}
