package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Estudio;
import java.util.List;

public interface IEstudio {
    
     //Traer una lista de estudios
    public List<Estudio> getEstudio();
    
    //Guardar un estudio
    public void saveEstudio(Estudio estudio);
    
    //Eliminar un estudio
    public void deleteEstudio(Long id);
    
    //Buscar un estudio
    public Estudio findEstudio(Long id);
}
