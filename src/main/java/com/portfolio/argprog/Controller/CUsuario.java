package com.portfolio.argprog.Controller;

import com.portfolio.argprog.Entity.Usuario;
import com.portfolio.argprog.Interface.IUsuario;
import com.portfolio.argprog.Service.SUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "https://carogrosso-portfolio.web.app")
public class CUsuario {

    @Autowired
    SUsuario sUsuario;
  
    @GetMapping("/traer")
    public Usuario findUsuario(){
        return sUsuario.findUsuario((long)1);
    }
    
    @GetMapping("/traermaildeusuario")
    public String findMaildeUsuario(){
        return sUsuario.findUsuario((long)1).getMail();
    }
    
    @GetMapping("/traerpassdeusuario")
    public String findPassdeUsuario(){
        return sUsuario.findUsuario((long)1).getPassword();
    }

    @PostMapping("/crear")
    public void createUsuario(@RequestBody Usuario usuario) {
        sUsuario.saveUsuario(usuario);
//        return "El usuario fue creado";
    }

//    @PostMapping("/login")
//    public boolean login(@RequestBody Usuario usuario) {
//        boolean resultado;
//        Usuario usuariodb = sUsuario.findUsuarioByMail(usuario.getMail());
//        if (usuariodb!=null){
//        resultado = usuario.getPassword().equals(usuariodb.getPassword());
//        } else {
//            resultado=false;
//        }
//        return resultado;
//    }
    
    @PostMapping("/login")
    public Usuario login(@RequestBody Usuario usuario) {
        Usuario usuariodb = sUsuario.findUsuarioByMail(usuario.getMail());
        if (usuariodb!=null && !usuario.getPassword().equals(usuariodb.getPassword())){
            usuariodb=null;
        } 
        return usuariodb;
    }
}
