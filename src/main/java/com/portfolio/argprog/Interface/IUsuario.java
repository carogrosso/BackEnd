package com.portfolio.argprog.Interface;

import com.portfolio.argprog.Entity.Usuario;


public interface IUsuario {
    
    //Guardar un usuario
    public void saveUsuario(Usuario usuario);
    
//    public boolean existsBymail(String mail);
//    public boolean existsBypassword(String password);
    
    
    public Usuario findUsuarioByMail(String mail);
    
    //Buscar un usuario
    public Usuario findUsuario(Long id);
    
//    public boolean findUsuarioMail(String mail);
//    
//    public boolean findUsuarioPass(String password);
    
}
