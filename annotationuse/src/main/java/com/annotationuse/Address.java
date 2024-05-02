package com.annotationuse;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="a_id")
	private int id;
	
	@Column(length = 20)
	private String city;
	
	@Column(length = 50)
	private String street;
	private boolean isopen;
	
	@Temporal(TemporalType.DATE)
	private Date adddate;
	
	@Transient
	private double x;
	
	@Lob
	private byte[] image;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, String street, boolean isopen, Date adddate, double x, byte[] image) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.isopen = isopen;
		this.adddate = adddate;
		this.x = x;
		this.image = image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public boolean isIsopen() {
		return isopen;
	}

	public void setIsopen(boolean isopen) {
		this.isopen = isopen;
	}

	public Date getAdddate() {
		return adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", street=" + street + ", isopen=" + isopen + ", adddate="
				+ adddate + ", x=" + x + ", image=" + Arrays.toString(image) + "]";
	}
	
	

}
