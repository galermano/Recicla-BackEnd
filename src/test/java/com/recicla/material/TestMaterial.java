package com.recicla.material;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.material.controller.ControllerMaterial;
import com.recicla.material.model.bean.Material;

import junit.framework.TestCase;


public class TestMaterial extends TestCase {

	@Test
	@DisplayName("Teste de inserção de Material")
	public void testInserirMaterial() throws ClassNotFoundException, SQLException, ParseException {

		Material newCol = new Material(3,"latinha de cerveja","descricao");

		ControllerMaterial contCol = new ControllerMaterial();
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());
		assertNotNull("nao encontrado",contCol.inserir(newCol).getId());


	}

	@Test
	@DisplayName("Teste de busca de Material")
	public void testBuscarMaterial() throws ClassNotFoundException, SQLException, ParseException {
		Material newCol = new Material(3);
		ControllerMaterial contCol = new ControllerMaterial();

		newCol=(contCol.buscar(newCol));
        System.out.println(newCol);
	}

	 @Test
	 @DisplayName("Teste de listar de Material")
	 public void testListarMaterial() throws ClassNotFoundException, SQLException, ParseException {

	 	Material newCol = new Material("latinha de cerveja");
	 	ControllerMaterial contCol = new ControllerMaterial();
	 	assertNotNull(contCol.listar(newCol));
        System.out.println(newCol);

	 }

	 @Test
	 @DisplayName("Teste de excluir de Material")
	 public void testExcluirMaterial() throws ClassNotFoundException, SQLException, ParseException {
	 	Material newCol = new Material(3);
	 	ControllerMaterial contCol = new ControllerMaterial();

	 	assertNotNull(contCol.excluir(newCol));
	 }

	 @Test
	 @DisplayName("Teste de alterar de Material")
	 public void testAlterarMaterial() throws ClassNotFoundException, SQLException, ParseException {
			Material newCol = new Material(3,"latinha de cerveja","descricao");

		ControllerMaterial contCol = new ControllerMaterial();
	 	assertNotNull(contCol.alterar(newCol).getId());

	 }

}
