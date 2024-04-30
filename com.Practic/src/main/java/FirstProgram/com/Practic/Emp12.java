package FirstProgram.com.Practic;

import javax.persistence.Id;

@javax.persistence.Entity
public class Emp12 {
	
	@Id
	private int id;
	
	private String name;
	
	private String adds;

	public Emp12() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp12(int id, String name, String adds) {
		super();
		this.id = id;
		this.name = name;
		this.adds = adds;
	}

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

	@Override
	public String toString() {
		return "Emp12 [id=" + id + ", name=" + name + ", adds=" + adds + "]";
	}
	
	

}
