package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.contAcesso.model.bean.HistoricoAcesso;
import com.recicla.contAcesso.model.dao.DaoHistoricoAcesso;

public class ControllerHistoricoAcesso {
	public HistoricoAcesso inserir(HistoricoAcesso hist) throws ClassNotFoundException, SQLException {
		DaoHistoricoAcesso daoHist = new DaoHistoricoAcesso();
		return daoHist.inserir(hist);
	}

	public HistoricoAcesso buscar(HistoricoAcesso hist) throws ClassNotFoundException, SQLException {
		DaoHistoricoAcesso daoHist = new DaoHistoricoAcesso();
		return daoHist.buscar(hist);
	}

	public List<HistoricoAcesso> listar(HistoricoAcesso hist) throws ClassNotFoundException, SQLException {
		DaoHistoricoAcesso daoHist = new DaoHistoricoAcesso();
		return daoHist.listar(hist);
	}

	public HistoricoAcesso excluir(HistoricoAcesso hist) throws ClassNotFoundException, SQLException {
		DaoHistoricoAcesso daoHist = new DaoHistoricoAcesso();
		return daoHist.excluir(hist);
	}

	public HistoricoAcesso alterar(HistoricoAcesso hist) throws ClassNotFoundException, SQLException {
		DaoHistoricoAcesso daoHist = new DaoHistoricoAcesso();
		return daoHist.alterar(hist);
	}
}
