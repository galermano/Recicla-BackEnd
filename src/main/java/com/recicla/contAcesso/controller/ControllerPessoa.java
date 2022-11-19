package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.contAcesso.model.bean.Pessoa;
import com.recicla.contAcesso.model.dao.DaoPessoa;

public class ControllerPessoa {
	public Pessoa inserir(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.inserir(pes);
	}

	public Pessoa buscar(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.buscar(pes);
	}

	public List<Pessoa> listar(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.listar(pes);
	}

	public Pessoa excluir(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.excluir(pes);
	}

	public Pessoa alterar(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.alterar(pes);
	}
}
