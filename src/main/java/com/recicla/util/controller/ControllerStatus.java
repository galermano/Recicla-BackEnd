package com.recicla.util.controller;

import java.sql.SQLException;
import java.util.List;

import com.recicla.util.model.bean.Status;
import com.recicla.util.model.dao.DaoStatus;



public class ControllerStatus {
	public Status inserir(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.inserir(sta);
    }
	
	public Status buscar(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.buscar(sta);
    }
    
    public List<Status> listar(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.listar(sta);
    }

    public List<Status> listarTodos() throws ClassNotFoundException, SQLException{
    	DaoStatus daoSta = new DaoStatus();
    	return daoSta.listarTodos();
    }
    
    public Status excluir(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.excluir(sta);
    }
    
    public Status alterar(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.alterar(sta);
    }
}
