package PersistanceobjectLifeCycle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Child {

	@Id
	private int cid;

	private String cname;

	private int age;
	
	@ManyToOne
	private Parent p;

	public Parent getP() {
		return p;
	}

	public void setP(Parent p) {
		this.p = p;
	}

	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Child(int cid, String cname, int age) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.age = age;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
