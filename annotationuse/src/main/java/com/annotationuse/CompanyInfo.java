package com.annotationuse;

import javax.persistence.Embeddable;

@Embeddable
public class CompanyInfo {
	
	private String CInfo;
	private String Adds;
	private String city;
	
	public CompanyInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompanyInfo(String cInfo, String adds, String city) {
		super();
		CInfo = cInfo;
		Adds = adds;
		this.city = city;
	}

	public String getCInfo() {
		return CInfo;
	}

	public void setCInfo(String cInfo) {
		CInfo = cInfo;
	}

	public String getAdds() {
		return Adds;
	}

	public void setAdds(String adds) {
		Adds = adds;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	
	
	

}
