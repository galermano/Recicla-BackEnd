package com.recicla.coleta.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.coleta.model.bean.Coleta;
import com.recicla.coleta.model.dao.DaoColeta;

public class ControllerColeta {
	public Coleta inserir(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.inserir(col);
	}

	public Coleta buscar(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.buscar(col);
	}

	public List<Coleta> listar(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.listar(col);
	}

	public Coleta excluir(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.excluir(col);
	}

	public Coleta alterar(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.alterar(col);
	}
}
