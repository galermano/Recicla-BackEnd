package com.recicla.contAcesso.model.bean;

import java.util.Date;

public class HistoricoAcesso {
	private Integer id;
	private Integer id_usu;
	private Integer id_mod;
	private Integer id_usu_mod;
	private Integer tipo;
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

	public Integer getId_mod() {
		return id_mod;
	}

	public void setId_mod(Integer id_mod) {
		this.id_mod = id_mod;
	}
		
	public Integer getAcesso() {
		return id_usu_mod;
	}

	public void setAcesso(Integer id_usu_mod) {
		this.id_usu_mod = id_usu_mod;
	}
	
	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "HistoricoAcesso [id=" + id + ", id_usu=" + id_usu + ", dataAcesso=" + dataAcesso + ", id_mod=" + id_mod + ", id_usu_mod=" + id_usu_mod + ", tipo=" + tipo + "]";
	}

}
