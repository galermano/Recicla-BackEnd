package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.contAcesso.model.dao.DaoAcesso;
import com.recicla.contAcesso.model.dao.DaoUsuario;

public class ControllerAcesso {

	public Acesso inserir(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.inserir(acess);
	}

	public Acesso buscar(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.buscar(acess);
	}

	public List<Acesso> listar(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.listar(acess);
	}

	public Acesso excluir(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.excluir(acess);
	}

	public Acesso alterar(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.alterar(acess);
	}

	public Boolean validar(Acesso acess) throws SQLException, ClassNotFoundException {
		boolean permissao = false;
		DaoAcesso daoAcess = new DaoAcesso();
		Acesso acessSaida = daoAcess.validar(acess);
		if (acessSaida.getTipo().equals(acess.getTipo())) {
			permissao = true;
		}
		return permissao;
	}
}
