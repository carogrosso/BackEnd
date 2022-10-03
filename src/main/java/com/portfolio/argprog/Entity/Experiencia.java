package com.portfolio.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String empresa;
    private int desde;
    private int hasta;
    private String descripcion;
    
    public Experiencia() {
    }

//    public Experiencia(Long id, String empresa, int desde, int hasta, String descripcion) {
//        this.id = id;
//        this.empresa = empresa;
//        this.desde = desde;
//        this.hasta = hasta;
//        this.descripcion = descripcion;
//    }
    
    public Experiencia(String empresa, int desde, int hasta, String descripcion) {
        this.empresa = empresa;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
    }

}