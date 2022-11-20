package com.recicla.material;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.material.controller.ControllerTipoMaterial;
import com.recicla.material.model.bean.TipoMaterial;

import junit.framework.TestCase;


public class TestTipoMaterial extends TestCase {

	@Test
	@DisplayName("Teste de inserção de TipoMaterial")
	public void testInserirTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {

		TipoMaterial newCol = new TipoMaterial("aluminio","metal","metais e aluminios");

		ControllerTipoMaterial contCol = new ControllerTipoMaterial();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());


	}

	@Test
	@DisplayName("Teste de busca de TipoMaterial")
	public void testBuscarTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
		TipoMaterial newCol = new TipoMaterial(3);
		ControllerTipoMaterial contCol = new ControllerTipoMaterial();

		newCol=(contCol.buscar(newCol));
        System.out.println(newCol);
	}

	 @Test
	 @DisplayName("Teste de listar de TipoMaterial")
	 public void testListarTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {

	 	TipoMaterial newCol = new TipoMaterial("latinha de cerveja");
	 	ControllerTipoMaterial contCol = new ControllerTipoMaterial();
	 	assertNotNull(contCol.listar(newCol));
        System.out.println(newCol);

	 }

	 @Test
	 @DisplayName("Teste de excluir de TipoMaterial")
	 public void testExcluirTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
	 	TipoMaterial newCol = new TipoMaterial(3);
	 	ControllerTipoMaterial contCol = new ControllerTipoMaterial();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de TipoMaterial")
	 public void testAlterarTipoMaterial() throws ClassNotFoundException, SQLException, ParseException {
			TipoMaterial newCol = new TipoMaterial(2,"aluminio","metal","metais e aluminios");

		ControllerTipoMaterial contCol = new ControllerTipoMaterial();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
