package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int project_id;
	private String Project_Name;
	
	@ManyToMany
	@JoinTable(joinColumns = {@JoinColumn(name="person_id")},inverseJoinColumns = {@JoinColumn(name="project_id")})
	List<Person> person = new ArrayList<Person>();

	public Project() {
		super();
	}

	public Project(int project_id, String project_Name, List<Person> person) {
		super();
		this.project_id = project_id;
		Project_Name = project_Name;
		this.person = person;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public String getProject_Name() {
		return Project_Name;
	}

	public void setProject_Name(String project_Name) {
		Project_Name = project_Name;
	}

	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}
	
	
}
