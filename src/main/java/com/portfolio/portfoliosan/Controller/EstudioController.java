package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Estudio;
import com.portfolio.portfoliosan.Interface.IEstudioService;
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
public class EstudioController {
    
    @Autowired
    IEstudioService estudioService;
    
    @GetMapping("/estudio/traer")
    public List<Estudio> getEstudios(){
        List<Estudio> estudios = estudioService.getEstudios();
        return estudios;
    }
    
    @GetMapping("/estudio/traer/{id}")
    public Estudio getEstudio(@PathVariable Long id){
        Estudio estudio = estudioService.getEstudio(id);
        return estudio;
    }
    
    @PostMapping("/estudio/crear")
    public String crearEstudio(@RequestBody Estudio estudio){
        estudioService.crearEstudio(estudio);
        return "Se ha creado el estudio con nombre de institucion '" + estudio.getInstitucion() + "' correctamente.";
    }
    
    @DeleteMapping("/estudio/eliminar/{id}")
    public String eliminarEstudio(@PathVariable Long id){
        estudioService.eliminarEstudio(id);
        return "Se ha eliminado el estudio correctamente. (" + id + ")";
    }
    
    @PutMapping("/estudio/actualizar/{id}")
    public Estudio actualizarEstudio(
                                    @PathVariable Long id,
                                    @RequestParam("institucion") String institucion,
                                    @RequestParam("completo") boolean completo,
                                    @RequestParam("fecha") String fecha,
                                    @RequestParam("certificado") String certificado,
                                    @RequestParam("link_certificado") String link_certificado,
                                    @RequestParam("img") String img
    ){
        Estudio estudioActualizar = estudioService.getEstudio(id);
        estudioActualizar.setInstitucion(institucion);
        estudioActualizar.setCompleto(completo);
        estudioActualizar.setFecha(fecha);
        estudioActualizar.setCertificado(certificado);
        estudioActualizar.setLink_certificado(link_certificado);
        estudioActualizar.setImg(img);
        
        estudioService.crearEstudio(estudioActualizar);
        return estudioActualizar;
        
    }
    
}
