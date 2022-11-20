package com.recicla.contAcesso.model.bean;

public class HistoricoAcesso {
	private Integer id_usu;
	private Integer id_mod;
	private Integer id_usu_mod;

	private Integer tipo;

	public HistoricoAcesso() {
	}

	public HistoricoAcesso(Integer id_usu, Integer id_mod, Integer id_usu_mod, Integer tipo) {
		super();
		this.id_usu = id_usu;
		this.id_mod = id_mod;
		this.id_usu_mod = id_usu_mod;
		this.tipo = tipo;
	}

	public Integer getId_usu() {
		return id_usu;
	}

	public HistoricoAcesso(Integer id_usu) {
		this.id_usu = id_usu;
	}

	public void setId_usu(Integer id_usu) {
		this.id_usu = id_usu;
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

	public Integer getId_usu_mod() {
		return id_usu_mod;
	}

	public void setId_usu_mod(Integer id_usu_mod) {
		this.id_usu_mod = id_usu_mod;
	}

	@Override
	public String toString() {
		return "HistoricoAcesso [, id_usu=" + id_usu + ", id_mod=" + id_mod
				+ ", id_usu_mod=" + id_usu_mod + ", tipo=" + tipo + "]";
	}

}
