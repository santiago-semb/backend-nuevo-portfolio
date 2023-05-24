package com.portfolio.portfoliosan.Service;

import com.portfolio.portfoliosan.Entity.Skills;
import com.portfolio.portfoliosan.Interface.ISkillsService;
import com.portfolio.portfoliosan.Repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpSkills implements ISkillsService {
    
    @Autowired
    ISkillsRepository skillRepository;

    @Override
    public List getSkills() {
        List<Skills> skills = skillRepository.findAll();
        return skills;
    }

    @Override
    public void crearSkill(Skills skill) {
        skillRepository.save(skill);
    }

    @Override
    public void eliminarSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skills getSkill(Long id) {
        Skills skill = skillRepository.findById(id).orElse(null);
        return skill;
    }
    
    
    
}
