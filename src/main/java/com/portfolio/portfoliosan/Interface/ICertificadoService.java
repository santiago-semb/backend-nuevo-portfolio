package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Certificado;
import java.util.List;

public interface ICertificadoService {
    
    public List getCertificados();
    
    public void crearCertificado(Certificado certificado);
    
    public void eliminarCertificado(Long id);
    
    public Certificado getCertificado(Long id);
    
}
