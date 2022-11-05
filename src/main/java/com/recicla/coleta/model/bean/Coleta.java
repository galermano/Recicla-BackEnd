package com.recicla.coleta.model.bean;

import java.util.Date;

public class Coleta {

	private int id;
	private int idStatus;
	private String compl;
	private int quantidade;
	private Date dataSol;
	private Date dataCon;
	//Id de logradouro de coleta (daonde pega)
	private int idLogradouroR;
	//Id de logradouro de entrega (daonde entrega)
	private int idLogradouroE;
	private int idUsuarioR;
	private int idUsuarioE;
	
	public Coleta(int id, int idStatus, String compl, int quantidade, Date dataSol, Date dataCon, int idLogradouroR,
			int idLogradouroE, int idUsuarioR, int idUsuarioE) {
		super();
		this.id = id;
		this.idStatus = idStatus;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.dataCon = dataCon;
		this.idLogradouroR = idLogradouroR;
		this.idLogradouroE = idLogradouroE;
		this.idUsuarioR = idUsuarioR;
		this.idUsuarioE = idUsuarioE;
	}

	public Coleta(int idStatus, String compl, int quantidade, Date dataSol, Date dataCon, int idLogradouroR,
			int idLogradouroE, int idUsuarioR, int idUsuarioE) {
		super();
		this.idStatus = idStatus;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.dataCon = dataCon;
		this.idLogradouroR = idLogradouroR;
		this.idLogradouroE = idLogradouroE;
		this.idUsuarioR = idUsuarioR;
		this.idUsuarioE = idUsuarioE;
	}

	public Coleta(Date dataSol) {
		super();
		this.dataSol = dataSol;
	}
	
	public Coleta(int id, String compl, int quantidade, Date dataSol, Date dataCon) {
		super();
		this.id = id;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.dataCon = dataCon;
	}

	public Coleta() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdStatus() {
		return idStatus;
	}

	public void setIdStatus(int idStatus) {
		this.idStatus = idStatus;
	}

	public String getCompl() {
		return compl;
	}

	public void setCompl(String compl) {
		this.compl = compl;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getDataSol() {
		return dataSol;
	}

	public void setDataSol(Date dataSol) {
		this.dataSol = dataSol;
	}

	public Date getDataCon() {
		return dataCon;
	}

	public void setDataCon(Date dataCon) {
		this.dataCon = dataCon;
	}

	public int getIdLogradouroR() {
		return idLogradouroR;
	}

	public void setIdLogradouroR(int idLogradouroR) {
		this.idLogradouroR = idLogradouroR;
	}

	public int getIdLogradouroE() {
		return idLogradouroE;
	}

	public void setIdLogradouroE(int idLogradouroE) {
		this.idLogradouroE = idLogradouroE;
	}

	public int getIdUsuarioR() {
		return idUsuarioR;
	}

	public void setIdUsuarioR(int idUsuarioR) {
		this.idUsuarioR = idUsuarioR;
	}

	public int getIdUsuarioE() {
		return idUsuarioE;
	}

	public void setIdUsuarioE(int idUsuarioE) {
		this.idUsuarioE = idUsuarioE;
	}

	
	
	
}
