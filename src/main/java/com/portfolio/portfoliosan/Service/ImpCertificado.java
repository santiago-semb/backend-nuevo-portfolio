package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Certificado;
import com.portfolio.portfoliosan.Interface.ICertificadoService;
import com.portfolio.portfoliosan.Repository.ICertificadoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpCertificado implements ICertificadoService {
    
    @Autowired
    ICertificadoRepository certificadoRepository;

    @Override
    public List getCertificados() {
        List<Certificado> certificados = certificadoRepository.findAll();
        return certificados;
    }

    @Override
    public void crearCertificado(Certificado certificado) {
        certificadoRepository.save(certificado);
    }

    @Override
    public void eliminarCertificado(Long id) {
        certificadoRepository.deleteById(id);
    }

    @Override
    public Certificado getCertificado(Long id) {
        Certificado certificado = certificadoRepository.findById(id).orElse(null);
        return certificado;
    }
    
}
