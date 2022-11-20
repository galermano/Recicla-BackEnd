package com.recicla.util.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.util.model.bean.HistoricoStatus;
import com.recicla.util.model.dao.DaoHistoricoStatus;



public class ControllerHistoricoStatus {
	public HistoricoStatus inserir(HistoricoStatus sta) throws ClassNotFoundException, SQLException{
        DaoHistoricoStatus daoSta = new DaoHistoricoStatus();
        return daoSta.inserir(sta);
    }
	
	public HistoricoStatus buscar(HistoricoStatus sta) throws ClassNotFoundException, SQLException{
        DaoHistoricoStatus daoSta = new DaoHistoricoStatus();
        return daoSta.buscar(sta);
    }
    
    public List<HistoricoStatus> listar(HistoricoStatus sta) throws ClassNotFoundException, SQLException{
        DaoHistoricoStatus daoSta = new DaoHistoricoStatus();
        return daoSta.listar(sta);
    }
    
    public HistoricoStatus excluir(HistoricoStatus sta) throws ClassNotFoundException, SQLException{
        DaoHistoricoStatus daoSta = new DaoHistoricoStatus();
        return daoSta.excluir(sta);
    }
    
    public HistoricoStatus alterar(HistoricoStatus sta) throws ClassNotFoundException, SQLException{
        DaoHistoricoStatus daoSta = new DaoHistoricoStatus();
        return daoSta.alterar(sta);
    }
}
