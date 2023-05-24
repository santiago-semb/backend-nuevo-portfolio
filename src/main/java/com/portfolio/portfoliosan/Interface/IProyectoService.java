package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List getProyectos();
    
    public void crearProyecto(Proyecto proyecto);
    
    public void eliminarProyecto(Long id);
    
    public Proyecto getProyecto(Long id);
    
}
