package com.recicla.transporte;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.transporte.controller.ControllerTransporte;
import com.recicla.transporte.model.bean.Transporte;

import junit.framework.TestCase;


public class TestTransporte extends TestCase {

	@Test
	@DisplayName("Teste de inserção de Transporte")
	public void testInserirTransporte() throws ClassNotFoundException, SQLException, ParseException {

		Transporte newCol = new Transporte("liquido");

		ControllerTransporte contCol = new ControllerTransporte();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());

	}

	@Test
	@DisplayName("Teste de busca de Transporte")
	public void testBuscarTransporte() throws ClassNotFoundException, SQLException, ParseException {
		Transporte newCol = new Transporte(3);
		ControllerTransporte contCol = new ControllerTransporte();

		newCol=(contCol.buscar(newCol));
	}

	 @Test
	 @DisplayName("Teste de listar de Transporte")
	 public void testListarTransporte() throws ClassNotFoundException, SQLException, ParseException {

	 	Transporte newCol = new Transporte("caminhao");
	 	ControllerTransporte contCol = new ControllerTransporte();
	 	assertNotNull(contCol.listar(newCol));

	 }

	 @Test
	 @DisplayName("Teste de excluir de Transporte")
	 public void testExcluirTransporte() throws ClassNotFoundException, SQLException, ParseException {
	 	Transporte newCol = new Transporte(1);
	 	ControllerTransporte contCol = new ControllerTransporte();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de Transporte")
	 public void testAlterarTransporte() throws ClassNotFoundException, SQLException, ParseException {
			Transporte newCol = new Transporte(3,"solido");

		ControllerTransporte contCol = new ControllerTransporte();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
