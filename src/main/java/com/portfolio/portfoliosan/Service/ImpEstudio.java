package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Estudio;
import com.portfolio.portfoliosan.Interface.IEstudioService;
import com.portfolio.portfoliosan.Repository.IEstudioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEstudio implements IEstudioService {
    
    @Autowired
    IEstudioRepository estudioRepository;

    @Override
    public List getEstudios() {
        List<Estudio> estudios = estudioRepository.findAll();
        return estudios;
    }

    @Override
    public void crearEstudio(Estudio estudio) {
        estudioRepository.save(estudio);
    }

    @Override
    public void eliminarEstudio(Long id) {
        estudioRepository.deleteById(id);
    }

    @Override
    public Estudio getEstudio(Long id) {
        Estudio estudio = estudioRepository.findById(id).orElse(null);
        return estudio;
    }
    
}
