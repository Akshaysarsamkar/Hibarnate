package PersistanceobjectLifeCycle;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Parent {

	@Id
	private int pid;

	private String name;

	@OneToMany(mappedBy = "p")
	private List<Child> child = new ArrayList<Child>();
	

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public List<Child> getChild() {
		return child;
	}


	public void setChild(List<Child> child) {
		this.child = child;
	}


	public Parent(int pid, String name, List<Child> child) {
		super();
		this.pid = pid;
		this.name = name;
		this.child = child;
	}


	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

}
