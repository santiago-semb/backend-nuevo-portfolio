package com.portfolio.portfoliosan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=2,max=100,message="La institucion debe contener entre 2 y 100 caracteres.")
    private String institucion;
    
    @NotNull
    private boolean completo;
    
    @NotNull
    @Size(min=2,max=100,message="La fecha debe contener entre 2 y 100 caracteres.")
    private String fecha;
    
    @NotNull
    @Size(min=2,max=100,message="El certificado debe contener entre 2 y 100 caracteres.")
    private String certificado;
    
    @NotNull
    private String link_certificado;
    
    @NotNull 
    private String img;
    
}
