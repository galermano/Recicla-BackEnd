package com.recicla.coleta.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.coleta.model.been.Regiao;
import com.recicla.util.model.been.ConexaoDB;

public class DaoRegiao {
	private final Connection c;

	public DaoRegiao() throws ClassNotFoundException, SQLException {
		super();
		this.c = new ConexaoDB().getConnection();
	}

	// Função de inserir Regiao
	public Regiao inserir(Regiao reg) throws ClassNotFoundException, SQLException {
		String sql = "insert into reg_regiao" + " (nome, descricao)" + " values (?,?)";
		// prepared regtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, reg.getNome());
		stmt.setString(2, reg.getDescricao());

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			reg.setId(id);
		}
		stmt.close();
		return reg;
	}

	public Regiao alterar(Regiao reg) throws SQLException {
		String sql = "UPDATE reg_regiao SET nome = ?, descricao = ? WHERE id = ?";
		// prepared regtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, reg.getNome());
		stmt.setString(2, reg.getDescricao());
		stmt.setLong(3, reg.getId());

		// executa
		stmt.execute();
		stmt.close();
		return reg;
	}

	public Regiao buscar(Regiao reg) throws SQLException {
		String sql = "select * from reg_regiao WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setLong(1, reg.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Regiao retorno = null;
		while (rs.next()) {
			// criando o objeto Regiao
			retorno = new Regiao(rs.getInt(1), rs.getString(2), rs.getString(3));
			// adiciona o reg à lireg de regs
		}
		stmt.close();
		return retorno;
	}

	public List<Regiao> listar(Regiao regEnt) throws SQLException {
		// regs: array armazena a lireg de registros

		List<Regiao> regs = new ArrayList<Regiao>();

		String sql = "select * from reg_regiao where descricao like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + regEnt.getDescricao() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Regiao
			Regiao reg = new Regiao(rs.getInt(1), rs.getString(2), rs.getString(3));
			// adiciona o reg à lireg de regs
			regs.add(reg);
		}

		rs.close();
		stmt.close();
		return regs;

	}

	public Regiao excluir(Regiao reg) throws SQLException {
		String sql = "delete from reg_regiao WHERE id = ?";
		// prepared regtement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setLong(1, reg.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return reg;
	}
}
