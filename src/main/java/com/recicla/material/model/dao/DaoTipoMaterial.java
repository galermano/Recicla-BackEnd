package com.recicla.material.model.dao;

import com.recicla.material.model.been.TipoMaterial;
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
public class DaoTipoMaterial {

    private final Connection c;

    public DaoTipoMaterial() throws SQLException, ClassNotFoundException {
        //Reservado para a linkagem com o arquivo de conexão do banco de dados
        this.c = new ConexaoDb().getConnection();
    }

    public TipoMaterial inserir(TipoMaterial tipoMat) throws SQLException {
        String sql = "insert into tim_tipo_material" + " (nome, descricao, especificacao)" + " values (?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setString(1, tipoMat.getNome());
        stmt.setString(2, tipoMat.getDescricao());
        stmt.setString(3, tipoMat.getEspecificacao());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            tipoMat.setId(id);
        }
        stmt.close();
        return tipoMat;
    }

    public TipoMaterial buscar(TipoMaterial tipoMat) throws SQLException {
        String sql = "select * from tim_tipo_material WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setInt(1, tipoMat.getId());
        ResultSet rs = stmt.executeQuery();
        TipoMaterial retorno = null;
        while (rs.next()) {
            retorno = new TipoMaterial(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
            );
        }
        stmt.close();
        return retorno;
    }

    public TipoMaterial alterar(TipoMaterial tipoMat) throws SQLException {
        String sql = "UPDATE tim_tipo_material SET nome = ?, SET descricao = ?, especificacao = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setString(1, tipoMat.getNome());
        stmt.setString(2, tipoMat.getDescricao());
        stmt.setString(3, tipoMat.getEspecificacao());
        stmt.setInt(4, tipoMat.getId());
        stmt.execute();
        stmt.close();
        return tipoMat;
    }

    public TipoMaterial excluir(TipoMaterial tipoMat) throws SQLException {
        String sql = "delete from tim_tipo_material WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, tipoMat.getId());
        stmt.execute();
        stmt.close();
        c.close();
        return tipoMat;
    }

    public List<TipoMaterial> listar(TipoMaterial tipoMatEnt) throws SQLException {
        List<TipoMaterial> tipoMats = new ArrayList<TipoMaterial>();

        String sql = "select * from tim_tipo_material where id like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + tipoMatEnt.getNome() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            TipoMaterial tipoMat = new TipoMaterial(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
            );
            tipoMats.add(tipoMatEnt);
        }
        rs.close();
        stmt.close();
        return tipoMats;
    }

}
