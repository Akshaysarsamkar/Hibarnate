package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	private int id;
	private String C_name;
	private int ranks1;
	private float Income;
	private CompanyInfo info;

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, String c_name, int rank, float income, CompanyInfo info) {
		super();
		this.id = id;
		C_name = c_name;
		this.ranks1 = rank;
		Income = income;
		this.info = info;
	}

	public int getRanks1() {
		return ranks1;
	}

	public void setRanks1(int ranks1) {
		this.ranks1 = ranks1;
	}

	public CompanyInfo getInfo() {
		return info;
	}

	public void setInfo(CompanyInfo info) {
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_name() {
		return C_name;
	}

	public void setC_name(String c_name) {
		C_name = c_name;
	}

	

	public float getIncome() {
		return Income;
	}

	public void setIncome(float income) {
		Income = income;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", C_name=" + C_name + ", rank=" + ranks1 + ", Income=" + Income + ", info=" + info
				+ "]";
	}

}
