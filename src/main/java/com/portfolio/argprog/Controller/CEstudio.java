package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Estudio;
import com.portfolio.argprog.Interface.IEstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudio")
@CrossOrigin(origins = "https://portfolio-ap-b079f.web.app")
public class CEstudio {
    @Autowired
    IEstudio iEstudio;
    
    @GetMapping("/lista")
    public List<Estudio> getEstudio(){
        return iEstudio.getEstudio();
    }

    @PostMapping("/crear")
    public void createEstudio(@RequestBody Estudio estudio){
        iEstudio.saveEstudio(estudio);
//        return "El item fue creado";
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteEstudio(@PathVariable Long id){
        iEstudio.deleteEstudio(id);
//        return "La experiencia fue eliminada";
    }
    
//    @GetMapping("/traer")
//    public Estudio findEstudio(){
//        return iEstudio.findEstudio((long)1);
//    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Estudio> getById(@PathVariable("id") Long id){
        Estudio estudio = iEstudio.findEstudio(id);
        return new ResponseEntity(estudio, HttpStatus.OK);
    }
    
     @PutMapping("/update/{id}")
    public Estudio editEstudio(@PathVariable ("id") Long id, @RequestBody Estudio estudioNuevo){
        Estudio estudio = iEstudio.findEstudio(id);
        
        estudio.setTitulo(estudioNuevo.getTitulo());
        estudio.setAnoEgreso(estudioNuevo.getAnoEgreso());
        estudio.setInstitucion(estudioNuevo.getInstitucion());
        
        iEstudio.saveEstudio(estudio);
        return estudio;
    }
}
