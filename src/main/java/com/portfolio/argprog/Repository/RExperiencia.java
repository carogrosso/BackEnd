package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RExperiencia extends JpaRepository<Experiencia,Long>{
    public Optional<Experiencia> findByempresa(String empresa);
    public boolean existsByempresa (String empresa);
}
