package com.recicla.transporte.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.transporte.model.been.Transporte;
import com.recicla.transporte.model.dao.DaoTransporte;

public class ControllerTransporte {
	public Transporte inserir(Transporte TR) throws ClassNotFoundException, SQLException {
		DaoTransporte daoTR = new DaoTransporte();
		return daoTR.inserir(TR);
	}

	public Transporte buscar(Transporte TR) throws ClassNotFoundException, SQLException {
		DaoTransporte daoTR = new DaoTransporte();
		return daoTR.buscar(TR);
	}

	public List<Transporte> listar(Transporte TR) throws ClassNotFoundException, SQLException {
		DaoTransporte daoTR = new DaoTransporte();
		return daoTR.listar(TR);
	}

	public Transporte excluir(Transporte TR) throws ClassNotFoundException, SQLException {
		DaoTransporte daoTR = new DaoTransporte();
		return daoTR.excluir(TR);
	}

	public Transporte alterar(Transporte TR) throws ClassNotFoundException, SQLException {
		DaoTransporte daoTR = new DaoTransporte();
		return daoTR.alterar(TR);
	}
}
