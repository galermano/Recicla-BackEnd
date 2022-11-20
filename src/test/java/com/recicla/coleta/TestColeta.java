package com.recicla.coleta;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.coleta.controller.ControllerColeta;
import com.recicla.coleta.model.bean.Coleta;

import junit.framework.TestCase;

public class TestColeta extends TestCase  {

	 @Test
	 @DisplayName("Teste de inserção de Coleta")
	 public void testInserirColeta() throws ClassNotFoundException, SQLException, ParseException {
	 	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	 	Date dataSol = new Date();
	 	Date dataCon = formatter.parse("30-11-2022");

	 	Coleta newCol = new Coleta(1, "Bloco A", 3, new java.sql.Date(dataSol.getTime()),new java.sql.Date(dataCon.getTime()), 2, 1, 2, 1);

		ControllerColeta contCol = new ControllerColeta();
		assertNotNull(contCol.inserir(newCol).getId());
		assertNotNull(contCol.inserir(newCol).getId());
	 	assertNotNull(contCol.inserir(newCol).getId());
	 	assertNotNull(contCol.inserir(newCol).getId());
	 	assertNotNull(contCol.inserir(newCol).getId());

	 }

	@Test
	@DisplayName("Teste de busca de Coleta")
	public void testBuscarColeta() throws ClassNotFoundException, SQLException, ParseException {
		Coleta newCol = new Coleta(3);
		ControllerColeta contCol = new ControllerColeta();

		assertNotNull(contCol.buscar(newCol));
	}

	@Test
	@DisplayName("Teste de listar de Coleta")
	public void testListarColeta() throws ClassNotFoundException, SQLException, ParseException {
		Date dataSol = new Date();

		Coleta newCol = new Coleta(new java.sql.Date(dataSol.getTime()));
		ControllerColeta contCol = new ControllerColeta();

		assertNotNull(contCol.listar(newCol));
	}

	@Test
	@DisplayName("Teste de excluir de Coleta")
	public void testExcluirColeta() throws ClassNotFoundException, SQLException, ParseException {
		Coleta newCol = new Coleta(1);
		ControllerColeta contCol = new ControllerColeta();

		assertNotNull(contCol.excluir(newCol));
	}

	@Test
	@DisplayName("Teste de alterar de Coleta")
	public void testAlterarColeta() throws ClassNotFoundException, SQLException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dataSol = new Date();
		Date dataCon = formatter.parse("30-11-2022");
		Coleta newCol = new Coleta(1, 1, "Bloco B", 3, new java.sql.Date(dataSol.getTime()),
				new java.sql.Date(dataCon.getTime()), 3, 4, 3, 4);

		ControllerColeta contCol = new ControllerColeta();
		assertNotNull(contCol.alterar(newCol).getId());

	}

}
