package com.portfolio.portfoliosan.Repository;

import com.portfolio.portfoliosan.Entity.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudioRepository extends JpaRepository<Estudio, Long> {
    
}
