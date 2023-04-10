package io.springboot.project1.starter.normalization;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Normalization 
{
	@Id
	private String number;
	private String state;
	private String plan;
	
	public Normalization() {
		
	}
	
	public Normalization(String number, String state, String plan) {
		super();
		this.number = number;
		this.state = state;
		this.plan = plan;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}

}
