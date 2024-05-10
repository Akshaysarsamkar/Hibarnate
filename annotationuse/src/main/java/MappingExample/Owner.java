package MappingExample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner {
	
	@Id
	private int id;
	private String name;
	private String adds;
	
	@OneToMany(mappedBy = "own")
	private List<Cars> car;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	public List<Cars> getCar() {
		return car;
	}

	public void setCar(List<Cars> car) {
		this.car = car;
	}

	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Owner(int id, String name, String adds, List<Cars> car) {
		super();
		this.id = id;
		this.name = name;
		this.adds = adds;
		this.car = car;
	}
	
	
	
	

}
