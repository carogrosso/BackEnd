package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Skill;
import com.portfolio.argprog.Interface.ISkill;
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
@RequestMapping("/skill")
@CrossOrigin(origins = "https://carogrosso-portfolio.web.app")
public class CSkill {
    @Autowired
    ISkill iSkill;
    
    @GetMapping("/lista")
    public List<Skill> getSkill(){
        return iSkill.getSkill();
    }

    @PostMapping("/crear")
    public void createSkill(@RequestBody Skill skill){
        iSkill.saveSkill(skill);
//        return "La skill fue creada";
    }

    @DeleteMapping("/borrar/{id}")
    public void deleteSkill(@PathVariable Long id){
        iSkill.deleteSkill(id);
//        return "La skill fue eliminada";
    }
}
