
package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Experiencia;
import com.portfolio.portfoliosan.Interface.IExperienciaService;
import com.portfolio.portfoliosan.Repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperiencia implements IExperienciaService {
    
    @Autowired
    IExperienciaRepository expRepository;

    @Override
    public List getExperiencias() {
        List<Experiencia> experiencias = expRepository.findAll();
        return experiencias;
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        expRepository.save(experiencia);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experiencia getExperiencia(Long id) {
        Experiencia experiencia = expRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
