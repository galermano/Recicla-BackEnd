package com.recicla.coleta;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.coleta.controller.ControllerRegiao;
import com.recicla.coleta.model.bean.Regiao;

import junit.framework.TestCase;

public class TestRegiao extends TestCase{

	@Test
	@DisplayName("Teste de inserção de Regiao")
	public void testInserirRegiao() throws ClassNotFoundException, SQLException, ParseException {
	
		Regiao newCol = new Regiao("Artur Alvim", "Zona Leste");
		
		ControllerRegiao contCol = new ControllerRegiao();
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());

	}
	
	@Test
	@DisplayName("Teste de busca de Regiao")
	public void testBuscarRegiao() throws ClassNotFoundException, SQLException, ParseException {
		Regiao newCol = new Regiao(2);
		ControllerRegiao contCol = new ControllerRegiao();
		
		assertNotNull(contCol.buscar(newCol));
	}
	
	@Test
	@DisplayName("Teste de listar de Regiao")
	public void testListarRegiao() throws ClassNotFoundException, SQLException, ParseException {
		Date dataSol = new Date();
		
		Regiao newCol = new Regiao("Zona Leste");
		ControllerRegiao contCol = new ControllerRegiao();

		assertNotNull(contCol.listar(newCol));
	}
	
	@Test
	@DisplayName("Teste de excluir de Regiao")
	public void testExcluirRegiao() throws ClassNotFoundException, SQLException, ParseException {
		Regiao newCol = new Regiao(1);
		ControllerRegiao contCol = new ControllerRegiao();
		
		assertNotNull(contCol.excluir(newCol));
	}
	
}
