package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Experiencia;
import java.util.List;

public interface IExperiencia {
    
    //Traer una lista de experiencias
    public List<Experiencia> getExperiencia();
    
    //Guardar una experiencia
    public void saveExperiencia(Experiencia experiencia);
    
    //Eliminar una experiencia
    public void deleteExperiencia(Long id);
    
    //Buscar una experiencia
    public Experiencia findExperiencia(Long id);
    
}
