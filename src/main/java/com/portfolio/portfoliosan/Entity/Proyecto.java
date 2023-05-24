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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=2,max=100,message="El nombre debe contener entre 2 y 100 caracteres.")
    private String nombre;
    
    @NotNull
    @Size(min=2,max=300,message="La descripcion debe contener entre 2 y 300 caracteres.")
    private String descripcion;
    
    @NotNull
    @Size(min=2,max=200,message="Los lenguajes deben contener entre 2 y 200 caracteres.")
    private String lenguajes;
    
    @NotNull
    private String link;
    
}
