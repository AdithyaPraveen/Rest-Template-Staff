package com.deloitte.mutual.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MutualFund {
	
	@Id
	private Integer policyNo;
	private String companyName;
	private Double policyAmt;
	private Integer policyDuration;
	private Integer investId;
	public MutualFund() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MutualFund(Integer policyNo, String companyName, Double policyAmt, Integer policyDuration,
			Integer investId) {
		super();
		this.policyNo = policyNo;
		this.companyName = companyName;
		this.policyAmt = policyAmt;
		this.policyDuration = policyDuration;
		this.investId = investId;
	}
	public Integer getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(Integer policyNo) {
		this.policyNo = policyNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Double getPolicyAmt() {
		return policyAmt;
	}
	public void setPolicyAmt(Double policyAmt) {
		this.policyAmt = policyAmt;
	}
	public Integer getPolicyDuration() {
		return policyDuration;
	}
	public void setPolicyDuration(Integer policyDuration) {
		this.policyDuration = policyDuration;
	}
	public Integer getInvestId() {
		return investId;
	}
	public void setInvestId(Integer investId) {
		this.investId = investId;
	}
	
}