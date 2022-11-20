package com.recicla.material;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.material.controller.ControllerHistoricoMaterial;
import com.recicla.material.model.bean.HistoricoMaterial;

import junit.framework.TestCase;


public class TestHistoricoMaterial extends TestCase {

	@Test
	@DisplayName("Teste de inserção de HistoricoMaterial")
	public void testInserirHistoricoMaterial() throws ClassNotFoundException, SQLException, ParseException {

		HistoricoMaterial newCol = new HistoricoMaterial(3,3,"latinha de cerveja","descricao");

		ControllerHistoricoMaterial contCol = new ControllerHistoricoMaterial();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());


	}

	@Test
	@DisplayName("Teste de busca de HistoricoMaterial")
	public void testBuscarHistoricoMaterial() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoMaterial newCol = new HistoricoMaterial(3);
		ControllerHistoricoMaterial contCol = new ControllerHistoricoMaterial();

		newCol=(contCol.buscar(newCol));
	}

	 @Test
	 @DisplayName("Teste de listar de HistoricoMaterial")
	 public void testListarHistoricoMaterial() throws ClassNotFoundException, SQLException, ParseException {

	 	HistoricoMaterial newCol = new HistoricoMaterial("latinha de cerveja");
	 	ControllerHistoricoMaterial contCol = new ControllerHistoricoMaterial();
	 	assertNotNull(contCol.listar(newCol));

	 }

	 @Test
	 @DisplayName("Teste de excluir de HistoricoMaterial")
	 public void testExcluirHistoricoMaterial() throws ClassNotFoundException, SQLException, ParseException {
	 	HistoricoMaterial newCol = new HistoricoMaterial(3);
	 	ControllerHistoricoMaterial contCol = new ControllerHistoricoMaterial();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de HistoricoMaterial")
	 public void testAlterarHistoricoMaterial() throws ClassNotFoundException, SQLException, ParseException {
			HistoricoMaterial newCol = new HistoricoMaterial(3,3,2,"latinha de cerveja","descricao");

		ControllerHistoricoMaterial contCol = new ControllerHistoricoMaterial();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
