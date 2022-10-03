package com.portfolio.argprog.Service;

import com.portfolio.argprog.Entity.Usuario;
import com.portfolio.argprog.Interface.IUsuario;
import com.portfolio.argprog.Repository.RUsuario;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SUsuario implements IUsuario{
    @Autowired RUsuario rUsuario;
    
    @Override
    public void saveUsuario(Usuario usuario) {
        rUsuario.save(usuario);
    }

    @Override
    public Usuario findUsuarioByMail(String mail){
        return rUsuario.findByMail(mail);
    }
    
    @Override
    public Usuario findUsuario(Long id) {
        Usuario usuario = rUsuario.findById(id).orElse(null);
        return usuario;   
    }

}
