package com.recicla.transporte.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.transporte.model.bean.TipoVeiculo;
import com.recicla.transporte.model.dao.DaoTipoVeiculo;

public class ControllerTipoVeiculo {
	public TipoVeiculo inserir(TipoVeiculo TR) throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.inserir(TR);
	}

	public TipoVeiculo buscar(TipoVeiculo TR) throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.buscar(TR);
	}

	public List<TipoVeiculo> listar(TipoVeiculo TR) throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.listar(TR);
	}
	
	public List<TipoVeiculo> listarTodos() throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.listarTodos();
	}

	public TipoVeiculo excluir(TipoVeiculo TR) throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.excluir(TR);
	}

	public TipoVeiculo alterar(TipoVeiculo TR) throws ClassNotFoundException, SQLException {
		DaoTipoVeiculo daoTR = new DaoTipoVeiculo();
		return daoTR.alterar(TR);
	}
}
