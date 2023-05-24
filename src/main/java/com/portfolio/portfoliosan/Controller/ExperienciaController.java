package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Experiencia;
import com.portfolio.portfoliosan.Interface.IExperienciaService;
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
public class ExperienciaController {
    
    @Autowired
    IExperienciaService expService;
    
    @GetMapping("/exp/traer")
    public List<Experiencia> getExperiencias(){
        List<Experiencia> experiencias = expService.getExperiencias();
        return experiencias;
    }
    
    @GetMapping("/exp/traer/{id}")
    public Experiencia getExperiencia(@PathVariable Long id){
        Experiencia experiencia = expService.getExperiencia(id);
        return experiencia;
    }
    
    @PostMapping("/exp/crear")
    public String crearExperiencia(@RequestBody Experiencia experiencia){
        expService.crearExperiencia(experiencia);
        return "Se ha creado la experiencia en el lugar '" + experiencia.getLugar() + "' correctamente.";
    }
    
    @DeleteMapping("/exp/eliminar/{id}")
    public String eliminarExperiencia(@PathVariable Long id){
        expService.eliminarExperiencia(id);
        return "Se ha eliminado la experiencia correctamente. (" + id + ")";
    }
    
    @PutMapping("/exp/actualizar/{id}")
    public Experiencia actualizarExperiencia(@PathVariable Long id,
                                             @RequestParam("lugar") String lugar,
                                             @RequestParam("direccion") String direccion,
                                             @RequestParam("tiempo") String tiempo,
                                             @RequestParam("desde") String desde,
                                             @RequestParam("hasta") String hasta,
                                             @RequestParam("descripcion") String descripcion,
                                             @RequestParam("img") String img
    ){
        Experiencia expActualizar = expService.getExperiencia(id);
        expActualizar.setLugar(lugar);
        expActualizar.setDireccion(direccion);
        expActualizar.setTiempo(tiempo);
        expActualizar.setDesde(desde);
        expActualizar.setHasta(hasta);
        expActualizar.setDescripcion(descripcion);
        expActualizar.setImg(img);
        
        expService.crearExperiencia(expActualizar);
        return expActualizar;
        
    }
    
}
