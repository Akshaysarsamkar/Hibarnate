package ManyToManyMapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Movie {

	@Id
	private int mid;
	private String m_name;
	private int buget;
	
	@ManyToMany
	@JoinTable(joinColumns = {@JoinColumn(name="mid")},inverseJoinColumns = {@JoinColumn(name="aid")})

	List<Actors> actors = new ArrayList<Actors>();
	
	
	public List<Actors> getActors() {
		return actors;
	}


	public void setActors(List<Actors> actors) {
		this.actors = actors;
	}


	public Movie(int mid, String m_name, int buget) {
		super();
		this.mid = mid;
		this.m_name = m_name;
		this.buget = buget;
	}


	public Movie() {
		super();
	}


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getM_name() {
		return m_name;
	}


	public void setM_name(String m_name) {
		this.m_name = m_name;
	}


	public int getBuget() {
		return buget;
	}
	public void setBuget(int buget) {
		this.buget = buget;
	}
	
}
