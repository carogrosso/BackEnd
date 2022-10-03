package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Skill;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RSkill extends JpaRepository<Skill,Long>{
    public Optional<Skill> findByskill(String skill);
    public boolean existsByskill (String skill);
}
