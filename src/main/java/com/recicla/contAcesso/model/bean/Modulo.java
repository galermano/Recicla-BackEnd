package com.recicla.contAcesso.model.bean;

public class Modulo {
	
	private Integer id;
	private String nome;
	private String descricao;
	
	public Modulo(Integer id, String nome, String descricao) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public Modulo(Integer id) {
		this.id = id;
	}

	public Modulo(String nome) {
		this.nome = nome;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
		return "Modulo [id=" + id + ", nome=" + nome + ", descricao=" + descricao + "]";
	}

}
