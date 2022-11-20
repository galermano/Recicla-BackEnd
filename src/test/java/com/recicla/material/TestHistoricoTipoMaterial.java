package com.recicla.material;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.material.controller.ControllerHistoricoTipoMaterial;
import com.recicla.material.model.bean.HistoricoTipoMaterial;

import junit.framework.TestCase;


public class TestHistoricoTipoMaterial extends TestCase {

	@Test
	@DisplayName("Teste de inserção de HistoricoTipoMaterial")
	public void testInserirHistoricoTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {

		HistoricoTipoMaterial newCol = new HistoricoTipoMaterial("aluminio","metal","metais e aluminios");

		ControllerHistoricoTipoMaterial contCol = new ControllerHistoricoTipoMaterial();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());


	}

	@Test
	@DisplayName("Teste de busca de HistoricoTipoMaterial")
	public void testBuscarHistoricoTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
		HistoricoTipoMaterial newCol = new HistoricoTipoMaterial(3);
		ControllerHistoricoTipoMaterial contCol = new ControllerHistoricoTipoMaterial();

		newCol=(contCol.buscar(newCol));
	}

	 @Test
	 @DisplayName("Teste de listar de HistoricoTipoMaterial")
	 public void testListarHistoricoTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {

	 	HistoricoTipoMaterial newCol = new HistoricoTipoMaterial("aluminio");
	 	ControllerHistoricoTipoMaterial contCol = new ControllerHistoricoTipoMaterial();
	 	assertNotNull(contCol.listar(newCol));

	 }

	 @Test
	 @DisplayName("Teste de excluir de HistoricoTipoMaterial")
	 public void testExcluirHistoricoTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
	 	HistoricoTipoMaterial newCol = new HistoricoTipoMaterial(3);
	 	ControllerHistoricoTipoMaterial contCol = new ControllerHistoricoTipoMaterial();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de HistoricoTipoMaterial")
	 public void testAlterarHistoricoTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
			HistoricoTipoMaterial newCol = new HistoricoTipoMaterial(2,"aluminio","metal","metais e aluminios");

		ControllerHistoricoTipoMaterial contCol = new ControllerHistoricoTipoMaterial();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
