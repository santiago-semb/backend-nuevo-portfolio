package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Estudio;
import java.util.List;

public interface IEstudioService {
    
    public List getEstudios();
    
    public void crearEstudio(Estudio estudio);
    
    public void eliminarEstudio(Long id);
    
    public Estudio getEstudio(Long id);
    
}
