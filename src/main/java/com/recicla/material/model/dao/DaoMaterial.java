package com.recicla.material.model.dao;

import com.recicla.material.model.bean.Material;
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
public class DaoMaterial {

    private final Connection c;

    public DaoMaterial() throws SQLException, ClassNotFoundException {
        //Reservado para a linkagem com o arquivo de conexão do banco de dados
        this.c = new ConexaoDB().getConnection();
    }

    public Material inserir(Material mat) throws SQLException {
        String sql = "insert into mat_material" + " (id_tipo_material, nome, descricao)" + " values (?,?,?)";
        PreparedStatement stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        stmt.setInt(1, mat.getId_tipo_material());
        stmt.setString(2, mat.getNome());
        stmt.setString(3, mat.getDescricao());
        stmt.executeUpdate();
        ResultSet rs = stmt.getGeneratedKeys();
        if (rs.next()) {
            int id = rs.getInt(1);
            mat.setId(id);
        }
        stmt.close();
        return mat;
    }

    public Material buscar(Material mat) throws SQLException {
        String sql = "select * from mat_material WHERE id = ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setInt(1, mat.getId());
        ResultSet rs = stmt.executeQuery();
        Material retorno = null;
        while (rs.next()) {
            retorno = new Material(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4)
            );
        }
        stmt.close();
        return retorno;
    }

    public Material alterar(Material mat) throws SQLException {
        String sql = "UPDATE mat_material SET id_tipo_material = ?, nome = ?, descricao = ? WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, mat.getId_tipo_material());
        stmt.setString(2, mat.getNome());
        stmt.setString(3, mat.getDescricao());
        stmt.setInt(4, mat.getId());
        stmt.execute();
        stmt.close();
        return mat;
    }

    public Material excluir(Material mat) throws SQLException {
        String sql = "delete from mat_material WHERE id = ?";
        PreparedStatement stmt = c.prepareStatement(sql);
        stmt.setInt(1, mat.getId());
        stmt.execute();
        stmt.close();
        c.close();
        return mat;
    }

    public List<Material> listar(Material matEnt) throws SQLException {
        List<Material> mats = new ArrayList<Material>();

        String sql = "select * from mat_material where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        stmt.setString(1, "%" + matEnt.getNome() + "%");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Material mat = new Material(
                    rs.getInt(1),
                    rs.getInt(2),
                    rs.getString(3),
                    rs.getString(4)
            );
            mats.add(mat);
        }
        rs.close();
        stmt.close();
        return mats;
    }

}