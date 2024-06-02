package HQL;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student {

	@Id
	private int sid;
	private String sname;
	private String sclass;

	@OneToOne
	@JoinColumn(name="cid")
	private Certificate c;

	public Certificate getC() {
		return c;
	}

	public void setC(Certificate c) {
		this.c = c;
	}

	public Student() {
		super();
		
	}

	public Student(String sname, String sclass, int id) {
		super();
		this.sname = sname;
		this.sclass = sclass;
		this.sid = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSclass() {
		return sclass;
	}

	public void setSclass(String sclass) {
		this.sclass = sclass;
	}

	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

}
