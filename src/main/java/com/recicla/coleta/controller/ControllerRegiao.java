package com.recicla.coleta.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.coleta.model.bean.Regiao;
import com.recicla.coleta.model.dao.DaoRegiao;

public class ControllerRegiao {
	public Regiao inserir(Regiao reg) throws ClassNotFoundException, SQLException {
		DaoRegiao daoReg = new DaoRegiao();
		return daoReg.inserir(reg);
	}

	public Regiao buscar(Regiao reg) throws ClassNotFoundException, SQLException {
		DaoRegiao daoReg = new DaoRegiao();
		return daoReg.buscar(reg);
	}

	public List<Regiao> listar(Regiao reg) throws ClassNotFoundException, SQLException {
		DaoRegiao daoReg = new DaoRegiao();
		return daoReg.listar(reg);
	}

	public Regiao excluir(Regiao reg) throws ClassNotFoundException, SQLException {
		DaoRegiao daoReg = new DaoRegiao();
		return daoReg.excluir(reg);
	}

	public Regiao alterar(Regiao reg) throws ClassNotFoundException, SQLException {
		DaoRegiao daoReg = new DaoRegiao();
		return daoReg.alterar(reg);
	}
}
