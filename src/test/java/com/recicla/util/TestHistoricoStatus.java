package com.recicla.util;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.util.controller.ControllerHistoricoStatus;
import com.recicla.util.model.bean.HistoricoStatus;

import junit.framework.TestCase;

public class TestHistoricoStatus extends TestCase{

	@Test
	@DisplayName("Teste de inserção de HistoricoStatus")
	public void testInserirHistoricoStatus() throws ClassNotFoundException, SQLException, ParseException {
		
		HistoricoStatus newCol = new HistoricoStatus("Ativo", "esta logado");
		
		ControllerHistoricoStatus contCol = new ControllerHistoricoStatus();
		assertNotNull(contCol.inserir(newCol).getNome());
		assertNotNull(contCol.inserir(newCol).getNome());
		assertNotNull(contCol.inserir(newCol).getNome());
		assertNotNull(contCol.inserir(newCol).getNome());
		assertNotNull(contCol.inserir(newCol).getNome());
		assertNotNull(contCol.inserir(newCol).getNome());

	}
	
	@Test
	@DisplayName("Teste de busca de HistoricoStatus")
	public void testBuscarHistoricoStatus() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoStatus newCol = new HistoricoStatus("Ativo");
		ControllerHistoricoStatus contCol = new ControllerHistoricoStatus();
		
		assertNotNull(contCol.buscar(newCol));
	}
	
	@Test
	@DisplayName("Teste de listar de HistoricoStatus")
	public void testListarHistoricoStatus() throws ClassNotFoundException, SQLException, ParseException {		
		HistoricoStatus newCol = new HistoricoStatus("esta logado");
		ControllerHistoricoStatus contCol = new ControllerHistoricoStatus();

		assertNotNull(contCol.listar(newCol));
	}
	
	@Test
	@DisplayName("Teste de excluir de HistoricoStatus")
	public void testExcluirHistoricoStatus() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoStatus newCol = new HistoricoStatus("ativo");
		ControllerHistoricoStatus contCol = new ControllerHistoricoStatus();
		
		assertNotNull(contCol.excluir(newCol));
	}
	
	@Test
	@DisplayName("Teste de alterar de HistoricoStatus")
	public void testAlterarHistoricoStatus() throws ClassNotFoundException, SQLException, ParseException {
		
		HistoricoStatus newCol = new HistoricoStatus("inativo", "nao esta logado");
		
		ControllerHistoricoStatus contCol = new ControllerHistoricoStatus();
		assertNotNull(contCol.alterar(newCol).getNome());


	}
	
}
