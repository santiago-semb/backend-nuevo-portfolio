package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Proyecto;
import com.portfolio.portfoliosan.Interface.IProyectoService;
import com.portfolio.portfoliosan.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyecto implements IProyectoService {
    
    @Autowired
    IProyectoRepository proyectoRepository;

    @Override
    public List getProyectos() {
        List<Proyecto> proyectos = proyectoRepository.findAll();
        return proyectos;
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        proyectoRepository.save(proyecto);
    }

    @Override
    public void eliminarProyecto(Long id) {
        proyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto getProyecto(Long id) {
        Proyecto proyecto = proyectoRepository.findById(id).orElse(null);
        return proyecto;
    }
    
}
