package com.deloitte.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.project.dao.ProjectRepo;
import com.deloitte.project.entity.Projects;

@Service
public class ProjectServiceImpl implements ProjectService{
@Autowired
	private ProjectRepo projectRepo;
	@Override
	public List<Projects> getProjectById(Integer id) {
		
		return projectRepo.findByStaffid(id);
	}

	@Override
	public List<Projects> getProjects() {
		
		return projectRepo.findAll();
	}

	@Override
	public Projects addProject(Projects project) {
		
		return projectRepo.save(project);
	}

}
