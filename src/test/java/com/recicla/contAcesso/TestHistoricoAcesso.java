package com.recicla.contAcesso;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerHistoricoAcesso;
import com.recicla.contAcesso.model.bean.HistoricoAcesso;

import junit.framework.TestCase;

public class TestHistoricoAcesso extends TestCase {
	@Test
	@DisplayName("Teste de inserção de HistoricoAcesso")
	public void testInserirHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {

		HistoricoAcesso newCol = new HistoricoAcesso(1,1,1,1);

		ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

	}

	@Test
	@DisplayName("Teste de busca de HistoricoAcesso")
	public void testBuscarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoAcesso newCol = new HistoricoAcesso(4);
		ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();

		newCol = (contCol.buscar(newCol));
	}

	@Test
	@DisplayName("Teste de listar de HistoricoAcesso")
	public void testListarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {

		HistoricoAcesso newCol = new HistoricoAcesso(1);
		ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
		assertNotNull(contCol.listar(newCol));

	}

	@Test
	@DisplayName("Teste de excluir de HistoricoAcesso")
	public void testExcluirHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoAcesso newCol = new HistoricoAcesso(5);
		ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();

		assertNotNull(contCol.excluir(newCol));
	}

	@Test
	@DisplayName("Teste de alterar de HistoricoAcesso")
	public void testAlterarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoAcesso newCol = new HistoricoAcesso(1, 2, 2, 2);

		ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
		assertNotNull(contCol.alterar(newCol).getId());

	}
}
