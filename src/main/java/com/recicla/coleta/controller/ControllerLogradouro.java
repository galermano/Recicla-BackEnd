package com.recicla.coleta.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.coleta.model.been.Logradouro;
import com.recicla.coleta.model.dao.DaoLogradouro;

public class ControllerLogradouro {
	public Logradouro inserir(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.inserir(log);
	}

	public Logradouro buscar(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.buscar(log);
	}

	public List<Logradouro> listar(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.listar(log);
	}

	public Logradouro excluir(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.excluir(log);
	}

	public Logradouro alterar(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.alterar(log);
	}
}
