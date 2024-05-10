package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Person {
	
	@Id
	private int person_id;
	private String person_Name;
	
	@ManyToMany
	List<Project> project = new ArrayList<Project>();

	
	public int getPerson_id() {
		return person_id;
	}


	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}


	public String getPerson_Name() {
		return person_Name;
	}


	public void setPerson_Name(String person_Name) {
		this.person_Name = person_Name;
	}


	public List<Project> getProject() {
		return project;
	}


	public void setProject(List<Project> project) {
		this.project = project;
	}


	public Person(int person_id, String person_Name, List<Project> project) {
		super();
		this.person_id = person_id;
		this.person_Name = person_Name;
		this.project = project;
	}


	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
