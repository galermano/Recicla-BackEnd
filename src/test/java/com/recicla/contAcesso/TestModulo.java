package com.recicla.contAcesso;

import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.text.ParseException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerModulo;
import com.recicla.contAcesso.model.bean.Modulo;

import junit.framework.TestCase;

public class TestModulo extends TestCase {
    @Test
    @DisplayName("Teste de inserção de Modulo")
    public void testInserirModulo() throws ClassNotFoundException, SQLException, ParseException {

        Modulo newCol = new Modulo(2, "latinha de cerveja", "descricao");

        ControllerModulo contCol = new ControllerModulo();
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

    }

    @Test
    @DisplayName("Teste de busca de Modulo")
    public void testBuscarModulo() throws ClassNotFoundException, SQLException, ParseException {
        Modulo newCol = new Modulo(4);
        ControllerModulo contCol = new ControllerModulo();

        newCol = (contCol.buscar(newCol));
    }

    @Test
    @DisplayName("Teste de listar de Modulo")
    public void testListarModulo() throws ClassNotFoundException, SQLException, ParseException {

        Modulo newCol = new Modulo("latinha de cerveja");
        ControllerModulo contCol = new ControllerModulo();
        assertNotNull(contCol.listar(newCol));

    }

    @Test
    @DisplayName("Teste de excluir de Modulo")
    public void testExcluirModulo() throws ClassNotFoundException, SQLException, ParseException {
        Modulo newCol = new Modulo(2);
        ControllerModulo contCol = new ControllerModulo();

        assertNotNull(contCol.excluir(newCol));
    }

    @Test
    @DisplayName("Teste de alterar de Modulo")
    public void testAlterarModulo() throws ClassNotFoundException, SQLException, ParseException {
        Modulo newCol = new Modulo(3, "latinha de cerveja", "descricao");

        ControllerModulo contCol = new ControllerModulo();
        assertNotNull(contCol.alterar(newCol).getId());

    }
}
