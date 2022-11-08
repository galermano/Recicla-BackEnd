package com.recicla.coleta.model.bean;

public class Regiao {

	private int id;
	private String nome;
	private String descricao;

	@Override
	public String toString() {
		return "Regiao [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Regiao() {
		super();
	}

	public Regiao(String descricao) {
		super();
		this.descricao = descricao;
	}
	
	public Regiao(int id) {
		super();
		this.id = id;
	}

	public Regiao(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}

	public Regiao(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

}
