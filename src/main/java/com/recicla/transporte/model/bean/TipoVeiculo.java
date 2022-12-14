package com.recicla.transporte.model.bean;

public class TipoVeiculo {

	private int id;
	private String nome;
	private String descricao;
	
	
	public TipoVeiculo(int id, String nome, String descricao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	public TipoVeiculo(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public TipoVeiculo(String nome) {
		super();
		this.nome = nome;
	}
	
	public TipoVeiculo(int id) {
		super();
		this.id = id;
	}

	public TipoVeiculo() {
		super();
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

	@Override
	public String toString() {
		return "TipoVeiculo [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}
		
}