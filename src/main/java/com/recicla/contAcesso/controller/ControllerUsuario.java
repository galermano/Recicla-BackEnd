package com.recicla.contAcesso.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Pessoa;
import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.contAcesso.model.dao.DaoUsuario;
import com.recicla.util.controller.ControllerStatus;
import com.recicla.util.model.bean.Status;
import com.recicla.contAcesso.model.bean.Usuario;

public class ControllerUsuario {
	public Usuario inserir(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.inserir(usu);
	}

	public Usuario buscar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsuario = new DaoUsuario();
		usu = daoUsuario.buscar(usu);

		ControllerPessoa contPessoa = new ControllerPessoa();
		Pessoa pes = new Pessoa(usu.getId_pessoa());
		usu.setPessoa(contPessoa.buscar(pes));

		ControllerAcesso contAcesso = new ControllerAcesso();
		Acesso acs = new Acesso(usu.getId_acesso());
		usu.setAcesso(contAcesso.buscar(acs));

		ControllerStatus contStatus = new ControllerStatus();
		Status sts = new Status(usu.getId_status());
		usu.setStatus(contStatus.buscar(sts));

		return usu;
	}

	public List<Usuario> listar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		List<Usuario> listaUsuario = daoUsu.listar(usu);
		List<Usuario> listaUsuarioAux = new ArrayList<Usuario>();
		for (Usuario usr : listaUsuario) {
			listaUsuarioAux.add(buscar(usr));
		}
		return listaUsuarioAux;
	}

	public List<Usuario> listarTodos() throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		List<Usuario> listaUsuario = daoUsu.listarTodos();
		List<Usuario> listaUsuarioAux = new ArrayList<Usuario>();
		listaUsuarioAux.addAll(listaUsuario);
		return listaUsuarioAux;
	}

	public Usuario excluir(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.excluir(usu);
	}

	public Usuario alterar(Usuario usu) throws ClassNotFoundException, SQLException {
		DaoUsuario daoUsu = new DaoUsuario();
		return daoUsu.alterar(usu);
	}

	public Boolean validar(Usuario u) throws SQLException, ClassNotFoundException {
		boolean validado = false;
		DaoUsuario daoUsu = new DaoUsuario();
		Usuario usuSaida = daoUsu.validar(u);
		if (usuSaida.getLogin().equals(u.getLogin())) {
			if (usuSaida.getSenha().equals(u.getSenha())) {
				validado = true;
			}
		}
		return validado;
	}
}
