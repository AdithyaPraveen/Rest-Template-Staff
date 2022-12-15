package com.deloitte.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Projects {
	
	@Id
	private Integer projectId;
	private String projectName;
	private String projectTechs;
	private Integer staffid;
	public Projects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Projects(Integer projectId, String projectName, String projectTechs, Integer staffid) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectTechs = projectTechs;
		this.staffid = staffid;
	}
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectTechs() {
		return projectTechs;
	}
	public void setProjectTechs(String projectTechs) {
		this.projectTechs = projectTechs;
	}
	public Integer getStaffid() {
		return staffid;
	}
	public void setStaffid(Integer staffid) {
		this.staffid = staffid;
	}
	
	

}
