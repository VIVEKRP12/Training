package com.Sprint2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sprint2.Entity.Project;
import com.Sprint2.Service.ProjectService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/projects")
@Slf4j
class ProjectController {
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("/")
	public Project saveProject(@RequestBody Project project) {
		log.info("Inside saveDepartment method of DepartmentController");
		
		return projectService.saveProject(project);
	}

	@GetMapping("/{id}")
	public Project findProjectById(@PathVariable("id") Long projectId) {
		log.info("Inside findProjectById method of ProjectController");
		return projectService.findProjectById(projectId);
	}
}
