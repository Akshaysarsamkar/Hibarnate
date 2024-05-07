package MappingExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student1 {

	@Id
	private int id;
	private String sname;
	private String cla;

	@OneToOne
	private Certificate cer;

	public Certificate getCer() {
		return cer;
	}

	public void setCer(Certificate cer) {
		this.cer = cer;
	}

	public Student1() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCla() {
		return cla;
	}

	public void setCla(String cla) {
		this.cla = cla;
	}
}
