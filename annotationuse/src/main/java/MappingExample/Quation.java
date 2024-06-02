package MappingExample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Quation {
	
	@Id
	private int Quation_Id;
	private String qua;
	@OneToOne
	private Answer answer;
	
	public Quation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quation(int quation_Id, String quations1, Answer ans) {
		super();
		Quation_Id = quation_Id;
		qua = quations1;
		this.answer = ans;
	}
	public int getQuation_Id() {
		return Quation_Id;
	}
	public void setQuation_Id(int quation_Id) {
		Quation_Id = quation_Id;
	}
	public String getQuations() {
		return qua;
	}
	public void setQuations(String quations1) {
		qua = quations1;
	}
	public Answer getAns() {
		return answer;
	}
	public void setAns(Answer ans) {
		this.answer = ans;
	}

}
