package com.deloitte.staff.model;

import com.deloitte.staff.entity.Staff;

public class FailureResponse {
	
	private Staff staff;
	private String message;
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FailureResponse(Staff staff, String message) {
		super();
		this.staff = staff;
		this.message = message;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
