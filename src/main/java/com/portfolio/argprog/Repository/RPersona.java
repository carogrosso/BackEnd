package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona,Long> {
    
}
