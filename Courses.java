 package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	@Id
	private int c_id;
	private String C_name;
	
	public Courses() {
		
		// TODO Auto-generated constructor stub
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return C_name;
	}
	public void setC_name(String c_name) {
		C_name = c_name;
	}
	
	

}
