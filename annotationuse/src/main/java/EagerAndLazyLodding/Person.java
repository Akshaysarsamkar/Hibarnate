package EagerAndLazyLodding;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	@Id
	private int pid;
	private String Pname;
	private String Pno;

	@OneToMany(mappedBy = "person")
	private List<Shop> shop = new ArrayList<Shop>();

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int pid, String pname, String pno, List<Shop> shop) {
		super();
		this.pid = pid;
		Pname = pname;
		Pno = pno;
		this.shop = shop;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public String getPno() {
		return Pno;
	}

	public void setPno(String pno) {
		Pno = pno;
	}

	public List<Shop> getShop() {
		return shop;
	}

	public void setShop(List<Shop> shop) {
		this.shop = shop;
	}

}
