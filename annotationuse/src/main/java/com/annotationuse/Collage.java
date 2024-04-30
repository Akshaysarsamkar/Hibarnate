package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Collage {
	
	@Id
	private int c_id ;
	private String C_name;
	private String Adds;	
	private float timepass;
	
	public Collage(int c_id, String c_name, String adds, float timepass) {
		super();
		this.c_id = c_id;
		C_name = c_name;
		Adds = adds;
		this.timepass = timepass;
	}

	public Collage(String c_name, String adds, float timepass) {
		super();
		C_name = c_name;
		Adds = adds;
		this.timepass = timepass;
	}

	public Collage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collage(int c_id, String c_name, String adds) {
		super();
		this.c_id = c_id;
		C_name = c_name;
		Adds = adds;
	}

	public int getC_id() {
		return c_id;
	}

	public float getTimepass() {
		return timepass;
	}

	public void setTimepass(float timepass) {
		this.timepass = timepass;
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

	public String getAdds() {
		return Adds;
	}

	public void setAdds(String adds) {
		Adds = adds;
	}

	@Override
	public String toString() {
		return "Collage [c_id=" + c_id + ", C_name=" + C_name + ", Adds=" + Adds + "]";
	}
	
	

}
