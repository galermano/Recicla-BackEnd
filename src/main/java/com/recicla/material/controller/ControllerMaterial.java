package com.recicla.material.controller;

import com.recicla.material.model.bean.*;
import com.recicla.material.model.dao.DaoMaterial;
import java.sql.SQLException;
import java.util.ArrayList;
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
        System.out.println(mat);
        mat = daoMat.buscar(mat);
        System.out.println(mat);
        ControllerTipoMaterial contTm = new ControllerTipoMaterial();
        TipoMaterial tipoTm = new TipoMaterial(mat.getId_tipo_material());
        mat.setTipoMat(contTm.buscar(tipoTm));
        return mat;
    }

    public List<Material> listar(Material mat) throws SQLException, ClassNotFoundException {
        daoMat = new DaoMaterial();
    	List<Material> listaMaterial = daoMat.listar(mat);
    	List<Material> listaMaterialAux = new ArrayList<Material>();
    	for(Material mataux : listaMaterial) {
    		listaMaterialAux.add(buscar(mataux));
    	}
        return listaMaterialAux;
    }
}
