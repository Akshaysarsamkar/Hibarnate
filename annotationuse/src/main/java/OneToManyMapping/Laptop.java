package OneToManyMapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
	
	@Id
	private int laptopid;
	private String laptipname;
	
	@ManyToOne
	private Person person;

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(int laptopid, String laptipname, Person person) {
		super();
		this.laptopid = laptopid;
		this.laptipname = laptipname;
		this.person = person;
	}

	public int getLaptopid() {
		return laptopid;
	}

	public void setLaptopid(int laptopid) {
		this.laptopid = laptopid;
	}

	public String getLaptipname() {
		return laptipname;
	}

	public void setLaptipname(String laptipname) {
		this.laptipname = laptipname;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	

}
