package com.recicla.material.controller;

import com.recicla.material.model.been.Material;
import com.recicla.material.model.dao.DaoMaterial;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lauro
 */
public class ControllerMaterial {
    
    DaoMaterial daoMat;

    public Material inserir(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
        return daoMat.inserir(mat);
    }

    public Material alterar(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
        return daoMat.alterar(mat);
    }

    public Material excluir(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
        return daoMat.excluir(mat);
    }

    public Material buscar(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
        return daoMat.buscar(mat);
    }

    public List<Material> listar(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
        return daoMat.listar(mat);
    }
}
