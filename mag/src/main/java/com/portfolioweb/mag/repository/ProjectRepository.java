package com.portfolioweb.mag.repository;

import com.portfolioweb.mag.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
