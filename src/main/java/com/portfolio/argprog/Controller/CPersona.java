package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Persona;
import com.portfolio.argprog.Interface.IPersona;
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
@RequestMapping("/persona")
@CrossOrigin(origins = "**")
public class CPersona {
    @Autowired
    IPersona iPersona;

    @GetMapping("/lista")
    public List<Persona> getPersona(){
        return iPersona.getPersona();
    }

    @PostMapping("/crear")
    public void createPersona(@RequestBody Persona persona){
        iPersona.savePersona(persona);
//        return "La persona fue creada";
    }

    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        iPersona.deletePersona(id);
//        return "La persona fue eliminada";
    }
    
    @GetMapping("/traer")
    public Persona findPersona(){
        return iPersona.findPersona((long)1);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> getById(@PathVariable("id") Long id){
        Persona persona = iPersona.findPersona(id);
        return new ResponseEntity(persona, HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public Persona editPersona(@PathVariable ("id") Long id, @RequestBody Persona personaNueva){
        Persona persona = iPersona.findPersona(id);
        
        persona.setNombre(personaNueva.getNombre());
        persona.setApellido(personaNueva.getApellido());
        persona.setTitulo(personaNueva.getTitulo());
        persona.setDescripcion(personaNueva.getDescripcion());
        persona.setImg(personaNueva.getImg());  
        
        iPersona.savePersona(persona);
        return persona;
    }
    
  
    
}