package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Experiencia;
import com.portfolio.argprog.Interface.IExperiencia;
import com.portfolio.argprog.Repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia implements IExperiencia {
    @Autowired RExperiencia rExperiencia;
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = rExperiencia.findAll();
        return experiencia;
    }
    
    public Optional<Experiencia> getOne(Long id){
        return rExperiencia.findById(id);
    }
    
     public boolean existsById(Long id){
         return rExperiencia.existsById(id);
     }
    
    @Override
    public void saveExperiencia(Experiencia experiencia) {
        rExperiencia.save(experiencia);
    }

    @Override
    public void deleteExperiencia(Long id) {
        rExperiencia.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        return rExperiencia.findById(id).orElse(null);
     
        
    }
    
//    public Optional<Experiencia> getOne(int id){
//         return rExperiencia.findById(id);
//     }
}