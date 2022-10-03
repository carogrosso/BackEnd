package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Proyecto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RProyecto extends JpaRepository<Proyecto,Long>{
    public Optional<Proyecto> findBytitulo(String titulo);
    
}
