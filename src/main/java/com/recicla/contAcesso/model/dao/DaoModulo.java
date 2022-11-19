package com.recicla.contAcesso.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Modulo;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoModulo {
	private final Connection c;

	public DaoModulo() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Modulo inserir(Modulo mod) throws SQLException, ClassNotFoundException {
		String sql = "insert into mod_modulo"
				+ " (nome, descricao)"
				+ " values (?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, mod.getNome());
		stmt.setString(2, mod.getDescricao());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			mod.setId(id);
		}
		stmt.close();
		return mod;
	}

	public Modulo alterar(Modulo mod) throws SQLException {
		String sql = "UPDATE mod_modulo SET nome = ?, descricao = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, mod.getNome());
		stmt.setString(2, mod.getDescricao());
		stmt.setInt(3, mod.getId());
		
		// executa
		stmt.execute();
		stmt.close();
		return mod;
	}

	public Modulo buscar(Modulo mod) throws SQLException {
		String sql = "select * from mod_modulo WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, mod.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Modulo retorno = null;
		while (rs.next()) {
			// criando o objeto Modulo
			retorno = new Modulo(rs.getInt(1),rs.getString(2), rs.getString(3));
			// adiciona o mod à lista de mods
		}
		stmt.close();
		return retorno;
	}

	public List<Modulo> listar(Modulo modEnt) throws SQLException {
		// mods: array armazena a lista de registros

		List<Modulo> mods = new ArrayList<Modulo>();

		String sql = "select * from mod_modulo where nome like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + modEnt.getNome() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Modulo
			Modulo mod = new Modulo(rs.getInt(1), rs.getString(2), rs.getString(3));
			// adiciona o mod à lista de mods
			mods.add(mod);
		}

		rs.close();
		stmt.close();
		return mods;

	}

	public Modulo excluir(Modulo mod) throws SQLException {
		String sql = "delete from mod_modulo WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, mod.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return mod;
	}
}
