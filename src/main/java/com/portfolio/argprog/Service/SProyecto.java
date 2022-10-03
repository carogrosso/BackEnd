package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Proyecto;
import com.portfolio.argprog.Interface.IProyecto;
import com.portfolio.argprog.Repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto implements IProyecto{
    @Autowired RProyecto rProyecto;
    
    @Override
    public List<Proyecto> getProyecto() {
        List<Proyecto> proyecto = rProyecto.findAll();
        return proyecto;
    }
    
    @Override
    public void saveProyecto(Proyecto proyecto) {
        rProyecto.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
        rProyecto.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proyecto = rProyecto.findById(id).orElse(null);
        return proyecto;
        
    }
    
}
