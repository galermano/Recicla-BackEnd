package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.contAcesso.model.bean.Modulo;
import com.recicla.contAcesso.model.dao.DaoModulo;

public class ControllerModulo {
	public Modulo inserir(Modulo mod) throws ClassNotFoundException, SQLException {
		DaoModulo daoMod = new DaoModulo();
		return daoMod.inserir(mod);
	}

	public Modulo buscar(Modulo mod) throws ClassNotFoundException, SQLException {
		DaoModulo daoMod = new DaoModulo();
		return daoMod.buscar(mod);
	}

	public List<Modulo> listar(Modulo mod) throws ClassNotFoundException, SQLException {
		DaoModulo daoMod = new DaoModulo();
		return daoMod.listar(mod);
	}

	public Modulo excluir(Modulo mod) throws ClassNotFoundException, SQLException {
		DaoModulo daoMod = new DaoModulo();
		return daoMod.excluir(mod);
	}

	public Modulo alterar(Modulo mod) throws ClassNotFoundException, SQLException {
		DaoModulo daoMod = new DaoModulo();
		return daoMod.alterar(mod);
	}
}
