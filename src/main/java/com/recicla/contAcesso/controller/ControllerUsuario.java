package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.contAcesso.model.dao.DaoUsuario;

public class ControllerUsuario {
	public Usuario inserir(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.inserir(usu);
	}

	public Usuario buscar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.buscar(usu);
	}

	public List<Usuario> listar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.listar(usu);
	}

	public Usuario excluir(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.excluir(usu);
	}

	public Usuario alterar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.alterar(usu);
	}
	
	public Boolean validar (Usuario u) throws SQLException, ClassNotFoundException {
        boolean validado = false;
        DaoUsuario daoUsu = new DaoUsuario();
        Usuario usuSaida = daoUsu.validar(u);
        if(usuSaida.getLogin().equals(u.getLogin())) {
            if(usuSaida.getSenha().equals(u.getSenha())) {
                validado = true;
            }
        }
        return validado;
    }
}
