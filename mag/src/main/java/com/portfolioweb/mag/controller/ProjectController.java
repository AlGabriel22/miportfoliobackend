package com.portfolioweb.mag.controller;

import com.portfolioweb.mag.model.Project;
import com.portfolioweb.mag.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {
    @Autowired
    private final ProjectService projectService;
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
    @GetMapping("/traer")
    public ResponseEntity<List<Project>> getAllProject(){
        List<Project> projects=projectService.findAllProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    @PostMapping("/agregar")
    public ResponseEntity<Project> addProject(@RequestBody Project project){
        Project newProject=projectService.addProject(project);
        return new ResponseEntity<>(newProject,HttpStatus.CREATED);
    }
    @PutMapping("/editar")
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project updateProject=projectService.updateProject(project);
        return new ResponseEntity<>(updateProject,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long id){
        projectService.deleteProject(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
