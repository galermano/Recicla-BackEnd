package com.recicla.contAcesso.model.bean;

import java.util.Date;

public class HistoricoAcesso {
	private Integer id;
	private Integer id_usu;
	private Date dataAcesso;
	
	public HistoricoAcesso() {
	}

	public HistoricoAcesso(Integer id, Integer id_usu, Date dataAcesso) {
		super();
		this.id = id;
		this.id_usu = id_usu;
		this.dataAcesso = dataAcesso;
	}

	public HistoricoAcesso(Integer id_usu, Date dataAcesso) {
		super();
		this.id_usu = id_usu;
		this.dataAcesso = dataAcesso;
	}
	
	public HistoricoAcesso(Integer id) {
		super();
		this.id = id;
	}

	public HistoricoAcesso(Date dataAcesso) {
		super();
		this.dataAcesso = dataAcesso;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId_usu() {
		return id_usu;
	}

	public void setId_usu(Integer id_usu) {
		this.id_usu = id_usu;
	}

	public Date getDataAcesso() {
		return dataAcesso;
	}

	public void setDataAcesso(Date dataAcesso) {
		this.dataAcesso = dataAcesso;
	}

	@Override
	public String toString() {
		return "HistoricoAcesso [id=" + id + ", id_usu=" + id_usu + ", dataAcesso=" + dataAcesso + "]";
	}

}
