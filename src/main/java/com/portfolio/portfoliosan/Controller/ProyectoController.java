package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Proyecto;
import com.portfolio.portfoliosan.Interface.IProyectoService;
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
public class ProyectoController {
    
    @Autowired
    IProyectoService proyectoService;
    
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyectos(){
        List<Proyecto> proyectos = proyectoService.getProyectos();
        return proyectos;
    }
    
    @GetMapping("/proyecto/traer/{id}")
    public Proyecto getProyecto(@PathVariable Long id){
        Proyecto proyecto = proyectoService.getProyecto(id);
        return proyecto;
    }
    
    @PostMapping("/proyecto/crear")
    public String crearProyecto(@RequestBody Proyecto proyecto){
        proyectoService.crearProyecto(proyecto);
        return "Se ha creado el proyecto con nombre '" + proyecto.getNombre() + "' correctamente.";
    }
    
    @DeleteMapping("/proyecto/eliminar/{id}")
    public String eliminarProyecto(@PathVariable Long id){
        proyectoService.eliminarProyecto(id);
        return "Se ha eliminado el proyecto correctamente. (" + id + ")";
    }
    
    @PutMapping("/proyecto/actualizar/{id}")
    public Proyecto actualizarProyecto(@PathVariable Long id,
                                       @RequestParam("nombre") String nombre,
                                       @RequestParam("descripcion") String descripcion,
                                       @RequestParam("lenguajes") String lenguajes,
                                       @RequestParam("link") String link
    ){
        Proyecto proyectoActualizar = proyectoService.getProyecto(id);
        proyectoActualizar.setNombre(nombre);
        proyectoActualizar.setDescripcion(descripcion);
        proyectoActualizar.setLenguajes(lenguajes);
        proyectoActualizar.setLink(link);
        
        proyectoService.crearProyecto(proyectoActualizar);
        return proyectoActualizar;
    }
    
}
