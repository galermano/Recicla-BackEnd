package com.recicla.contAcesso;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerAcesso;
import com.recicla.contAcesso.model.bean.Acesso;

import junit.framework.TestCase;

public class TestAcesso {
    @Test
    @DisplayName("Teste de inserção de Acesso")
    public void testInserirAcesso() throws ClassNotFoundException, SQLException, ParseException {

        Acesso newCol = new Acesso(2, 2, "admin");

        ControllerAcesso contCol = new ControllerAcesso();
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

    }

    @Test
    @DisplayName("Teste de busca de Acesso")
    public void testBuscarAcesso() throws ClassNotFoundException, SQLException, ParseException {
        Acesso newCol = new Acesso(4);
        ControllerAcesso contCol = new ControllerAcesso();

        newCol = (contCol.buscar(newCol));
    }

    @Test
    @DisplayName("Teste de listar de Acesso")
    public void testListarAcesso() throws ClassNotFoundException, SQLException, ParseException {

        Acesso newCol = new Acesso("teste");
        ControllerAcesso contCol = new ControllerAcesso();
        assertNotNull(contCol.listar(newCol));

    }

    @Test
    @DisplayName("Teste de excluir de Acesso")
    public void testExcluirAcesso() throws ClassNotFoundException, SQLException, ParseException {
        Acesso newCol = new Acesso(5);
        ControllerAcesso contCol = new ControllerAcesso();

        assertNotNull(contCol.excluir(newCol));
    }

    @Test
    @DisplayName("Teste de alterar de Acesso")
    public void testAlterarAcesso() throws ClassNotFoundException, SQLException, ParseException {
        Acesso newCol = new Acesso(3, 3, "user");

        ControllerAcesso contCol = new ControllerAcesso();
        assertNotNull(contCol.alterar(newCol).getId());

    }
}
