package com.deloitte.investment.model;

import java.util.List;

import com.deloitte.investment.entity.Investments;

public class FailureResponse {
	
	private List<Investments> invest;
	private String message;
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponse(List<Investments> invest, String message) {
		super();
		this.invest = invest;
		this.message = message;
	}
	public List<Investments> getInvest() {
		return invest;
	}
	public void setInvest(List<Investments> invest) {
		this.invest = invest;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}