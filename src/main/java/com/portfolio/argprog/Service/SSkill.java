package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.argprog.Interface.ISkill;
import com.portfolio.argprog.Repository.RSkill;

@Service
public class SSkill implements ISkill {
    @Autowired RSkill rSkill;
    
    @Override
    public List<Skill> getSkill() {
        List<Skill> hardskill = rSkill.findAll();
        return hardskill;
    }

    @Override
    public void saveSkill(Skill skill) {
        rSkill.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        rSkill.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = rSkill.findById(id).orElse(null);
        return skill;
        
}
    
}

