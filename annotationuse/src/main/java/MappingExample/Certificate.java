package MappingExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Certificate {

	@Id
	private int id;

	private String c_name;

	@OneToOne
	private Student1 stu;

	public Student1 getStu() {
		return stu;
	}

	public void setStu(Student1 stu) {
		this.stu = stu;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

}
