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
		DaoVeiculo daoVei = new DaoVeiculo();
        return daoVei.buscar(TR);
	}

	public List<Veiculo> listar(Veiculo TR) throws ClassNotFoundException, SQLException {
		daoVei = new DaoVeiculo();
    	List<Veiculo> listaVeiculo = daoVei.listar(TR);
    	List<Veiculo> listaVeiculoAux = new ArrayList<Veiculo>();
    	for(Veiculo veiaux : listaVeiculo) {
    		listaVeiculoAux.add(buscar(veiaux));
    	}
        return listaVeiculoAux;
	}

	public List<Veiculo> listarTodos() throws ClassNotFoundException, SQLException {
		daoVei = new DaoVeiculo();
		List<Veiculo> listaVeiculo = daoVei.listarTodos();
		List<Veiculo> listaVeiculoAux = new ArrayList<Veiculo>();
		listaVeiculoAux.addAll(listaVeiculo);
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
