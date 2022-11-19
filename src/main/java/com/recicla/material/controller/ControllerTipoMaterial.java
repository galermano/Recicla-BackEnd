package com.recicla.material.controller;

import com.recicla.material.model.been.TipoMaterial;
import com.recicla.material.model.dao.DaoTipoMaterial;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lauro
 */
public class ControllerTipoMaterial {

    DaoTipoMaterial daoTipoMat;

    public TipoMaterial TipoMaterial(TipoMaterial tipoMat) throws SQLException, ClassNotFoundException {
        daoTipoMat = new DaoTipoMaterial();
        return daoTipoMat.inserir(tipoMat);
    }

    public TipoMaterial alterar(TipoMaterial tipoMat) throws SQLException, ClassNotFoundException {
        daoTipoMat = new DaoTipoMaterial();
        return daoTipoMat.alterar(tipoMat);
    }

    public TipoMaterial excluir(TipoMaterial tipoMat) throws SQLException, ClassNotFoundException {
        daoTipoMat = new DaoTipoMaterial();
        return daoTipoMat.excluir(tipoMat);
    }

    public TipoMaterial buscar(TipoMaterial tipoMat) throws SQLException, ClassNotFoundException {
        daoTipoMat = new DaoTipoMaterial();
        return daoTipoMat.buscar(tipoMat);
    }

    public List<TipoMaterial> listar(TipoMaterial tipoMat) throws SQLException, ClassNotFoundException {
        daoTipoMat = new DaoTipoMaterial();
        return daoTipoMat.listar(tipoMat);
    }

}
