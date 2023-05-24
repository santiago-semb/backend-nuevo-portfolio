package com.portfolio.portfoliosan.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min=2,max=50,message="El nombre debe contener entre 2 y 50 caracteres.")
    private String nombre;
    
    @NotNull
    @Size(min=2,max=50,message="El apellido debe contener entre 2 y 50 caracteres.")
    private String apellido;
    
    @NotNull
    @Min(value=1)
    @Max(value=105)
    private int edad;
    
    @NotNull
    @Size(min=2,max=100,message="La fecha de nacimiento debe tener entre 2 y 100 caracteres.")
    private String fecha_de_nacimiento;
    
    @NotNull
    private String telefono;
    
    @NotNull
    @Size(min=2,max=100,message="La direccion email debe tener entre 2 y 100 caracteres.")
    private String email;
    
    @NotNull
    @Size(min=2,max=100,message="La direccion debe tener entre 2 y 100 caracteres.")
    private String direccion;
    
    @NotNull
    @Size(min=2,max=300,message="La descripcion debe tener entre 2 y 300 caracteres.")
    private String descripcion;
    
    @NotNull
    private String img;
    
    
}
