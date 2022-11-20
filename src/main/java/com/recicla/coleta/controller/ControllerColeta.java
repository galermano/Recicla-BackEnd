package com.recicla.coleta.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.model.bean.Coleta;
import com.recicla.coleta.model.bean.Logradouro;
import com.recicla.coleta.model.dao.DaoColeta;
import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Usuario;

public class ControllerColeta {
	public Coleta inserir(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		return daoCol.inserir(col);
	}

	public Coleta buscar(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		col = daoCol.buscar(col);
		ControllerLogradouro contLogradouro = new ControllerLogradouro();
		ControllerUsuario contUsuario = new ControllerUsuario();
		Logradouro logradouroE = new Logradouro(col.getIdLogradouroE());
		Logradouro logradouroR = new Logradouro(col.getIdLogradouroR());
		Usuario usuarioE = new Usuario(col.getIdUsuarioE());
		Usuario usuarioR = new Usuario(col.getIdUsuarioR());
		col.setUsuarioE(contUsuario.buscar(usuarioE));
		col.setUsuarioR(contUsuario.buscar(usuarioR));
		col.setLogradouroE(contLogradouro.buscar(logradouroE));
		col.setLogradouroR(contLogradouro.buscar(logradouroR));
		return col;

	}

	public List<Coleta> listar(Coleta col) throws ClassNotFoundException, SQLException {
		DaoColeta daoCol = new DaoColeta();
		List<Coleta> listaCol = daoCol.listar(col);
		List<Coleta> listaColAux = new ArrayList<Coleta>();
		for (Coleta cl : listaCol) {
			listaColAux.add(buscar(cl));
		}
		return listaColAux;
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
