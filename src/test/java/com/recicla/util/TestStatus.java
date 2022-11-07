package com.recicla.util;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.coleta.model.bean.Regiao;
import com.recicla.util.controller.ControllerStatus;
import com.recicla.util.model.bean.Status;

import junit.framework.TestCase;

public class TestStatus extends TestCase{

	@Test
	@DisplayName("Teste de inserção de Status")
	public void testInserirStatus() throws ClassNotFoundException, SQLException, ParseException {
		
		Status newCol = new Status("Ativo", "esta logado");
		
		ControllerStatus contCol = new ControllerStatus();
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());

	}
	
	@Test
	@DisplayName("Teste de busca de Status")
	public void testBuscarStatus() throws ClassNotFoundException, SQLException, ParseException {
		Status newCol = new Status(1);
		ControllerStatus contCol = new ControllerStatus();
		
		assertNotNull(contCol.buscar(newCol));
	}
	
	@Test
	@DisplayName("Teste de listar de Status")
	public void testListarStatus() throws ClassNotFoundException, SQLException, ParseException {		
		Status newCol = new Status("Ativo");
		ControllerStatus contCol = new ControllerStatus();

		assertNotNull(contCol.listar(newCol));
	}
	
	@Test
	@DisplayName("Teste de excluir de Status")
	public void testExcluirStatus() throws ClassNotFoundException, SQLException, ParseException {
		Status newCol = new Status(2);
		ControllerStatus contCol = new ControllerStatus();
		
		assertNotNull(contCol.excluir(newCol));
	}
	
	@Test
	@DisplayName("Teste de alterar de Status")
	public void testAlterarStatus() throws ClassNotFoundException, SQLException, ParseException {
		
		Status newCol = new Status(1,"Inativo", "nao esta logado");
		
		ControllerStatus contCol = new ControllerStatus();
		assertNotNull(contCol.alterar(newCol).getId());


	}
	
}
