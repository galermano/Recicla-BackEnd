package com.recicla.transporte.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.recicla.contAcesso.controller.ControllerUsuario;
import com.recicla.contAcesso.model.bean.Usuario;
import com.recicla.transporte.model.bean.TipoVeiculo;
import com.recicla.transporte.model.bean.Veiculo;
import com.recicla.transporte.model.dao.DaoVeiculo;

public class ControllerVeiculo {
	DaoVeiculo daoVei;
	
	public Veiculo inserir(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.inserir(TR);
	}

	public Veiculo buscar(Veiculo TR) throws ClassNotFoundException, SQLException {
		daoVei = new DaoVeiculo();
        System.out.println(TR);
        TR = daoVei.buscar(TR);
        System.out.println(TR);
        ControllerTipoVeiculo contTV = new ControllerTipoVeiculo();
        TipoVeiculo TV = new TipoVeiculo(TR.getIdtipo());
        TR.setTipo(contTV.buscar(TV));
        
        ControllerUsuario contUsu = new ControllerUsuario();
        Usuario usu = new Usuario(TR.getIdusuario());
        TR.setUsuario(contUsu.buscar(usu));
        return TR;
	}

	public List<Veiculo> listar(Veiculo TR) throws ClassNotFoundException, SQLException {
		daoVei = new DaoVeiculo();
    	List<Veiculo> listaVeiculo = daoVei.listar(TR);
    	List<Veiculo> listaVeiculoAux = new ArrayList<>();
    	for(Veiculo veiaux : listaVeiculo) {
    		listaVeiculoAux.add(buscar(veiaux));
    	}
        return listaVeiculoAux;
	}

	public Veiculo excluir(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.excluir(TR);
	}

	public Veiculo alterar(Veiculo TR) throws ClassNotFoundException, SQLException {
		DaoVeiculo daoTR = new DaoVeiculo();
		return daoTR.alterar(TR);
	}
}
