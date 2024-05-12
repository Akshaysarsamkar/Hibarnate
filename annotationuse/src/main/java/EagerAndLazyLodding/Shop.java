package EagerAndLazyLodding;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Shop {

	@Id
	private int Sid;
	private String sname;
	private String Address;
	
	@ManyToOne
	private Person person;

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shop(int sid, String sname, String address) {
		super();
		Sid = sid;
		this.sname = sname;
		Address = address;
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Shop [Sid=" + Sid + ", sname=" + sname + ", Address=" + Address + ", person=" + person + "]";
	}
	
	
	

}
