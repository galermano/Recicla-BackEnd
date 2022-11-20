package com.recicla.transporte.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.transporte.model.bean.TipoVeiculo;
 
import com.recicla.util.model.bean.ConexaoDB;

public class DaoTipoVeiculo {
	private final Connection c;

	public DaoTipoVeiculo() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public TipoVeiculo inserir(TipoVeiculo tr) throws SQLException, ClassNotFoundException {
		String sql = "insert into tip_tipoveiculo" + " (nome, descricao)" + " values (?,?)";

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
		String sql = "UPDATE tip_tipoveiculo SET nome = ?, descricao = ? WHERE id = ?";
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
		String sql = "select * from tip_tipoveiculo WHERE id = ?";
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
	
    public List<TipoVeiculo> listar(TipoVeiculo trEnt) throws SQLException {
        List<TipoVeiculo> tiposLista = new ArrayList<TipoVeiculo>();

        String sql = "select * from tip_tipoveiculo where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + trEnt.getNome() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	TipoVeiculo trAux = new TipoVeiculo(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
            );
            tiposLista.add( trAux);
        }
        rs.close();
        stmt.close();
        return tiposLista;
    }

	public TipoVeiculo excluir(TipoVeiculo tr) throws SQLException {
		String sql = "delete from tip_tipoveiculo WHERE id = ?";
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