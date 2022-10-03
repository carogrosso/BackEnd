package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Persona;
import java.util.List;

public interface IPersona {
    
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar una persona
    public void savePersona(Persona persona);
    
    //Eliminar una persona
    public void deletePersona(Long id);
    
    //Buscar una persona
    public Persona findPersona(Long id);
}
