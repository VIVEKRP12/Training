package com.Sprint2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sprint2.Entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
	Project findByProjectId(long project);

}
