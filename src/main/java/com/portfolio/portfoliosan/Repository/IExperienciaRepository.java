package com.portfolio.portfoliosan.Repository;

import com.portfolio.portfoliosan.Entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IExperienciaRepository extends JpaRepository<Experiencia, Long> {
    
}
