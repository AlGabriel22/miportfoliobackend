package com.portfolioweb.mag.controller;

import com.portfolioweb.mag.model.Skill;
import com.portfolioweb.mag.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill")
@CrossOrigin(origins = "http://localhost:4200")
public class SkillController {
    @Autowired
    private final SkillService skillService;
    public SkillController(SkillService skillService){
        this.skillService = skillService;
    }
    @GetMapping("/traer")
    public ResponseEntity<List<Skill>> getAllSkill(){
        List<Skill> skills=skillService.findAllSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    @PostMapping("/agregar")
    public ResponseEntity<Skill> addSkill(@RequestBody Skill skill){
        Skill newSkill=skillService.addSkill(skill);
        return new ResponseEntity<>(newSkill,HttpStatus.CREATED);
    }
    @PutMapping("/editar")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill project){
        Skill updateSkill=skillService.updateSkill(project);
        return new ResponseEntity<>(updateSkill,HttpStatus.OK);
    }
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
