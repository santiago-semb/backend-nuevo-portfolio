package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Certificado;
import com.portfolio.portfoliosan.Interface.ICertificadoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CertificadoController {
    
    @Autowired
    ICertificadoService certificadoService;
    
    @GetMapping("/certificado/traer")
    public List<Certificado> getCertificados(){
        List<Certificado> certificados = certificadoService.getCertificados();
        return certificados;
    }
    
    @GetMapping("/certificado/traer/{id}")
    public Certificado getCertificado(@PathVariable Long id){
        Certificado certificado = certificadoService.getCertificado(id);
        return certificado;
    }
    
    @PostMapping("/certificado/crear")
    public String crearCertificado(@RequestBody Certificado certificado){
        certificadoService.crearCertificado(certificado);
        return "Se ha creado el certificado con nombre '" + certificado.getNombre() + "' correctamente.";
    }
    
    @DeleteMapping("/certificado/eliminar/{id}")
    public String eliminarCertificado(@PathVariable Long id){
        certificadoService.eliminarCertificado(id);
        return "Se ha eliminado el certificado correctamente. (" + id + ")";
    }
    
    @PutMapping("/certificado/actualizar/{id}")
    public Certificado actualizarCertificado(@PathVariable Long id,
                                             @RequestParam("nombre") String nombre,
                                             @RequestParam("fecha") String fecha,
                                             @RequestParam("link") String link,
                                             @RequestParam("img") String img
    ){
        
        Certificado certificadoActualizar = certificadoService.getCertificado(id);
        certificadoActualizar.setNombre(nombre);
        certificadoActualizar.setFecha(fecha);
        certificadoActualizar.setLink(link);
        certificadoActualizar.setImg(img);
        
        certificadoService.crearCertificado(certificadoActualizar);
        return certificadoActualizar;
        
    }
    
}
