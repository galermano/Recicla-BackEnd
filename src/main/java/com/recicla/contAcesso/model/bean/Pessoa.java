package com.recicla.contAcesso.model.bean;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private Integer identificacao;
	private Integer tipo;
	private Integer id_logradouro;
	
	public Pessoa(Integer id, String nome, Integer identificacao, Integer tipo, Integer id_logradouro) {
		this.id = id;
		this.nome = nome;
		this.identificacao = identificacao;
		this.tipo = tipo;
		this.id_logradouro = id_logradouro;
	}

	public Pessoa(String nome, Integer identificacao, Integer tipo, Integer id_logradouro) {
		super();
		this.nome = nome;
		this.identificacao = identificacao;
		this.tipo = tipo;
		this.id_logradouro = id_logradouro;
	}

	public Pessoa(Integer id) {
		super();
		this.id = id;
	}

	public Pessoa(String nome) {
		super();
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

	public Integer getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(Integer identificacao) {
		this.identificacao = identificacao;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public Integer getId_logradouro() {
		return id_logradouro;
	}

	public void setId_logradouro(Integer id_logradouro) {
		this.id_logradouro = id_logradouro;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", identificacao=" + identificacao + ", tipo=" + tipo
				+ ", id_logradouro=" + id_logradouro + "]";
	}
	
	
}
