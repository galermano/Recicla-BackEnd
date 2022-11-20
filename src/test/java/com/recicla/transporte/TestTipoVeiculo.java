package com.recicla.transporte;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.transporte.controller.ControllerTipoVeiculo;
import com.recicla.transporte.model.bean.TipoVeiculo;

import junit.framework.TestCase;


public class TestTipoVeiculo extends TestCase {

	@Test
	@DisplayName("Teste de inserção de TipoVeiculo")
	public void testInserirTipoVeiculo() throws ClassNotFoundException, SQLException, ParseException {

		TipoVeiculo newCol = new TipoVeiculo("caminhao","veiculo grande");

		ControllerTipoVeiculo contCol = new ControllerTipoVeiculo();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());

	}

	@Test
	@DisplayName("Teste de busca de TipoVeiculo")
	public void testBuscarTipoVeiculo() throws ClassNotFoundException, SQLException, ParseException {
		TipoVeiculo newCol = new TipoVeiculo(3);
		ControllerTipoVeiculo contCol = new ControllerTipoVeiculo();

		newCol=(contCol.buscar(newCol));
	}

	 @Test
	 @DisplayName("Teste de listar de TipoVeiculo")
	 public void testListarTipoVeiculo() throws ClassNotFoundException, SQLException, ParseException {

	 	TipoVeiculo newCol = new TipoVeiculo("caminhao");
	 	ControllerTipoVeiculo contCol = new ControllerTipoVeiculo();
	 	assertNotNull(contCol.listar(newCol));

	 }

	 @Test
	 @DisplayName("Teste de excluir de TipoVeiculo")
	 public void testExcluirTipoVeiculo() throws ClassNotFoundException, SQLException, ParseException {
	 	TipoVeiculo newCol = new TipoVeiculo(1);
	 	ControllerTipoVeiculo contCol = new ControllerTipoVeiculo();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de TipoVeiculo")
	 public void testAlterarTipoVeiculo() throws ClassNotFoundException, SQLException, ParseException {
			TipoVeiculo newCol = new TipoVeiculo(3,"caminhao","veiculo grande");

		ControllerTipoVeiculo contCol = new ControllerTipoVeiculo();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
