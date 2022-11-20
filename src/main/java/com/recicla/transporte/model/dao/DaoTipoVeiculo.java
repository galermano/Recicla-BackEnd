package com.recicla.transporte.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.transporte.model.been.TipoVeiculo;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoTipoVeiculo {
	private final Connection c;

	public DaoTipoVeiculo() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public TipoVeiculo inserir(TipoVeiculo tr) throws SQLException, ClassNotFoundException {
		String sql = "insert into tr_TipoVeiculo" + " (nome, descricao)" + " values (?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, tr.getNome());
		stmt.setString(2, tr.getDescricao());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			tr.setId(id);
		}
		stmt.close();
		return tr;
	}

	public TipoVeiculo alterar(TipoVeiculo tr) throws SQLException {
		String sql = "UPDATE tr_TipoVeiculo SET nome = ?, descricao = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, tr.getNome());
		stmt.setString(2, tr.getDescricao());
		stmt.setInt(3, tr.getId());

		// executa
		stmt.execute();
		stmt.close();
		return tr;
	}

	public TipoVeiculo buscar(TipoVeiculo tr) throws SQLException {
		String sql = "select * from tr_TipoVeiculo WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, tr.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		TipoVeiculo retorno = null;
		while (rs.next()) {
			// criando o objeto TipoVeiculo
			retorno = new TipoVeiculo(rs.getInt(1), rs.getString(2), rs.getString(3));
			// adiciona o tr à lista de trs
		}
		stmt.close();
		return retorno;
	}

	// method list still in progress
	public List<TipoVeiculo> listar(TipoVeiculo trEnt) throws SQLException {
		// trs: array armazena a lista de registros

		List<TipoVeiculo> trs = new ArrayList<TipoVeiculo>();

		String sql = "select * from tr_TipoVeiculo";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
//		stmt.setString(1, "%" + trEnt.getId() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto TipoVeiculo
			TipoVeiculo tr = new TipoVeiculo(rs.getInt(1), rs.getString(2), rs.getString(3));
			// adiciona o tr à lista de trs
			trs.add(tr);
		}

		rs.close();
		stmt.close();
		return trs;

	}

	public TipoVeiculo excluir(TipoVeiculo tr) throws SQLException {
		String sql = "delete from tr_TipoVeiculo WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, tr.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return tr;
	}
}