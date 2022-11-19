package com.recicla.contAcesso.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.HistoricoAcesso;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoHistoricoAcesso {
	private final Connection c;

	public DaoHistoricoAcesso() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public HistoricoAcesso inserir(HistoricoAcesso hist) throws SQLException, ClassNotFoundException {
		String sql = "insert into his_historicoacesso"
				+ " (id_usu,dataAcesso)"
				+ " values (?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, hist.getId_usu());
		stmt.setDate(2, (Date) hist.getDataAcesso());
		
		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			hist.setId(id);
		}
		stmt.close();
		return hist;
	}

	public HistoricoAcesso alterar(HistoricoAcesso hist) throws SQLException {
		String sql = "UPDATE his_historicoacesso SET id_usu = ?, dataAcesso = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, hist.getId_usu());
		stmt.setDate(2, (Date) hist.getDataAcesso());
		stmt.setInt(5, hist.getId());
		
		// executa
		stmt.execute();
		stmt.close();
		return hist;
	}

	public HistoricoAcesso buscar(HistoricoAcesso hist) throws SQLException {
		String sql = "select * from his_historicoacesso WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, hist.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		HistoricoAcesso retorno = null;
		while (rs.next()) {
			// criando o objeto HistoricoAcesso
			retorno = new HistoricoAcesso(rs.getInt(1),rs.getInt(2), rs.getDate(3));
			// adiciona o hist à lista de hists
		}
		stmt.close();
		return retorno;
	}

	public List<HistoricoAcesso> listar(HistoricoAcesso histEnt) throws SQLException {
		// hists: array armazena a lista de registros

		List<HistoricoAcesso> hists = new ArrayList<HistoricoAcesso>();

		String sql = "select * from his_historicoacesso where dataAcesso like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + histEnt.getDataAcesso() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto HistoricoAcesso
			HistoricoAcesso hist = new HistoricoAcesso(rs.getInt(1), rs.getInt(2), rs.getDate(3));
			// adiciona o hist à lista de hists
			hists.add(hist);
		}

		rs.close();
		stmt.close();
		return hists;

	}

	public HistoricoAcesso excluir(HistoricoAcesso hist) throws SQLException {
		String sql = "delete from his_historicoacesso WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, hist.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return hist;
	}
}
