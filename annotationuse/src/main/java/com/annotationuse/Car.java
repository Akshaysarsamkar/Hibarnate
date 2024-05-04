package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	
	@Id
	private int id;
	private String c_name;
	private String color;
	private Owner own;
	
	
	public Car(int id, String c_name, String color,Owner owner) {
		super();
		this.id = id;
		this.c_name = c_name;
		this.color = color;
	}


	public Owner getOwn() {
		return own;
	}


	public void setOwn(Owner own) {
		this.own = own;
	}


	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getC_name() {
		return c_name;
	}


	public void setC_name(String c_name) {
		this.c_name = c_name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Car [id=" + id + ", c_name=" + c_name + ", color=" + color + ", own=" + own + "]";
	}


		
	
	

}
