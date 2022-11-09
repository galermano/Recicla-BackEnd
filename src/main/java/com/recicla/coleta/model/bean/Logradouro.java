package com.recicla.coleta.model.bean;

public class Logradouro {

	private int id;
	private int idRegiao;
	private Regiao regiao;
	private String cep;

	
	
	protected Regiao getRegiao() {
		return regiao;
	}

	protected void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdRegiao() {
		return idRegiao;
	}

	public void setIdRegiao(int idRegiao) {
		this.idRegiao = idRegiao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	
	
	public Logradouro(int id, int idRegiao, Regiao regiao, String cep) {
		super();
		this.id = id;
		this.idRegiao = idRegiao;
		this.regiao = regiao;
		this.cep = cep;
	}

	public Logradouro() {
		super();
	}

	public Logradouro(int id) {
		super();
		this.id = id;
	}

	public Logradouro(int id, int idRegiao, String cep) {
		super();
		this.id = id;
		this.idRegiao = idRegiao;
		this.cep = cep;
	}
	
	public Logradouro( int idRegiao, String cep) {
		super();
		this.idRegiao = idRegiao;
		this.cep = cep;
	}
	
	public Logradouro(String cep) {
		super();
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Logradouro [id=" + id + ", idRegiao=" + idRegiao + ", cep=" + cep + "]";
	}

}
