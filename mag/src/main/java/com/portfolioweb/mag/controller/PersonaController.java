
package com.portfolioweb.mag.controller;

import com.portfolioweb.mag.model.Persona;
import com.portfolioweb.mag.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired
    private final PersonaService personaService;

    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    
    @GetMapping("/traer/{id}")
    public ResponseEntity<Persona> getPersonaById(@PathVariable("id")Long id){
        Persona persona=personaService.findPersonaById(id);
        return new ResponseEntity<>(persona, HttpStatus.OK);
    }
    
    @PutMapping("/editar")
    public ResponseEntity<Persona>updatePersona(@RequestBody Persona persona){
        Persona updatePersona=personaService.updatePersona(persona);
        return new ResponseEntity<>(updatePersona, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public String addPersona(@RequestBody Persona persona){
        personaService.addPersona(persona);
        return "La persona fue creada correctamente";
    }
}
