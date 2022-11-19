package com.recicla.contAcesso;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.recicla.contAcesso.controller.ControllerAcesso;
import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;

import junit.framework.TestCase;

public class TestContAcesso extends TestCase {

	@Test
	public void testInserirUsuario() throws ClassNotFoundException, SQLException, ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date dataSol = new Date();
		Date dataCon = formatter.parse("30-11-2022");
		
		Usuario newUsu = new Usuario(2, 2,3, "Otavio", "1234", "Coletor", new java.sql.Date(dataSol.getTime()), new java.sql.Date(dataCon.getTime()));
		
		ControllerUsuario contUsu = new ControllerUsuario();
		assertNotNull(contUsu.inserir(newUsu).getId());
	}
	
	@Test
	public void testInserirAcesso() throws ClassNotFoundException, SQLException, ParseException {
		Acesso newAcess = new Acesso(1, 1, "Adm");
		
		ControllerAcesso contAcess = new ControllerAcesso();
		
		assertNotNull(contAcess.inserir(newAcess).getId());
	}
	
	@Test
	public void testValidarAcesso() throws ClassNotFoundException, SQLException, ParseException {
		Acesso newAcess = new Acesso(4,1,"Adm");
		
		ControllerAcesso contAcess = new ControllerAcesso();
		
		assertNotNull(contAcess.validar(newAcess));
	}
	
	@Test
	public void testValidarLogin() throws ClassNotFoundException, SQLException, ParseException {
		Usuario usu = new Usuario("Kawan", "1234");
		
		ControllerUsuario contUsu = new ControllerUsuario();
		
		assertNotNull(contUsu.validar(usu));
	}
}
