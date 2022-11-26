package com.recicla.contAcesso.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Pessoa;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoPessoa {
	private final Connection c;

	public DaoPessoa() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Pessoa inserir(Pessoa pes) throws SQLException, ClassNotFoundException {
		String sql = "insert into pes_pessoa"
				+ " (nome, identificacao, id_logradouro)"
				+ " values (?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, pes.getNome());
		stmt.setString(2, pes.getIdentificacao());
		stmt.setInt(3, pes.getId_logradouro());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			pes.setId(id);
		}
		stmt.close();
		return pes;
	}

	public Pessoa alterar(Pessoa pes) throws SQLException {
		String sql = "UPDATE pes_pessoa SET nome = ?, identificacao = ?,  id_logradouro = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, pes.getNome());
		stmt.setString(2, pes.getIdentificacao());
		stmt.setInt(3, pes.getId_logradouro());
		stmt.setInt(4, pes.getId());
		
		// executa
		stmt.execute();
		stmt.close();
		return pes;
	}

	public Pessoa buscar(Pessoa pes) throws SQLException {
		String sql = "select * from pes_pessoa WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, pes.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Pessoa retorno = null;
		while (rs.next()) {
			// criando o objeto Pessoa
			retorno = new Pessoa(rs.getInt(1),
					rs.getString(2),
					rs.getString(3),
					rs.getInt(4));
			// adiciona o pes à lista de pess
		}
		stmt.close();
		return retorno;
	}

	public List<Pessoa> listar(Pessoa pesEnt) throws SQLException {
		// pess: array armazena a lista de registros

		List<Pessoa> pess = new ArrayList<Pessoa>();

		String sql = "select * from pes_pessoa where nome like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + pesEnt.getNome() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Pessoa
			Pessoa pes = new Pessoa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
			// adiciona o pes à lista de pess
			pess.add(pes);
		}

		rs.close();
		stmt.close();
		return pess;

	}

	public Pessoa excluir(Pessoa pes) throws SQLException {
		String sql = "delete from pes_Pessoa WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, pes.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return pes;
	}
}
