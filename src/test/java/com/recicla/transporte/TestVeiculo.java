package com.recicla.transporte;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.transporte.controller.ControllerVeiculo;
import com.recicla.transporte.model.bean.TipoVeiculo;
import com.recicla.transporte.model.bean.Veiculo;

import junit.framework.TestCase;


public class TestVeiculo extends TestCase {

	@Test
	@DisplayName("Teste de inserção de Veiculo")
	public void testInserirVeiculo() throws ClassNotFoundException, SQLException, ParseException {

		Veiculo newCol = new Veiculo("ABC-215",2,1245,1);

		ControllerVeiculo contCol = new ControllerVeiculo();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());

	}

	@Test
	@DisplayName("Teste de busca de Veiculo")
	public void testBuscarVeiculo() throws ClassNotFoundException, SQLException, ParseException {
		Veiculo newCol = new Veiculo(4);
		ControllerVeiculo contCol = new ControllerVeiculo();

		newCol=(contCol.buscar(newCol));
	}

	 @Test
	 @DisplayName("Teste de listar de Veiculo")
	 public void testListarVeiculo() throws ClassNotFoundException, SQLException, ParseException {
		 
		TipoVeiculo newTipoV = new TipoVeiculo(1);
	 	Veiculo newCol = new Veiculo(newTipoV);
	 	ControllerVeiculo contCol = new ControllerVeiculo();
	 	assertNotNull(contCol.listar(newCol));

	 }

	 @Test
	 @DisplayName("Teste de excluir de Veiculo")
	 public void testExcluirVeiculo() throws ClassNotFoundException, SQLException, ParseException {
	 	Veiculo newCol = new Veiculo(1);
	 	ControllerVeiculo contCol = new ControllerVeiculo();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de Veiculo")
	 public void testAlterarVeiculo() throws ClassNotFoundException, SQLException, ParseException {
			Veiculo newCol = new Veiculo(1,"ABC-215",2,1245,1);

		ControllerVeiculo contCol = new ControllerVeiculo();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
