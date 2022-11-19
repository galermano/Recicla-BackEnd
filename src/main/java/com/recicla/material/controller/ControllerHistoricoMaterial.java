package com.recicla.material.controller;

import com.recicla.material.model.been.HistoricoMaterial;
import com.recicla.material.model.dao.DaoHistoricoMaterial;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lauro
 */
public class ControllerHistoricoMaterial {

    DaoHistoricoMaterial daoHistMat;

    public HistoricoMaterial inserir(HistoricoMaterial histMat) throws SQLException, ClassNotFoundException {
        daoHistMat = new DaoHistoricoMaterial();
        return daoHistMat.inserir(histMat);
    }

    public HistoricoMaterial alterar(HistoricoMaterial histMat) throws SQLException, ClassNotFoundException {
        daoHistMat = new DaoHistoricoMaterial();
        return daoHistMat.alterar(histMat);
    }

    public HistoricoMaterial excluir(HistoricoMaterial histMat) throws SQLException, ClassNotFoundException {
        daoHistMat = new DaoHistoricoMaterial();
        return daoHistMat.excluir(histMat);
    }

    public HistoricoMaterial buscar(HistoricoMaterial histMat) throws SQLException, ClassNotFoundException {
        daoHistMat = new DaoHistoricoMaterial();
        return daoHistMat.buscar(histMat);
    }

    public List<HistoricoMaterial> listar(HistoricoMaterial histMat) throws SQLException, ClassNotFoundException {
        daoHistMat = new DaoHistoricoMaterial();
        return daoHistMat.listar(histMat);
    }
}
