package MappingExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Cars {

	@Id
	private int id;
	private String cname;

	@ManyToOne
	private Owner own;

	public Cars() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner getOwn() {
		return own;
	}

	public void setOwn(Owner own) {
		this.own = own;
	}

	public Cars(int id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
