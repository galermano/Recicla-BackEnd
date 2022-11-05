package com.recicla.util.controller;

import java.sql.SQLException;

import com.recicla.util.model.been.Status;
import com.recicla.util.model.dao.DaoStatus;



public class ControllerStatus {
	public Status inserir(Status sta) throws ClassNotFoundException, SQLException{
        DaoStatus daoSta = new DaoStatus();
        return daoSta.inserir(sta);
    }
}
