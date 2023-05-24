
package com.portfolio.portfoliosan.Repository;

import com.portfolio.portfoliosan.Entity.Certificado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICertificadoRepository extends JpaRepository<Certificado, Long> {
    
}
