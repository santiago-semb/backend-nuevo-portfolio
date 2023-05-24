package com.portfolio.portfoliosan.Controller;

import com.portfolio.portfoliosan.Entity.Skills;
import com.portfolio.portfoliosan.Interface.ISkillsService;
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
public class SkillsController {
    
    @Autowired
    ISkillsService skillService;
    
    @GetMapping("/skill/traer")
    public List<Skills> getSkills(){
        List<Skills> skills = skillService.getSkills();
        return skills;
    }
    
    @GetMapping("/skill/traer/{id}")
    public Skills getSkill(@PathVariable Long id){
        Skills skill = skillService.getSkill(id);
        return skill;
    }
    
    @PostMapping("/skill/crear")
    public String crearSkill(@RequestBody Skills skill){
        skillService.crearSkill(skill);
        return "Se ha creado la skill con nombre '" + skill.getNombre() + "' correctamente.";
    }
    
    @DeleteMapping("/skill/eliminar/{id}")
    public String eliminarSkill(@PathVariable Long id){
        skillService.eliminarSkill(id);
        return "Se ha eliminado la skill correctamente. (" + id + ")";
    }
    
    @PutMapping("/skill/actualizar/{id}")
    public Skills actualizarSkill(@PathVariable Long id,
                                  @RequestParam("nombre") String nombre,
                                  @RequestParam("img") String img
    ){
        Skills skillActualizar = skillService.getSkill(id);
        skillActualizar.setNombre(nombre);
        skillActualizar.setImg(img);
        
        skillService.crearSkill(skillActualizar);
        return skillActualizar;
    }
    
}
