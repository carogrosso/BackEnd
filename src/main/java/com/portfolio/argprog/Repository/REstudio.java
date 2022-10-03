package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Estudio;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface REstudio extends JpaRepository<Estudio,Long> {
    public Optional<Estudio> findBytitulo(String titulo);
}
