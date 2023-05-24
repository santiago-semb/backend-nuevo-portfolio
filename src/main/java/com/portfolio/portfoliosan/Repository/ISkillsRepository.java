package com.portfolio.portfoliosan.Repository;

import com.portfolio.portfoliosan.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISkillsRepository extends JpaRepository<Skills, Long> {
    
    
    
}
