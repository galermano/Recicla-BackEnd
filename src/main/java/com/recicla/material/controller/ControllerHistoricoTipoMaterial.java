package com.recicla.material.controller;

import com.recicla.material.model.been.HistoricoTipoMaterial;
import com.recicla.material.model.dao.DaoHistoricoTipoMaterial;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Lauro
 */
public class ControllerHistoricoTipoMaterial {

    DaoHistoricoTipoMaterial daoHistTipoMat;

    public HistoricoTipoMaterial inserir(HistoricoTipoMaterial histTipoMat) throws SQLException, ClassNotFoundException {
        daoHistTipoMat = new DaoHistoricoTipoMaterial();
        return daoHistTipoMat.inserir(histTipoMat);
    }

    public HistoricoTipoMaterial alterar(HistoricoTipoMaterial histTipoMat) throws SQLException, ClassNotFoundException {
        daoHistTipoMat = new DaoHistoricoTipoMaterial();
        return daoHistTipoMat.alterar(histTipoMat);
    }

    public HistoricoTipoMaterial excluir(HistoricoTipoMaterial histTipoMat) throws SQLException, ClassNotFoundException {
        daoHistTipoMat = new DaoHistoricoTipoMaterial();
        return daoHistTipoMat.excluir(histTipoMat);
    }

    public HistoricoTipoMaterial buscar(HistoricoTipoMaterial histTipoMat) throws SQLException, ClassNotFoundException {
        daoHistTipoMat = new DaoHistoricoTipoMaterial();
        return daoHistTipoMat.buscar(histTipoMat);
    }

    public List<HistoricoTipoMaterial> listar(HistoricoTipoMaterial histTipoMat) throws SQLException, ClassNotFoundException {
        daoHistTipoMat = new DaoHistoricoTipoMaterial();
        return daoHistTipoMat.listar(histTipoMat);
    }
}
