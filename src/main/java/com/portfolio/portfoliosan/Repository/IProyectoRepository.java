package com.portfolio.portfoliosan.Repository;

import com.portfolio.portfoliosan.Entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProyectoRepository extends JpaRepository<Proyecto, Long> {
    
}
