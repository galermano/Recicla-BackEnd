package com.recicla.contAcesso;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Usuario;

import junit.framework.TestCase;

public class TestContAcesso extends TestCase {

	@Test
	public void testInserir() throws ClassNotFoundException, SQLException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dataSol = new Date();
		Date dataCon = formatter.parse("30-11-2022");
		
		Usuario newUsu = new Usuario(1, 1, "Kawan", "1234", "Coletor", new java.sql.Date(dataSol.getTime()), new java.sql.Date(dataCon.getTime()));
		
		ControllerUsuario contUsu = new ControllerUsuario();
		assertNotNull(contUsu.inserir(newUsu).getId());
	}
}
