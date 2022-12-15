package com.deloitte.staff.model;

import java.util.List;

import com.deloitte.staff.entity.Staff;

public class Response {
	
	private Staff staff;
	List<Investments> invest;
	List<Projects> project;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Staff staff,
			List<Investments> invest,
			List<Projects> project) {
		super();
		this.staff = staff;
		this.project = project;
		this.invest=invest;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public List<Investments> getInvest() {
		return invest;
	}
	public void setInvest(List<Investments> invest) {
		this.invest = invest;
	}
	public List<Projects> getProject() {
		return project;
	}
	public void setProject(List<Projects> project) {
		this.project = project;
	}
	

}
