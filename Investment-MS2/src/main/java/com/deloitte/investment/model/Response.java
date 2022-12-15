package com.deloitte.investment.model;

import java.util.List;

import com.deloitte.investment.entity.Investments;


public class Response {
	
	private Investments invest;
	private List<MutualFund> mutual;
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(Investments invest, List<MutualFund> mutual) {
		super();
		this.invest = invest;
		this.mutual = mutual;
	}

	public Investments getInvest() {
		return invest;
	}

	public void setInvest(Investments invest) {
		this.invest = invest;
	}

	public List<MutualFund> getMutual() {
		return mutual;
	}

	public void setMutual(List<MutualFund> mutual) {
		this.mutual = mutual;
	}
	
}