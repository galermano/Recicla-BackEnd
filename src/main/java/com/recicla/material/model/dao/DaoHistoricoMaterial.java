package com.recicla.material.model.dao;

import com.recicla.material.model.bean.HistoricoMaterial;
import com.recicla.util.model.bean.ConexaoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lauro
 */
public class DaoHistoricoMaterial {

    private final Connection c;
    
    public DaoHistoricoMaterial() throws SQLException, ClassNotFoundException {
        //Reservado para a linkagem com o arquivo de conexão do banco de dados
        this.c = new ConexaoDB().getConnection();
    }

    public HistoricoMaterial inserir(HistoricoMaterial histMat) throws SQLException {
        String sql = "insert into hm_historicoMaterial" + " (id_material, id_tipo_material, nome, descricao)" + " values (?,?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setInt(1, histMat.getId_material());
        stmt.setInt(2, histMat.getId_tipo_material());
        stmt.setString(3, histMat.getNome());
        stmt.setString(4, histMat.getDescricao());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            histMat.setId(id);
        }
        stmt.close();
        return histMat;
    }

    public HistoricoMaterial buscar(HistoricoMaterial histMat) throws SQLException {
        String sql = "select * from hm_historicoMaterial WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setInt(1, histMat.getId());
        ResultSet rs = stmt.executeQuery();
        HistoricoMaterial retorno = null;
        while (rs.next()) {
            retorno = new HistoricoMaterial(
                    rs.getInt(1),
                    rs.getInt(2), 
                    rs.getInt(3),
                    rs.getString(3),
                    rs.getString(4)
            );
        }
        stmt.close();
        return retorno;
    }

    public HistoricoMaterial alterar(HistoricoMaterial histMat) throws SQLException {
    	System.out.println(histMat);
        String sql = "UPDATE hm_historicoMaterial SET id_material = ?, id_tipo_material = ?, nome = ?, descricao = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, histMat.getId_material());
        stmt.setInt(2, histMat.getId_tipo_material());
        stmt.setString(3, histMat.getNome());
        stmt.setString(4, histMat.getDescricao());
        stmt.setInt(5, histMat.getId());
        stmt.execute();
        stmt.close();
        return histMat;
    }

    public HistoricoMaterial excluir(HistoricoMaterial histMat) throws SQLException {
        String sql = "delete from hm_historicoMaterial WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, histMat.getId());
        stmt.execute();
        stmt.close();
        c.close();
        return histMat;
    }

    public List<HistoricoMaterial> listar(HistoricoMaterial histMatEnt) throws SQLException {
        List<HistoricoMaterial> histMats = new ArrayList<HistoricoMaterial>();

        String sql = "select * from hm_historicoMaterial where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + histMatEnt.getNome() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            HistoricoMaterial histMat = new HistoricoMaterial(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getInt(3),
                    rs.getString(4),
                    rs.getString(5)
            );
            histMats.add(histMat);
        }
        rs.close();
        stmt.close();
        return histMats;
    }
}
