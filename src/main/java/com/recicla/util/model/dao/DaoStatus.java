package com.recicla.util.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.recicla.util.model.bean.ConexaoDB;
import com.recicla.util.model.bean.Status;

public class DaoStatus {
	
	private final Connection c;
	
	public DaoStatus() throws ClassNotFoundException, SQLException {
		super();
		this.c = new ConexaoDB().getConnection();
	}

	// Função de inserir Status
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
	
	public Status alterar(Status sta) throws SQLException{
        String sql = "UPDATE sta_status SET nome = ?, descricao = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,sta.getNome());
        stmt.setString(2,sta.getDescricao());
        stmt.setLong(3,sta.getId());

        // executa
        stmt.execute();
        stmt.close();
        return sta;
    }
    
    public Status buscar(Status sta) throws SQLException{
        String sql = "select * from sta_status WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setLong(1,sta.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            Status retorno = null;
            while (rs.next()) {      
            // criando o objeto Status
                retorno = new Status(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3)
                );
            // adiciona o sta à lista de stas
            }
            stmt.close();
        return retorno;
   }
   
   public List<Status> listar(Status staEnt) throws SQLException{
         // stas: array armazena a lista de registros

        List<Status> stas = new ArrayList<Status>();
        
        String sql = "select * from sta_status where descricao like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + staEnt.getDescricao()+ "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Status
            Status sta = new Status(
                rs.getInt(1),
                rs.getString(2),
                rs.getString(3)
            );
            // adiciona o sta à lista de stas
            stas.add(sta);
        }
        
        rs.close();
        stmt.close();
        return stas;
        
    }

   public List<Status> listarTodos() throws SQLException{
	   // stas: array armazena a lista de registros
	   
	   List<Status> stas = new ArrayList<Status>();
	   
	   String sql = "select * from sta_status";
	   PreparedStatement stmt = this.c.prepareStatement(sql);

	   
	   ResultSet rs = stmt.executeQuery();
	   
	   while (rs.next()) {      
		   // criando o objeto Status
		   Status sta = new Status(
				   rs.getInt(1),
				   rs.getString(2),
				   rs.getString(3)
				   );
		   // adiciona o sta à lista de stas
		   stas.add(sta);
	   }
	   
	   rs.close();
	   stmt.close();
	   return stas;
	   
   }
   
    public Status excluir(Status sta) throws SQLException{
        String sql = "delete from sta_status WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setLong(1,sta.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return sta;
    }
}
