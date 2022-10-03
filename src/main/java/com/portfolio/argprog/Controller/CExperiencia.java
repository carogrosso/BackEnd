package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Experiencia;
import com.portfolio.argprog.Interface.IExperiencia;
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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "https://portfolio-ap-b079f.firebaseapp.com")
public class CExperiencia {
    @Autowired
    IExperiencia iExperiencia;
    
    @GetMapping("/lista")
    public List<Experiencia> getExperiencia(){
        return iExperiencia.getExperiencia();
    }

    @PostMapping("/crear")
    public void createExperiencia(@RequestBody Experiencia experiencia){
        iExperiencia.saveExperiencia(experiencia);
//        return "La experiencia fue creada";
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        iExperiencia.deleteExperiencia(id);
//        return "La experiencia fue eliminada";
    }
    
    @GetMapping("/traer")
    public Experiencia findExperiencia(){
        return iExperiencia.findExperiencia((long)1);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> getById(@PathVariable("id") Long id){
        Experiencia experiencia = iExperiencia.findExperiencia(id);
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }
    
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Experiencia> editExperiencia(@PathVariable ("id") Long id, @RequestBody Experiencia experienciaNueva) {
        Experiencia experiencia = iExperiencia.findExperiencia(id);
        
        experiencia.setEmpresa(experienciaNueva.getEmpresa());
        experiencia.setDesde(experienciaNueva.getDesde());
        experiencia.setHasta(experienciaNueva.getHasta());
        experiencia.setDescripcion(experienciaNueva.getDescripcion());  
        
        iExperiencia.saveExperiencia(experiencia);
        return new ResponseEntity(experienciaNueva, HttpStatus.OK);
    }
    
//     @PutMapping("/update/{id}")
//    public Experiencia editExperiencia(@PathVariable ("id") Long id, @RequestBody Experiencia experienciaNueva) {
//        Experiencia experiencia = iExperiencia.findExperiencia(id);
//        
//        experiencia.setEmpresa(experienciaNueva.getEmpresa());
//        experiencia.setDesde(experienciaNueva.getDesde());
//        experiencia.setHasta(experienciaNueva.getHasta());
//        experiencia.setDescripcion(experienciaNueva.getDescripcion());  
//        
//        iExperiencia.saveExperiencia(experiencia);
//        return experiencia;
//    }
}
