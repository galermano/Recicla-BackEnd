package com.recicla;

import java.sql.SQLException;


import com.recicla.contAcesso.controller.ControllerAcesso;
import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Modulo;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.contAcesso.model.dao.DaoModulo;
import com.recicla.contAcesso.model.dao.DaoUsuario;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello World!");
        
        Acesso newAcess = new Acesso(4, 1, "Adm");
        
        ControllerAcesso contAcesso = new ControllerAcesso();
        
        System.out.println(contAcesso.validar(newAcess));
        
        Usuario usu = new Usuario("fabio", "dias");
        
        ControllerUsuario contUsu = new ControllerUsuario();
        
        System.out.println(contUsu.validar(usu));
        
        String login = "Bertola@teste";
        String senha = "123";
    Usuario usuEntrada = new Usuario(login, senha);
    DaoUsuario daoUsu = new DaoUsuario();
    Usuario usuSaida = daoUsu.validar(usuEntrada);

   
    if (usuSaida.getLogin().equals(login) && usuSaida.getSenha().equals(senha)) {
        System.out.println("1");
        System.out.println(usuSaida);

    } else {

        System.out.println("2");
    }
   
        
    }
}
