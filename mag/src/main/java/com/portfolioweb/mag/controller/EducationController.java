package com.portfolioweb.mag.controller;

import com.portfolioweb.mag.model.Education;
import com.portfolioweb.mag.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {
    @Autowired
    private final EducationService educationService;
    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }
    @GetMapping("/traer")
    public ResponseEntity<List<Education>> getAllEducation(){
        List<Education> educations=educationService.findAllEducation();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    @PostMapping("/agregar")
    public ResponseEntity<Education> addEducation(@RequestBody Education education){
        Education newEducation=educationService.addEducation(education);
        return new ResponseEntity<>(newEducation,HttpStatus.CREATED);
    }
    @PutMapping("/editar")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education){
        Education updateEducation=educationService.updateEducation(education);
        return new ResponseEntity<>(updateEducation,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
