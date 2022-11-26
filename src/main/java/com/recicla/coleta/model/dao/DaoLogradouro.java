package com.recicla.coleta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.model.bean.Logradouro;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoLogradouro {
	private final Connection c;

	public DaoLogradouro() throws ClassNotFoundException, SQLException {
		super();
		this.c = new ConexaoDB().getConnection();
	}

	// Função de inserir Logradouro
	public Logradouro inserir(Logradouro log) throws ClassNotFoundException, SQLException {
		String sql = "insert into log_logradouro" + " (id_regiao, cep)" + " values (?,?)";
		// prepared logtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, log.getIdRegiao());
		stmt.setString(2, log.getCep());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			log.setId(id);
		}
		stmt.close();
		return log;
	}

	public Logradouro alterar(Logradouro log) throws SQLException {
		String sql = "UPDATE log_logradouro SET id_regiao = ?, cep = ? WHERE id = ?";
		// prepared logtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, log.getIdRegiao());
		stmt.setString(2, log.getCep());
		stmt.setInt(3, log.getId());

		// executa
		stmt.execute();
		stmt.close();
		return log;
	}

	public Logradouro buscar(Logradouro log) throws SQLException {
		String sql = "select * from log_logradouro WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, log.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Logradouro retorno = null;
		while (rs.next()) {
			// criando o objeto Logradouro
			retorno = new Logradouro(
					rs.getInt(1), 
					rs.getInt(2), 
					rs.getString(3)
				);
			// adiciona o log à lilog de logs
		}
		stmt.close();
		return retorno;
	}

	public List<Logradouro> listar(Logradouro logEnt) throws SQLException {
		// logs: array armazena a lilog de logistros

		List<Logradouro> logs = new ArrayList<Logradouro>();

		String sql = "select * from log_logradouro where id_regiao like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + logEnt.getIdRegiao() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Logradouro
			Logradouro log = new Logradouro(
					rs.getInt(1), 
					rs.getInt(2), 
					rs.getString(3));
			// adiciona o log à lilog de logs
			logs.add(log);
		}

		rs.close();
		stmt.close();
		return logs;

	}
	public List<Logradouro> listarTodos() throws SQLException {
		// logs: array armazena a lilog de logistros

		List<Logradouro> logs = new ArrayList<Logradouro>();

		String sql = "select * from log_logradouro";
		PreparedStatement stmt = this.c.prepareStatement(sql);

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Logradouro
			Logradouro log = new Logradouro(
					rs.getInt(1), 
					rs.getInt(2), 
					rs.getString(3));
			// adiciona o log à lilog de logs
			logs.add(log);
		}

		rs.close();
		stmt.close();
		return logs;

	}

	public Logradouro excluir(Logradouro log) throws SQLException {
		String sql = "delete from log_logradouro WHERE id = ?";
		// prepared logtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, log.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return log;
	}
}
