package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Persona;
import com.portfolio.argprog.Interface.IPersona;
import com.portfolio.argprog.Repository.RPersona;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements IPersona{
    @Autowired RPersona rPersona;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = rPersona.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        rPersona.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        rPersona.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = rPersona.findById(id).orElse(null);
        return persona;
        
    }
    
}
