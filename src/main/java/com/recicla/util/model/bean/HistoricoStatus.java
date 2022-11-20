package com.recicla.util.model.bean;

public class HistoricoStatus {

	private String nome;
	private String descricao;
	

	public HistoricoStatus(String nome, String descricao) {
		super();
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public HistoricoStatus(String nome) {
		super();
		this.nome = nome;
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
		return "HistoricoStatus [nome=" + nome + ", descricao=" + descricao + "]";
	}
	
	
}
