package com.annotationuse;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {
	
	
	private int oid;
	private String oname;
	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner(int oid, String oname) {
		super();
		this.oid = oid;
		this.oname = oname;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	
	
	
	

}
