package com.recicla.contAcesso;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Usuario;

import junit.framework.TestCase;

public class TestUsuario extends TestCase {

    @Test
    @DisplayName("Teste de inserção de Usuario")
    public void testInserirUsuario() throws ClassNotFoundException, SQLException, ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date data_inicio = new Date();
        Date data_fim = formatter.parse("30-11-2022");

        Usuario newCol = new Usuario(1, 1, 1, "usuario@email.com", "password",
                new java.sql.Date(data_inicio.getTime()), new java.sql.Date(data_fim.getTime()));

        ControllerUsuario contCol = new ControllerUsuario();
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());
        assertNotNull("nao encontrado", contCol.inserir(newCol).getId());

    }

    @Test
    @DisplayName("Teste de busca de Usuario")
    public void testBuscarUsuario() throws ClassNotFoundException, SQLException, ParseException {
        Usuario newCol = new Usuario(4);
        ControllerUsuario contCol = new ControllerUsuario();

        newCol = (contCol.buscar(newCol));
    }

    @Test
    @DisplayName("Teste de listar de Usuario")
    public void testListarUsuario() throws ClassNotFoundException, SQLException, ParseException {

        Usuario newCol = new Usuario("usuario2@email.com");
        ControllerUsuario contCol = new ControllerUsuario();
        assertNotNull(contCol.listar(newCol));

    }

    @Test
    @DisplayName("Teste de excluir de Usuario")
    public void testExcluirUsuario() throws ClassNotFoundException, SQLException, ParseException {
        Usuario newCol = new Usuario(5);
        ControllerUsuario contCol = new ControllerUsuario();

        assertNotNull(contCol.excluir(newCol));
    }

    @Test
    @DisplayName("Teste de alterar de Usuario")
    public void testAlterarUsuario() throws ClassNotFoundException, SQLException, ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date data_inicio = new Date();
        Date data_fim = formatter.parse("31-12-2022");

        Usuario newCol = new Usuario(1,1, 1, 1, "usuario1@email.com", "password1",
                new java.sql.Date(data_inicio.getTime()), new java.sql.Date(data_fim.getTime()));

        ControllerUsuario contCol = new ControllerUsuario();
        assertNotNull(contCol.alterar(newCol).getId());

    }
}
