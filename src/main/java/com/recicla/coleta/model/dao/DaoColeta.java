package com.recicla.coleta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.model.bean.Coleta;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoColeta {
	private final Connection c;

	public DaoColeta() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Coleta inserir(Coleta col) throws SQLException, ClassNotFoundException {
		String sql = "insert into col_coleta"
				+ " (id_status, compl, quantidade, data_sol, data_con, id_logradouro_r, id_logradouro_e, id_usuario_r, id_usuario_e)"
				+ " values (?,?,?,?,?,?,?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, col.getIdStatus());
		stmt.setString(2, col.getCompl());
		stmt.setInt(3, col.getQuantidade());
		stmt.setDate(4, col.getDataSol());
		stmt.setDate(5, col.getDataCon());
		stmt.setInt(6, col.getIdLogradouroR());
		stmt.setInt(7, col.getIdLogradouroE());
		stmt.setInt(8, col.getIdUsuarioR());
		stmt.setInt(9, col.getIdUsuarioE());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			col.setId(id);
		}
		stmt.close();
		return col;
	}

	public Coleta alterar(Coleta col) throws SQLException {
		String sql = "UPDATE col_coleta SET id_status = ?, compl = ?, quantidade = ?, data_sol = ?, data_con = ?, id_logradouro_r = ?, id_logradouro_e = ?, id_usuario_r = ?, id_usuario_e = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, col.getIdStatus());
		stmt.setString(2, col.getCompl());
		stmt.setInt(3, col.getQuantidade());
		stmt.setDate(4, col.getDataSol());
		stmt.setDate(5, col.getDataCon());
		stmt.setInt(6, col.getIdLogradouroR());
		stmt.setInt(7, col.getIdLogradouroE());
		stmt.setInt(8, col.getIdUsuarioR());
		stmt.setInt(9, col.getIdUsuarioE());
		stmt.setInt(10, col.getId());

		// executa
		stmt.execute();
		stmt.close();
		return col;
	}

	public Coleta buscar(Coleta col) throws SQLException {
		String sql = "select * from col_coleta WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, col.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Coleta retorno = null;
		while (rs.next()) {
			// criando o objeto Coleta
			retorno = new Coleta(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
					rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
			// adiciona o col à lista de cols
		}
		stmt.close();
		return retorno;
	}

	public List<Coleta> listar(Coleta colEnt) throws SQLException {
		// cols: array armazena a lista de registros

		List<Coleta> cols = new ArrayList<Coleta>();

		String sql = "select * from col_coleta where data_sol like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + colEnt.getDataSol() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Coleta
			Coleta col = new Coleta(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
					rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
			// adiciona o col à lista de cols
			cols.add(col);
		}

		rs.close();
		stmt.close();
		return cols;

	}

	public List<Coleta> listarTodos() throws SQLException {
		// cols: array armazena a lista de registros
		
		List<Coleta> cols = new ArrayList<Coleta>();
		
		String sql = "select * from col_coleta";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		
		ResultSet rs = stmt.executeQuery();
		
		while (rs.next()) {
			// criando o objeto Coleta
			Coleta col = new Coleta(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
					rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10));
			// adiciona o col à lista de cols
			cols.add(col);
		}
		
		rs.close();
		stmt.close();
		return cols;
		
	}

	public Coleta excluir(Coleta col) throws SQLException {
		String sql = "delete from col_coleta WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, col.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return col;
	}
}
