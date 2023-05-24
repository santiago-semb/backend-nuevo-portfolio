package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List getExperiencias();
    
    public void crearExperiencia(Experiencia experiencia);
    
    public void eliminarExperiencia(Long id);
    
    public Experiencia getExperiencia(Long id);
    
}
