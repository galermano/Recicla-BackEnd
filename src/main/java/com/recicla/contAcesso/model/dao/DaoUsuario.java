package com.recicla.contAcesso.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoUsuario {
	private final Connection c;

	public DaoUsuario() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Usuario inserir(Usuario usu) throws SQLException, ClassNotFoundException {
		String sql = "insert into usuario" + " (id_pessoa, id_status, login, senha, tipo, data_inicio, data_fim)"
				+ " values (?,?,?,?,?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, usu.getId_pessoa());
		stmt.setInt(2, usu.getId_status());
		stmt.setString(3, usu.getLogin());
		stmt.setString(4, usu.getSenha());
		stmt.setString(5, usu.getTipo());
		stmt.setDate(6, (Date) usu.getData_inicio());
		stmt.setDate(7, (Date) usu.getData_fim());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			usu.setId(id);
		}
		stmt.close();
		return usu;
	}

	public Usuario alterar(Usuario usu) throws SQLException {
		String sql = "UPDATE usuario SET id_pessoa = ?, id_status = ?, login = ?, senha = ?, data_inicio = ?, data_fim = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, usu.getId_pessoa());
		stmt.setInt(2, usu.getId_status());
		stmt.setString(3, usu.getLogin());
		stmt.setString(4, usu.getSenha());
		stmt.setString(5, usu.getTipo());
		stmt.setDate(6, (Date) usu.getData_inicio());
		stmt.setDate(7, (Date) usu.getData_fim());
		stmt.setInt(8, usu.getId());

		// executa
		stmt.execute();
		stmt.close();
		return usu;
	}

	public Usuario buscar(Usuario usu) throws SQLException {
		String sql = "select * from usuario WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, usu.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Usuario retorno = null;
		while (rs.next()) {
			// criando o objeto Usuario
			retorno = new Usuario(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getDate(7), rs.getDate(8));
			// adiciona o usu à lista de usus
		}
		stmt.close();
		return retorno;
	}

	public List<Usuario> listar(Usuario usuEnt) throws SQLException {
		// usus: array armazena a lista de registros

		List<Usuario> usus = new ArrayList<Usuario>();

		String sql = "select * from usuario where login like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + usuEnt.getLogin() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Usuario
			Usuario usu = new Usuario(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5),
					rs.getString(6), rs.getDate(7), rs.getDate(8));
			// adiciona o usu à lista de usus
			usus.add(usu);
		}

		rs.close();
		stmt.close();
		return usus;

	}

	public Usuario excluir(Usuario usu) throws SQLException {
		String sql = "delete from usu_Usuario WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, usu.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return usu;
	}

	public Usuario validar(Usuario usu) throws SQLException {
		// cria o select para ser executado no banco de dados
		String sql = "select * from usuario WHERE login = ? AND senha = ?";
		// prepared statement para seleção
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, usu.getLogin());
		stmt.setString(2, usu.getSenha());
		// executa
		ResultSet rs = stmt.executeQuery();
		// percorrendo o rs
		Usuario usuSaida = null;
		while (rs.next()) {
			// criando o objeto Usuario
			usuSaida = new Usuario(
					rs.getInt(1),
					rs.getInt(2), 
					rs.getInt(3), 
					rs.getString(4), 
					rs.getString(5),
					rs.getString(6),
					rs.getDate(7), 
					rs.getDate(8)
					);
			// adiciona o usu à lista de usus
		}
		stmt.close();
		System.out.println("Usuario: " + usuSaida.toString());

		return usuSaida;
	}
}
