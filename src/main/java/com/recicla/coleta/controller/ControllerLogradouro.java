package com.recicla.coleta.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.model.bean.Logradouro;
import com.recicla.coleta.model.bean.Regiao;
import com.recicla.coleta.model.dao.DaoLogradouro;

public class ControllerLogradouro {
	public Logradouro inserir(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		return daoLog.inserir(log);
	}

	public Logradouro buscar(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		log = daoLog.buscar(log);
		Regiao regiao = new Regiao(log.getIdRegiao());
		ControllerRegiao contRegiao = new ControllerRegiao();
		log.setRegiao(contRegiao.buscar(regiao));

		return log;

	}

	public List<Logradouro> listar(Logradouro log) throws ClassNotFoundException, SQLException {
		DaoLogradouro daoLog = new DaoLogradouro();
		List<Logradouro> listaLog = daoLog.listar(log);
		List<Logradouro> listaLogAux = new ArrayList<Logradouro>();
		for (Logradouro lg : listaLog) {
			listaLog.add(buscar(lg));
		}
		return listaLogAux;

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
