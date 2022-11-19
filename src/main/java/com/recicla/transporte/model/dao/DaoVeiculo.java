package com.recicla.transporte.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.transporte.model.been.Veiculo;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoVeiculo {
	private final Connection c;

	public DaoVeiculo() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Veiculo inserir(Veiculo tr) throws SQLException, ClassNotFoundException {
		String sql = "insert into tr_Veiculo"
				+ " (id_status, compl, quantidade, data_sol, data_con, id_logradouro_r, id_logradouro_e, id_usuario_r, id_usuario_e)"
				+ " values (?,?,?,?,?,?,?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, tr.getId());
		stmt.setString(2, tr.getPlaca());
		stmt.setInt(3, tr.getIdtipo());
		stmt.setInt(4, tr.getCapacidade());
		stmt.setInt(5, tr.getIdusuario());

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

	public Veiculo alterar(Veiculo tr) throws SQLException {
		String sql = "UPDATE tr_Veiculo SET id_status = ?, compl = ?, quantidade = ?, data_sol = ?, data_con = ?, id_logradouro_r = ?, id_logradouro_e = ?, id_usuario_r = ?, id_usuario_e = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, tr.getId());
		stmt.setString(2, tr.getPlaca());
		stmt.setInt(3, tr.getIdtipo());
		stmt.setInt(4, tr.getCapacidade());
		stmt.setInt(5, tr.getIdusuario());
		stmt.setInt(6, tr.getId());

		// executa
		stmt.execute();
		stmt.close();
		return tr;
	}

	public Veiculo buscar(Veiculo tr) throws SQLException {
		String sql = "select * from tr_Veiculo WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, tr.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Veiculo retorno = null;
		while (rs.next()) {
			// criando o objeto Veiculo
			retorno = new Veiculo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
			// adiciona o tr à lista de trs
		}
		stmt.close();
		return retorno;
	}
	
	
	//method list still in progress
	public List<Veiculo> listar(Veiculo trEnt) throws SQLException {
		// trs: array armazena a lista de registros

		List<Veiculo> trs = new ArrayList<Veiculo>();

		String sql = "select * from tr_Veiculo";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
//		stmt.setString(1, "%" + trEnt.getId() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Veiculo
			Veiculo tr = new Veiculo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
			// adiciona o tr à lista de trs
			trs.add(tr);
		}

		rs.close();
		stmt.close();
		return trs;

	}

	public Veiculo excluir(Veiculo tr) throws SQLException {
		String sql = "delete from tr_Veiculo WHERE id = ?";
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