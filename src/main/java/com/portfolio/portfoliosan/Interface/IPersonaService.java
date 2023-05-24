package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List getPersonas();
    
    public void crearPersona(Persona persona);
    
    public void eliminarPersona(Long id);
    
    public Persona getPersona(Long id);
    
}
