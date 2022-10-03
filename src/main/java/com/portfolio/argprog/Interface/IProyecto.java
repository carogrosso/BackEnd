package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Proyecto;
import java.util.List;

public interface IProyecto {
    
    //Traer una lista de proyectos
    public List<Proyecto> getProyecto();
    
    //Guardar un proyecto
    public void saveProyecto(Proyecto proyecto);
    
    //Eliminar un proyecto
    public void deleteProyecto(Long id);
    
    //Buscar un proyecto
    public Proyecto findProyecto(Long id);
    
}
