package com.Sprint2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sprint2.Entity.Project;
import com.Sprint2.Repository.ProjectRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository; 
	
	public Project saveProject(Project project) {
		log.info("Inside saveProject of ProjectService");
				return projectRepository.save(project);
	}
	
	public Project findProjectById(long projectId) {
		log.info("Inside findProjectById of ProjectService");
		return projectRepository.findByProjectId(projectId);
	}
}
