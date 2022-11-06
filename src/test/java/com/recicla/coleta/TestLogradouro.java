package com.recicla.coleta;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.coleta.controller.ControllerLogradouro;
import com.recicla.coleta.model.bean.Logradouro;

import junit.framework.TestCase;

public class TestLogradouro extends TestCase{

	@Test
	@DisplayName("Teste de inserção de Logradouro")
	public void testInserirLogradouro() throws ClassNotFoundException, SQLException, ParseException {
		
		Logradouro newCol = new Logradouro(3,"03657100");
		
		ControllerLogradouro contCol = new ControllerLogradouro();
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());

	}
	
	@Test
	@DisplayName("Teste de busca de Logradouro")
	public void testBuscarLogradouro() throws ClassNotFoundException, SQLException, ParseException {
		Logradouro newCol = new Logradouro(1);
		ControllerLogradouro contCol = new ControllerLogradouro();
		
		assertNotNull(contCol.buscar(newCol));
	}
	
	@Test
	@DisplayName("Teste de listar de Logradouro")
	public void testListarLogradouro() throws ClassNotFoundException, SQLException, ParseException {		
		Logradouro newCol = new Logradouro("03657100");
		ControllerLogradouro contCol = new ControllerLogradouro();

		assertNotNull(contCol.listar(newCol));
	}
	
	@Test
	@DisplayName("Teste de excluir de Logradouro")
	public void testExcluirLogradouro() throws ClassNotFoundException, SQLException, ParseException {
		Logradouro newCol = new Logradouro(2);
		ControllerLogradouro contCol = new ControllerLogradouro();
		
		assertNotNull(contCol.excluir(newCol));
	}
	
}
