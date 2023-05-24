package com.portfolio.portfoliosan.Interface;

import com.portfolio.portfoliosan.Entity.Skills;
import java.util.List;

public interface ISkillsService {
    
    public List getSkills();
    
    public void crearSkill(Skills skill);
    
    public void eliminarSkill(Long id);
    
    public Skills getSkill(Long id);
    
}
