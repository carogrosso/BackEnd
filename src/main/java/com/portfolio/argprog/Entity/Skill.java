package com.portfolio.argprog.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String skill;
    private int porcentaje;
    private String color;

    public Skill() {
    }

    public Skill(Long id, String skill, int porcentaje, String color) {
        this.id = id;
        this.skill = skill;
        this.porcentaje = porcentaje;
        this.color = color;
    }
    
    
}
