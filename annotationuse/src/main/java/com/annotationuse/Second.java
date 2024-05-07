package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Second {
	
	@Id
	private int sid;
	private String adds;
	public Second() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Second(int sid, String adds) {
		super();
		this.sid = sid;
		this.adds = adds;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getAdds() {
		return adds;
	}
	public void setAdds(String adds) {
		this.adds = adds;
	}
	
	

}
