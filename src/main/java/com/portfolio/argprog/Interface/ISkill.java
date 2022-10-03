package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Skill;
import java.util.List;


public interface ISkill {
     //Traer una lista de skills
    public List<Skill> getSkill();
    
    //Guardar una skill
    public void saveSkill(Skill skill);
    
    //Eliminar una skill
    public void deleteSkill(Long id);
    
    //Buscar una skill
    public Skill findSkill(Long id);
}
