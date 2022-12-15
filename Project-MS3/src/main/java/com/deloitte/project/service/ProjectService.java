package com.deloitte.project.service;

import java.util.List;


import com.deloitte.project.entity.Projects;


public interface ProjectService {
	
	public List<Projects> getProjectById(Integer id);
	public List<Projects> getProjects();
	public Projects addProject(Projects project);

}
