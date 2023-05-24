package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Persona;
import com.portfolio.portfoliosan.Interface.IPersonaService;
import com.portfolio.portfoliosan.Repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersona implements IPersonaService {
    
    @Autowired
    IPersonaRepository personaRepository;
    
    @Override
    public List<Persona> getPersonas() {
        List<Persona> personas = personaRepository.findAll();
        return personas;
    }
    
    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }
    
    @Override
    public void eliminarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona getPersona(Long id) {
        Persona persona = personaRepository.findById(id).orElse(null);
        return persona;
    }

    
    
}
