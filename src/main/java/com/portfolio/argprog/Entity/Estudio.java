package com.portfolio.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Estudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String titulo;
    private int anoEgreso;
    private String institucion;

    public Estudio() {
    }

    public Estudio(Long id, String titulo, int anoEgreso, String institucion) {
        this.id = id;
        this.titulo = titulo;
        this.anoEgreso = anoEgreso;
        this.institucion = institucion;
    }
    
    
}
