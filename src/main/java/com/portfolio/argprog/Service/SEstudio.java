package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Estudio;
import com.portfolio.argprog.Interface.IEstudio;
import com.portfolio.argprog.Repository.REstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEstudio implements IEstudio {
    @Autowired REstudio rEstudio;
    
    @Override
    public List<Estudio> getEstudio() {
        List<Estudio> estudio = rEstudio.findAll();
        return estudio;
    }

    @Override
    public void saveEstudio(Estudio estudio) {
        rEstudio.save(estudio);
    }

    @Override
    public void deleteEstudio(Long id) {
        rEstudio.deleteById(id);
    }

    @Override
    public Estudio findEstudio(Long id) {
        Estudio estudio = rEstudio.findById(id).orElse(null);
        return estudio;
        
    }
}