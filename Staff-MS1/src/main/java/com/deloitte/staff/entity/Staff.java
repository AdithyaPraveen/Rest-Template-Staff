package com.deloitte.staff.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Staff {
	@Id
	
	
	private Integer staffid;
	private String staffname;
	private String staffmail;
	private String dept;
	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(Integer staffid, String staffname, String staffmail, String dept) {
		super();
		this.staffid = staffid;
		this.staffname = staffname;
		this.staffmail = staffmail;
		this.dept = dept;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	public String getStaffname() {
		return staffname;
	}
	public void setStaffname(String staffname) {
		this.staffname = staffname;
	}
	public String getStaffmail() {
		return staffmail;
	}
	public void setStaffmail(String staffmail) {
		this.staffmail = staffmail;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	

}
