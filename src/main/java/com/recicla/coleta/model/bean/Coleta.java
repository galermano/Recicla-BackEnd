package com.recicla.coleta.model.bean;

import com.recicla.contAcesso.model.bean.Usuario;
import java.sql.Date;

public class Coleta {

	private int id;
	private int idStatus;
	private String compl;
	private int quantidade;
	private Date dataSol;
	private Date dataCon;
	//Id de logradouro de coleta (daonde pega)
	private int idLogradouroR;
	private Logradouro logradouroR;
	//Id de logradouro de entrega (daonde entrega)
	private int idLogradouroE;
	private Logradouro logradouroE;
	//Id de Usuario  de entrega (daonde entrega)
	private int idUsuarioR;
	private Usuario usuarioR;
	//Id de Usuario  de entrega (daonde entrega)
	private int idUsuarioE;
	private Usuario usuarioE;

	
	
	public Coleta(int idStatus, String compl, int quantidade, Date dataSol, int idLogradouroR, int idLogradouroE,
			int idUsuarioR, int idUsuarioE) {
		super();
		this.idStatus = idStatus;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.idLogradouroR = idLogradouroR;
		this.idLogradouroE = idLogradouroE;
		this.idUsuarioR = idUsuarioR;
		this.idUsuarioE = idUsuarioE;
	}

	public Coleta(int id, int idStatus, String compl, int quantidade, Date dataSol, Date dataCon, int idLogradouroR,
			int idLogradouroE, int idUsuarioR, int idUsuarioE) {
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

	@Override
	public String toString() {
		return "Coleta [id=" + id + ", idStatus=" + idStatus + ", compl=" + compl + ", quantidade=" + quantidade
				+ ", dataSol=" + dataSol + ", dataCon=" + dataCon + ", idLogradouroR=" + idLogradouroR
				+ ", logradouroR=" + logradouroR + ", idLogradouroE=" + idLogradouroE + ", logradouroE=" + logradouroE
				+ ", idUsuarioR=" + idUsuarioR + ", usuarioR=" + usuarioR + ", idUsuarioE=" + idUsuarioE + ", usuarioE="
				+ usuarioE + "]";
	}

	public Coleta(int idStatus, String compl, int quantidade, Date dataSol, Date dataCon, int idLogradouroR,
	Logradouro logradouroR, int idLogradouroE, Logradouro logradouroE, int idUsuarioR, int idUsuarioE, Usuario usuarioR, Usuario usuarioE) {
		this.idStatus = idStatus;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.dataCon = dataCon;
		this.idLogradouroR = idLogradouroR;
		this.logradouroR = logradouroR;
		this.idLogradouroE = idLogradouroE;
		this.logradouroE = logradouroE;
		this.idUsuarioR = idUsuarioR;
		this.usuarioR = usuarioR;
		this.idUsuarioE = idUsuarioE;
		this.usuarioE = usuarioE;
	}

	public Coleta(Date dataSol) {
		this.dataSol = dataSol;
	}
	
	public Coleta(int id) {
		this.id = id;
	}
	
	
	public Coleta(int id, String compl, int quantidade, Date dataSol, Date dataCon) {
		this.id = id;
		this.compl = compl;
		this.quantidade = quantidade;
		this.dataSol = dataSol;
		this.dataCon = dataCon;
	}

	public Coleta() {
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

	public Logradouro getLogradouroR() {
		return logradouroR;
	}

	public void setLogradouroR(Logradouro logradouroR) {
		this.logradouroR = logradouroR;
	}

	public Logradouro getLogradouroE() {
		return logradouroE;
	}

	public void setLogradouroE(Logradouro logradouroE) {
		this.logradouroE = logradouroE;
	}

	public Usuario getUsuarioR() {
		return usuarioR;
	}

	public void setUsuarioR(Usuario usuarioR) {
		this.usuarioR = usuarioR;
	}

	public Usuario getUsuarioE() {
		return usuarioE;
	}

	public void setUsuarioE(Usuario usuarioE) {
		this.usuarioE = usuarioE;
	}
	
	
}
