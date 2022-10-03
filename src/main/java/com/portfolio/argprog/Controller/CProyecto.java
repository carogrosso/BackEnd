package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Proyecto;
import com.portfolio.argprog.Interface.IProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin
public class CProyecto {
    @Autowired
    IProyecto iProyecto;
    
    @GetMapping("/lista")
    public List<Proyecto> getProyecto(){
        return iProyecto.getProyecto();
    }

    @PostMapping("/crear")
    public void createProyecto(@RequestBody Proyecto proyecto){
        iProyecto.saveProyecto(proyecto);
//        return "El proyecto fue creado";
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteProyecto(@PathVariable Long id){
        iProyecto.deleteProyecto(id);
//        return "El proyecto fue eliminado";
    }
    
}
