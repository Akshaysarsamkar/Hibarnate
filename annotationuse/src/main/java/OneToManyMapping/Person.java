package OneToManyMapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	private int pid;
	private String pname;
	private int age;
	
	@OneToMany(mappedBy = "person")
	private List<Laptop> laptop;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, int age, List<Laptop> laptop) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.laptop = laptop;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	

}
