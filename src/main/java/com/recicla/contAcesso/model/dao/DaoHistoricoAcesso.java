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
				+ " (id_usuario, id_pessoa, id_status, id_acesso, id_logradouro, identificacao, tipo_pessoa, nome, login, senha, data_inicio, data_fim, tipo_usuario)"
				+ " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, hist.getId_usuario());
		stmt.setInt(2, hist.getId_pessoa());
		stmt.setInt(3, hist.getId_status());
		stmt.setInt(4, hist.getId_acesso());
		stmt.setInt(5, hist.getId_logradouro());
		stmt.setString(6, hist.getIdentificacao());
		stmt.setString(7, hist.getTipo_pessoa());
		stmt.setString(8, hist.getNome());
		stmt.setString(9, hist.getLogin());
		stmt.setString(10, hist.getSenha());
		stmt.setDate(11, (Date) hist.getData_inicio());
		stmt.setDate(12, (Date) hist.getData_fim());
		stmt.setString(13, hist.getTipo_usuario());
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
		String sql = "UPDATE his_historicoacesso SET id_usuario = ?, id_pessoa = ?, id_status = ?, id_acesso = ?, id_logradouro = ?, identificacao = ?, tipo_pessoa = ?, nome = ?, login = ?, senha = ?, data_inicio = ?, data_fim = ?, tipo_usuario = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, hist.getId_usuario());
		stmt.setInt(2, hist.getId_pessoa());
		stmt.setInt(3, hist.getId_status());
		stmt.setInt(4, hist.getId_acesso());
		stmt.setInt(5, hist.getId_logradouro());
		stmt.setString(6, hist.getIdentificacao());
		stmt.setString(7, hist.getTipo_pessoa());
		stmt.setString(8, hist.getNome());
		stmt.setString(9, hist.getLogin());
		stmt.setString(10, hist.getSenha());
		stmt.setDate(11, (Date) hist.getData_inicio());
		stmt.setDate(12, (Date) hist.getData_fim());
		stmt.setString(13, hist.getTipo_usuario());
		stmt.setInt(14, hist.getId());
		
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
			retorno = new HistoricoAcesso(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getInt(4),rs.getInt(5),rs.getInt(6), rs.getString(7),rs.getString(8),rs.getString(9), rs.getString(10), rs.getString(11),rs.getDate(12),rs.getDate(13),rs.getString(14));
			// adiciona o hist à lista de hists
		}
		stmt.close();
		return retorno;
	}

	public List<HistoricoAcesso> listar(HistoricoAcesso histEnt) throws SQLException {
		// hists: array armazena a lista de registros

		List<HistoricoAcesso> hists = new ArrayList<HistoricoAcesso>();

		String sql = "select * from his_historicoacesso where data_inicio like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setDate(1, (Date) histEnt.getData_inicio());

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto HistoricoAcesso
			HistoricoAcesso hist = new HistoricoAcesso(rs.getInt(1),rs.getInt(2),rs.getInt(3), rs.getInt(4),rs.getInt(5),rs.getInt(6), rs.getString(7),rs.getString(8),rs.getString(9), rs.getString(10), rs.getString(11),rs.getDate(12),rs.getDate(13),rs.getString(14));
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
