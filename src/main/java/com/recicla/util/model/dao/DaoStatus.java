package com.recicla.util.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.recicla.util.model.been.ConexaoDB;
import com.recicla.util.model.been.Status;

public class DaoStatus {
	
	private final Connection c;
	
	public DaoStatus() throws ClassNotFoundException, SQLException {
		super();
		this.c = new ConexaoDB().getConnection();
	}


	public Status inserir(Status sta) throws ClassNotFoundException, SQLException {
		String sql = "insert into sta_status" + " (nome, descricao)" + " values (?,?)";
		// prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

        // seta os valores
        stmt.setString(1,sta.getNome());
        stmt.setString(2,sta.getDescricao());
        
        // executa
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            sta.setId(id);
        }
        stmt.close();
        return sta;
	}
}
