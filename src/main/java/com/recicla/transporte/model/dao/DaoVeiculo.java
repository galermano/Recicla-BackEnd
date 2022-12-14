package com.recicla.transporte.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.transporte.model.bean.TipoVeiculo;
import com.recicla.transporte.model.bean.Veiculo;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoVeiculo {
	private final Connection c;

	public DaoVeiculo() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Veiculo inserir(Veiculo tr) throws SQLException, ClassNotFoundException {
		String sql = "insert into vei_veiculo"
				+ " (placa, id_tipo, capacidade, usuario_id)"
				+ " values (?,?,?,?)";

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setString(1, tr.getPlaca());
		stmt.setInt(2, tr.getIdtipo());
		stmt.setInt(3, tr.getCapacidade());
		stmt.setInt(4, tr.getIdusuario());

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
		String sql = "UPDATE vei_veiculo SET placa = ?, id_tipo = ?, capacidade = ?, usuario_id = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, tr.getPlaca());
		stmt.setInt(2, tr.getIdtipo());
		stmt.setInt(3, tr.getCapacidade());
		stmt.setInt(4, tr.getIdusuario());
		stmt.setInt(5, tr.getId());

		// executa
		stmt.execute();
		stmt.close();
		return tr;
	}

	public Veiculo buscar(Veiculo tr) throws SQLException {
		String sql = "select * from vei_veiculo WHERE id = ?";
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
	
	
    public List<Veiculo> listar(Veiculo trEnt) throws SQLException {
        List<Veiculo> tiposLista = new ArrayList<Veiculo>();
        TipoVeiculo newTV = trEnt.getTipo();
        String sql = "select * from vei_veiculo where id_tipo like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + newTV.getId() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	Veiculo trAux = new Veiculo(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5)
            );
            tiposLista.add( trAux);
        }
        rs.close();
        stmt.close();
        return tiposLista;
    }
    
    public List<Veiculo> listarTodos() throws SQLException {
        List<Veiculo> tiposLista = new ArrayList<Veiculo>();
        String sql = "select * from vei_veiculo";
        PreparedStatement stmt = this.c.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	Veiculo trAux = new Veiculo(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getInt(3),
                    rs.getInt(4),
                    rs.getInt(5)
            );
            tiposLista.add( trAux);
        }
        rs.close();
        stmt.close();
        return tiposLista;
    }

	public Veiculo excluir(Veiculo tr) throws SQLException {
		String sql = "delete from vei_veiculo WHERE id = ?";
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