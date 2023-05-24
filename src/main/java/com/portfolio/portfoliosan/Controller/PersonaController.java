package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Persona;
import com.portfolio.portfoliosan.Interface.IPersonaService;
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
public class PersonaController {
    
    @Autowired
    IPersonaService personaService;
    
    @GetMapping("/persona/traer")
    public List<Persona> getPersonas(){
        List<Persona> personas = personaService.getPersonas();
        return personas;
    }
    
    @GetMapping("/persona/traer/{id}")
    public Persona getPersona(@PathVariable Long id){
        Persona persona = personaService.getPersona(id);
        return persona;
    }
    
    @PostMapping("/persona/crear")
    public String crearPersona(@RequestBody Persona persona){
        personaService.crearPersona(persona);
        return "Se ha creado la persona con nombre '" + persona.getNombre() + " " + persona.getApellido() + "' correctamente.";
    }
    
    @DeleteMapping("/persona/eliminar/{id}")
    public String eliminarPersona(@PathVariable Long id){
        personaService.eliminarPersona(id);
        return "Se ha eliminado la persona correctamente. (" + id + ")";
    }
    
    @PutMapping("/persona/actualizar/{id}")
    public Persona actualizarPersona(@PathVariable Long id,
                                         @RequestParam("nombre") String nombre,
                                         @RequestParam("apellido") String apellido,
                                         @RequestParam("edad") int edad,
                                         @RequestParam("fecha_de_nacimiento") String fechaDeNacimiento,
                                         @RequestParam("telefono") String telefono,
                                         @RequestParam("email") String email,
                                         @RequestParam("direccion") String direccion,
                                         @RequestParam("descripcion") String descripcion,
                                         @RequestParam("img") String img)
    {
        Persona personaActualizar = personaService.getPersona(id);
        personaActualizar.setNombre(nombre);
        personaActualizar.setApellido(apellido);
        personaActualizar.setEdad(edad);
        personaActualizar.setFecha_de_nacimiento(fechaDeNacimiento);
        personaActualizar.setTelefono(telefono);
        personaActualizar.setEmail(email);
        personaActualizar.setDireccion(direccion);
        personaActualizar.setDescripcion(descripcion);
        personaActualizar.setImg(img);

        personaService.crearPersona(personaActualizar);
        return personaActualizar;
    }
    
}
