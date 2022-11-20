package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.contAcesso.model.dao.DaoAcesso;
import com.recicla.contAcesso.model.dao.DaoUsuario;
import com.recicla.contAcesso.model.bean.Modulo;


public class ControllerAcesso {

	public Acesso inserir(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		return daoAcess.inserir(acess);
	}

	public Acesso buscar(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		acess = daoAcess.buscar(acess);
		ControllerModulo contModulo = new ControllerModulo();
		Modulo mod = new Modulo(acess.getId_modulo());
		acess.setModulo(contModulo.buscar(mod));
		return acess;
	}

	public List<Acesso> listar(Acesso acess) throws ClassNotFoundException, SQLException {
		DaoAcesso daoAcess = new DaoAcesso();
		daoAcess = new DaoAcesso();
		List<Acesso> listaAcess = daoAcess.listar(acess);
		List<Acesso> listaAcessAux = new ArrayList<Acesso>();
		for (Acesso acs : listaAcess) {
			listaAcessAux.add(buscar(acs));
		}
		return listaAcessAux;
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
