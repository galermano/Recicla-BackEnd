package com.recicla.material.model.dao;

import com.recicla.material.model.bean.HistoricoTipoMaterial;
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
public class DaoHistoricoTipoMaterial {

    private final Connection c;

    public DaoHistoricoTipoMaterial() throws SQLException, ClassNotFoundException {
        //Reservado para a linkagem com o arquivo de conexão do banco de dados
        this.c = new ConexaoDB().getConnection();
    }

    public HistoricoTipoMaterial inserir(HistoricoTipoMaterial histTipoMat) throws SQLException {
        String sql = "insert into htm_historicoTipoMaterial" + " (nome, descricao, especificacao)" + " values (?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, histTipoMat.getNome());
        stmt.setString(2, histTipoMat.getDescricao());
        stmt.setString(3, histTipoMat.getEspecificacao());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            histTipoMat.setId(id);
        }
        stmt.close();
        return histTipoMat;
    }

    public HistoricoTipoMaterial buscar(HistoricoTipoMaterial histTipoMat) throws SQLException {
        String sql = "select * from htm_historicoTipoMaterial WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setInt(1, histTipoMat.getId());
        ResultSet rs = stmt.executeQuery();
        HistoricoTipoMaterial retorno = null;
        while (rs.next()) {
            retorno = new HistoricoTipoMaterial(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
            );
        }
        stmt.close();
        return retorno;
    }

    public HistoricoTipoMaterial alterar(HistoricoTipoMaterial histTipoMat) throws SQLException {
        String sql = "UPDATE htm_historicoTipoMaterial SET nome = ?, descricao = ?, especificacao = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, histTipoMat.getNome());
        stmt.setString(2, histTipoMat.getDescricao());
        stmt.setString(3, histTipoMat.getEspecificacao());
        stmt.setInt(4, histTipoMat.getId());
        stmt.execute();
        stmt.close();
        return histTipoMat;
    }

    public HistoricoTipoMaterial excluir(HistoricoTipoMaterial histTipoMat) throws SQLException {
        String sql = "delete from htm_historicoTipoMaterial WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, histTipoMat.getId());
        stmt.execute();
        stmt.close();
        c.close();
        return histTipoMat;
    }

    public List<HistoricoTipoMaterial> listar(HistoricoTipoMaterial histTipoMatEnt) throws SQLException {
        List<HistoricoTipoMaterial> histTipoMats = new ArrayList<HistoricoTipoMaterial>();

        String sql = "select * from htm_historicoTipoMaterial where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + histTipoMatEnt.getNome() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            HistoricoTipoMaterial histTipoMat = new HistoricoTipoMaterial(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
            );
            histTipoMats.add(histTipoMat);
        }
        rs.close();
        stmt.close();
        return histTipoMats;
    }
}
