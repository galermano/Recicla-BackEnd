package com.recicla.contAcesso;

import java.util.Date;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerHistoricoAcesso;
import com.recicla.contAcesso.model.bean.HistoricoAcesso;

import junit.framework.TestCase;

public class TestHistoricoAcesso extends TestCase {
    @Test
    @DisplayName("Teste de inserção de HistoricoAcesso")
    public void testInserirHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
	 	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	 	Date dataInicio = formatter.parse("20-11-2022");
	 	Date dataFim = formatter.parse("30-11-2022");
        HistoricoAcesso newCol = new HistoricoAcesso(1,1,1,1,1,"identificacao","tipo pessoa","nome","login","senha",new java.sql.Date(dataInicio.getTime()),new java.sql.Date(dataFim.getTime()),"tipo usuario");

        ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

    }

    @Test
    @DisplayName("Teste de busca de HistoricoAcesso")
    public void testBuscarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
        HistoricoAcesso newCol = new HistoricoAcesso(2);
        ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();

        newCol = (contCol.buscar(newCol));
    }

    @Test
    @DisplayName("Teste de listar de HistoricoAcesso")
    public void testListarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
	 	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    	Date data = formatter.parse("30-11-2022");
        HistoricoAcesso newCol = new HistoricoAcesso(new java.sql.Date(data.getTime()));
        ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
        assertNotNull(contCol.listar(newCol));

    }

//    @Test
//    @DisplayName("Teste de excluir de HistoricoAcesso")
//    public void testExcluirHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
//        HistoricoAcesso newCol = new HistoricoAcesso(4);
//        ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
//
//        assertNotNull(contCol.excluir(newCol));
//    }

//    @Test
//    @DisplayName("Teste de alterar de HistoricoAcesso")
//    public void testAlterarHistoricoAcesso() throws ClassNotFoundException, SQLException, ParseException {
//        HistoricoAcesso newCol = new HistoricoAcesso(1, 2, 2, 2);
//
//        ControllerHistoricoAcesso contCol = new ControllerHistoricoAcesso();
//        assertNotNull(contCol.alterar(newCol).getId_usu());
//
//    }
}
