package MappingExample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	private int ansid;
	private String ans;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Answer(int ansid, String ans) {
		super();
		this.ansid = ansid;
		this.ans = ans;
	}

	public int getAnsid() {
		return ansid;
	}

	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}

}
