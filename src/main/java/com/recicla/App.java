package com.recicla;

import java.sql.SQLException;

import com.recicla.contAcesso.controller.ControllerAcesso;
import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        System.out.println( "Hello World!" );
        
        Acesso newAcess = new Acesso(4,1,"Adm");
        
        ControllerAcesso contAcesso = new ControllerAcesso();
        
        System.out.println(contAcesso.validar(newAcess));
        
        
        Usuario usu = new Usuario("teste@teste", "1234");
        
        ControllerUsuario contUsu = new ControllerUsuario();
        
        System.out.println(contUsu.validar(usu));
        

    }
}
