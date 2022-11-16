package com.recicla.contAcesso.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.model.bean.Acesso;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.util.model.bean.ConexaoDB;

public class DaoAcesso {
	private final Connection c;

	public DaoAcesso() throws ClassNotFoundException, SQLException {
		this.c = new ConexaoDB().getConnection();
	}

	public Acesso inserir(Acesso acess) throws SQLException, ClassNotFoundException {
<<<<<<< HEAD
		String sql = "insert into acesso"
				+ " (id_modulo, tipo)"
				+ " values (?,?)";
=======
		String sql = "insert into acesso" + " (id_modulo, id_usuario, tipo)" + " values (?,?,?)";
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8

		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

		// seta os valores
		stmt.setInt(1, acess.getId_modulo());
<<<<<<< HEAD
		stmt.setString(2, acess.getTipo());
		
=======
		stmt.setInt(2, acess.getId_usuario());
		stmt.setString(3, acess.getTipo());
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8

		// executa
		stmt.executeUpdate();
		ResultSet rs = stmt.getGeneratedKeys();
		if (rs.next()) {
			int id = rs.getInt(1);
			acess.setId(id);
		}
		stmt.close();
		return acess;
	}

	public Acesso alterar(Acesso acess) throws SQLException {
		String sql = "UPDATE acesso SET id_modulo = ?, tipo = ? WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, acess.getId_modulo());
		stmt.setString(2, acess.getTipo());
		stmt.setInt(3, acess.getId());

		// executa
		stmt.execute();
		stmt.close();
		return acess;
	}

	public Acesso buscar(Acesso acess) throws SQLException {
		String sql = "select * from acesso WHERE id = ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, acess.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		Acesso retorno = null;
		while (rs.next()) {
			// criando o objeto Acesso
<<<<<<< HEAD
			retorno = new Acesso(rs.getInt(1),rs.getInt(2), rs.getString(3));
=======
			retorno = new Acesso(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8
			// adiciona o acess à lista de acesss
		}
		stmt.close();
		return retorno;
	}

	public List<Acesso> listar(Acesso acessEnt) throws SQLException {
		// acesss: array armazena a lista de registros

		List<Acesso> acesss = new ArrayList<Acesso>();

		String sql = "select * from acesso where tipo like ?";
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setString(1, "%" + acessEnt.getTipo() + "%");

		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			// criando o objeto Acesso
<<<<<<< HEAD
			Acesso acess = new Acesso(rs.getInt(1),rs.getInt(2), rs.getString(3));
=======
			Acesso acess = new Acesso(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8
			// adiciona o acess à lista de acesss
			acesss.add(acess);
		}

		rs.close();
		stmt.close();
		return acesss;

	}

	public Acesso excluir(Acesso acess) throws SQLException {
		String sql = "delete from acesso WHERE id = ?";
		// prepared statement para inserção
		PreparedStatement stmt = c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, acess.getId());
		// executa
		stmt.execute();
		stmt.close();
		c.close();
		return acess;
	}

	public Acesso validar(Acesso acess) throws SQLException {
		// cria o select para ser executado no banco de dados
		String sql = "select * from acesso WHERE id = ?";
		// prepared statement para seleção
		PreparedStatement stmt = this.c.prepareStatement(sql);
		// seta os valores
		stmt.setInt(1, acess.getId());
		// executa
		ResultSet rs = stmt.executeQuery();
		// percorrendo o rs
		Acesso acessSaida = null;
		while (rs.next()) {
			// criando o objeto Usuario
			acessSaida = new Acesso(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4));
			// adiciona o usu à lista de usus
		}
		stmt.close();
		System.out.println("Acesso: " + acessSaida.toString());

		return acessSaida;
	}

}
