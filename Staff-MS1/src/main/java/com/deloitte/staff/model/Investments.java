package com.deloitte.staff.model;

public class Investments {

	private Integer investId;
	private  String investType;
	private Double investAmt;
	private Integer staffid;
	public Investments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Investments(Integer investId, String investType, Double investAmt, Integer staffid) {
		super();
		this.investId = investId;
		this.investType = investType;
		this.investAmt = investAmt;
		this.staffid = staffid;
	}
	public Integer getInvestId() {
		return investId;
	}
	public void setInvestId(Integer investId) {
		this.investId = investId;
	}
	public String getInvestType() {
		return investType;
	}
	public void setInvestType(String investType) {
		this.investType = investType;
	}
	public Double getInvestAmt() {
		return investAmt;
	}
	public void setInvestAmt(Double investAmt) {
		this.investAmt = investAmt;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	
}
