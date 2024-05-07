package com.annotationuse;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int bookid;
	private String bname;
	private String author;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String bname, String author) {
		super();
		this.bookid = bookid;
		this.bname = bname;
		this.author = author;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
