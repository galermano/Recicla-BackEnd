package com.recicla.util.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.util.model.bean.ConexaoDB;
import com.recicla.util.model.bean.HistoricoStatus;

public class DaoHistoricoStatus {
	
	private final Connection c;
	
	public DaoHistoricoStatus() throws ClassNotFoundException, SQLException {
		super();
		this.c = new ConexaoDB().getConnection();
	}

	// Função de inserir HistoricoStatus
	public HistoricoStatus inserir(HistoricoStatus sta) throws ClassNotFoundException, SQLException {
		String sql = "insert into his_historico_status" + " (nome, descricao)" + " values (?,?)";
		// prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,sta.getNome());
        stmt.setString(2,sta.getDescricao());
        
        // executa
        stmt.execute();
        stmt.close();
        return sta;
	}
	
	public HistoricoStatus alterar(HistoricoStatus sta) throws SQLException{
        String sql = "UPDATE his_historico_status SET nome = ?, descricao = ? WHERE nome = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,sta.getNome());
        stmt.setString(2,sta.getDescricao());
        stmt.setString(3,sta.getNome());

        // executa
        stmt.execute();
        stmt.close();
        return sta;
    }
    
    public HistoricoStatus buscar(HistoricoStatus sta) throws SQLException{
        String sql = "select * from his_historico_status WHERE nome = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
            // seta os valores
            stmt.setString(1,sta.getNome());
            // executa
            ResultSet rs = stmt.executeQuery();
            HistoricoStatus retorno = null;
            while (rs.next()) {      
            // criando o objeto HistoricoStatus
                retorno = new HistoricoStatus(
                    rs.getString(1),
                    rs.getString(2)
                );
            // adiciona o sta à lista de stas
            }
            stmt.close();
        return retorno;
   }
   
   public List<HistoricoStatus> listar(HistoricoStatus staEnt) throws SQLException{
         // stas: array armazena a lista de registros

        List<HistoricoStatus> stas = new ArrayList<HistoricoStatus>();
        
        String sql = "select * from his_historico_status where descricao like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + staEnt.getDescricao()+ "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto HistoricoStatus
            HistoricoStatus sta = new HistoricoStatus(
                rs.getString(1),
                rs.getString(2)
            );
            // adiciona o sta à lista de stas
            stas.add(sta);
        }
        
        rs.close();
        stmt.close();
        return stas;
        
    }
   
    public HistoricoStatus excluir(HistoricoStatus sta) throws SQLException{
        String sql = "delete from his_historico_status WHERE nome = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,sta.getNome());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return sta;
    }
}
