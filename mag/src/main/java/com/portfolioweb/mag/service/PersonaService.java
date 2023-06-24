
package com.portfolioweb.mag.service;

import com.portfolioweb.mag.model.Persona;
import com.portfolioweb.mag.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PersonaService {
    private final PersonaRepository personaRepository;
    
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }
    public Persona addPersona(Persona persona){
        return personaRepository.save(persona);
    }
    public Persona updatePersona(Persona persona){
        return personaRepository.save(persona);
    }
    public Persona findPersonaById(Long id){
        return (Persona) personaRepository.findById(id).orElseThrow(null);
    }
}
