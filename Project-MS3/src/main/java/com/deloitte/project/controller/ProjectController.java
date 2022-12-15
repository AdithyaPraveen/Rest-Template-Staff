package com.deloitte.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.deloitte.project.entity.Projects;
import com.deloitte.project.service.ProjectService;

@RestController
@RequestMapping("/projects")
public class ProjectController {
	@Autowired
	private ProjectService projectService;
	@GetMapping("/getprojects")
	public ResponseEntity<List<Projects>> getProjects(){
		List<Projects> projectList=projectService.getProjects();
		return new ResponseEntity<List<Projects>>(projectList,HttpStatus.OK);
	}
	@GetMapping("/getProjectById/{p_id}")
	public ResponseEntity<List<Projects>> getProjectById(@PathVariable("p_id") Integer p_id)
	{
		List<Projects> projectList=projectService.getProjectById(p_id);
		return new ResponseEntity<List<Projects>>(projectList,HttpStatus.OK);
		
	}
	@PostMapping("/addProject")
	public Projects addProject(@RequestBody Projects invest)
	{
		return projectService.addProject(invest);
	}

}
