package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.controller.ControllerLogradouro;
import com.recicla.coleta.model.bean.Logradouro;
import com.recicla.contAcesso.model.bean.Pessoa;
import com.recicla.contAcesso.model.dao.DaoPessoa;

public class ControllerPessoa {
	public Pessoa inserir(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		return daoPes.inserir(pes);
	}

	public Pessoa buscar(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		pes = daoPes.buscar(pes);

		ControllerLogradouro contLogradouro = new ControllerLogradouro();
		Logradouro mod = new Logradouro(pes.getId_logradouro());
		pes.setLogradouro(contLogradouro.buscar(mod));
		
		return pes;
	}

	public List<Pessoa> listar(Pessoa pes) throws ClassNotFoundException, SQLException {
		DaoPessoa daoPes = new DaoPessoa();
		List<Pessoa> listaPessoa = daoPes.listar(pes);
		List<Pessoa> listaPessoaAux = new ArrayList<Pessoa>();
		for (Pessoa acs : listaPessoa) {
			listaPessoaAux.add(buscar(acs));
		}
		return listaPessoaAux;
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
