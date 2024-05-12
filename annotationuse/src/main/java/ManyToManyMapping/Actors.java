package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actors {

	@Id
	private int aid;
	private String aname;

	@ManyToMany
	private List<Movie> movie = new ArrayList<Movie>();

	public Actors() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Actors(int aid, String aname, List<Movie> movie) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.movie = movie;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public List<Movie> getMovie() {
		return movie;
	}

	public void setMovie(List<Movie> movie) {
		this.movie = movie;
	}

}
