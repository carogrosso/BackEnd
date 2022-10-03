package com.portfolio.argprog.Repository;

import com.portfolio.argprog.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RUsuario extends JpaRepository<Usuario,Long> {

    public Usuario findByMail(String mail);
    

}
