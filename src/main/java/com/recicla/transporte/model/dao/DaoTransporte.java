package com.recicla.transporte.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.transporte.model.bean.TipoVeiculo;
import com.recicla.transporte.model.bean.Transporte;

import com.recicla.util.model.bean.ConexaoDB;

public class DaoTransporte {
	private final Connection c;

	public DaoTransporte() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Transporte inserir(Transporte tr) throws SQLException, ClassNotFoundException {
		String sql = "insert into tra_transporte"
				+ " (recipiente)"
				+ " values (?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, tr.getRecipiente());

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

	public Transporte alterar(Transporte tr) throws SQLException {
		String sql = "UPDATE tra_transporte SET recipiente = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, tr.getRecipiente());
		stmt.setInt(2, tr.getId());

		// executa
		stmt.execute();
		stmt.close();
		return tr;
	}

	public Transporte buscar(Transporte tr) throws SQLException {
		String sql = "select * from tra_transporte WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, tr.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Transporte retorno = null;
		while (rs.next()) {
			// criando o objeto Transporte
			retorno = new Transporte(rs.getInt(1), rs.getString(2));
			// adiciona o tr à lista de trs
		}
		stmt.close();
		return retorno;
	}
	
	
    public List<Transporte> listar(Transporte trEnt) throws SQLException {
        List<Transporte> tiposLista = new ArrayList<Transporte>();

        String sql = "select * from tra_transporte where recipiente like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + trEnt.getRecipiente() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	Transporte trAux = new Transporte(
                    rs.getInt(1),
                    rs.getString(2)
            );
            tiposLista.add( trAux);
        }
        rs.close();
        stmt.close();
        return tiposLista;
    }


	public Transporte excluir(Transporte tr) throws SQLException {
		String sql = "delete from tra_transporte WHERE id = ?";
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