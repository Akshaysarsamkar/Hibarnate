package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class First {
	
	@Id
	private int id;
	private String name ;
	
	@OneToOne
	private Second sec;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Second getSec() {
		return sec;
	}
	public void setSec(Second sec) {
		this.sec = sec;
	}
	public First() {
		super();
		// TODO Auto-generated constructor stub
	}
	public First(int id, String name, Second sec) {
		super();
		this.id = id;
		this.name = name;
		this.sec = sec;
	}
	
	

}
