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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=2,max=100,message="El lugar debe contener entre 2 y 100 caracteres.")
    private String lugar;
    
    @NotNull
    @Size(min=2,max=100,message="La direccion debe contener entre 2 y 100 caracteres.")
    private String direccion;
    
    @NotNull
    @Size(min=2,max=100,message="El tiempo debe contener entre 2 y 100 caracteres.")
    private String tiempo;
    
    @NotNull
    @Size(min=2,max=100,message="El desde debe contener entre 2 y 100 caracteres.")
    private String desde;
    
    @NotNull
    @Size(min=2,max=100,message="El hasta debe contener entre 2 y 100 caracteres.")
    private String hasta;
    
    @NotNull
    @Size(min=2,max=300,message="La descripcion debe contener entre 2 y 300 caracteres.")
    private String descripcion;
    
    @NotNull
    private String img;
}
