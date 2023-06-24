package com.portfolioweb.mag.controller;

import com.portfolioweb.mag.model.Experience;
import com.portfolioweb.mag.service.ExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experience")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {
    @Autowired
    private final ExperienceService experienceService;
    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }
    @GetMapping("/traer")
    public ResponseEntity<List<Experience>> getAllExperience(){
        List<Experience> experiences=experienceService.findAllExperience();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Experience> addExperience(@RequestBody Experience experience){
        Experience newExperience=experienceService.addExperience(experience);
        return new ResponseEntity<>(newExperience,HttpStatus.CREATED);
    }
    @PutMapping("/editar")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience){
        Experience updateExperience=experienceService.updateExperience(experience);
        return new ResponseEntity<>(updateExperience,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
