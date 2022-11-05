package com.recicla.util;

import java.sql.SQLException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.util.controller.ControllerStatus;
import com.recicla.util.model.bean.Status;

import junit.framework.TestCase;

public class TestUtilController extends TestCase{
	
	private Status sta;
	
	@Test
	@DisplayName("Teste de Inserção de STATUS")
	public void testInserir() throws ClassNotFoundException, SQLException {
		this.sta = new Status("DISPONIVEL", "Coleta Disponivel");
		ControllerStatus contSta = new ControllerStatus();
		Status staResponse = contSta.inserir(this.sta);
		assertNotNull(staResponse.getId());
	}
	
}
