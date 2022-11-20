package com.recicla.transporte.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.transporte.model.bean.Veiculo;
import com.recicla.transporte.model.dao.DaoVeiculo;

public class ControllerVeiculo {
	public Veiculo inserir(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.inserir(TR);
	}

	public Veiculo buscar(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.buscar(TR);
	}

	public List<Veiculo> listar(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.listar(TR);
	}

	public Veiculo excluir(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.excluir(TR);
	}

	public Veiculo alterar(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.alterar(TR);
	}
}
