package com.recicla.contAcesso;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerPessoa;
import com.recicla.contAcesso.model.bean.Pessoa;

import junit.framework.TestCase;

public class TestPessoa extends TestCase {
	@Test
	@DisplayName("Teste de inserção de Pessoa")
	public void testInserirPessoa() throws ClassNotFoundException, SQLException, ParseException {

		Pessoa newCol = new Pessoa("latinha de cerveja", 1, 1, 1);

		ControllerPessoa contCol = new ControllerPessoa();
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

	}

	@Test
	@DisplayName("Teste de busca de Pessoa")
	public void testBuscarPessoa() throws ClassNotFoundException, SQLException, ParseException {
		Pessoa newCol = new Pessoa(4);
		ControllerPessoa contCol = new ControllerPessoa();

		newCol = (contCol.buscar(newCol));
	}

	@Test
	@DisplayName("Teste de listar de Pessoa")
	public void testListarPessoa() throws ClassNotFoundException, SQLException, ParseException {

		Pessoa newCol = new Pessoa("latinha de cerveja");
		ControllerPessoa contCol = new ControllerPessoa();
		assertNotNull(contCol.listar(newCol));

	}

	@Test
	@DisplayName("Teste de excluir de Pessoa")
	public void testExcluirPessoa() throws ClassNotFoundException, SQLException, ParseException {
		Pessoa newCol = new Pessoa(5);
		ControllerPessoa contCol = new ControllerPessoa();

		assertNotNull(contCol.excluir(newCol));
	}

	@Test
	@DisplayName("Teste de alterar de Pessoa")
	public void testAlterarPessoa() throws ClassNotFoundException, SQLException, ParseException {
		Pessoa newCol = new Pessoa(1,"latinha de coca", 2, 2, 2);

		ControllerPessoa contCol = new ControllerPessoa();
		assertNotNull(contCol.alterar(newCol).getId());

	}
}
