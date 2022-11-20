package com.recicla.contAcesso.model.bean;

import java.util.Date;

public class HistoricoAcesso {
	private Integer id;
	private Integer id_usuario;
	private Integer id_pessoa;
	private Integer id_status;
	private Integer id_acesso;
	private Integer id_logradouro;
	private String identificacao;
	private String tipo_pessoa;
	private String nome;
	private String login;
	private String senha;
	private Date data_inicio;
	private Date data_fim;
	private String tipo_usuario;
	
	public HistoricoAcesso() {
	}

	
	
	public HistoricoAcesso(Integer id_usuario, Integer id_pessoa, Integer id_status, Integer id_acesso,
			Integer id_logradouro, String identificacao, String tipo_pessoa, String nome, String login, String senha,
			Date data_inicio, Date data_fim, String tipo_usuario, Integer id) {
		super();
		this.id_usuario = id_usuario;
		this.id_pessoa = id_pessoa;
		this.id_status = id_status;
		this.id_acesso = id_acesso;
		this.id_logradouro = id_logradouro;
		this.identificacao = identificacao;
		this.tipo_pessoa = tipo_pessoa;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.tipo_usuario = tipo_usuario;
		this.id = id;
	}
	
	

	public HistoricoAcesso(Integer id, Integer id_usuario, Integer id_pessoa, Integer id_status, Integer id_acesso,
			Integer id_logradouro, String identificacao, String tipo_pessoa, String nome, String login, String senha,
			Date data_inicio, Date data_fim, String tipo_usuario) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_pessoa = id_pessoa;
		this.id_status = id_status;
		this.id_acesso = id_acesso;
		this.id_logradouro = id_logradouro;
		this.identificacao = identificacao;
		this.tipo_pessoa = tipo_pessoa;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
		this.tipo_usuario = tipo_usuario;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id) {
		this.id = id_usuario;
	}

	
	public Integer getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(Integer id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	public Integer getId_status() {
		return id_status;
	}

	public void setId_status(Integer id_status) {
		this.id_status = id_status;
	}

	public Integer getId_acesso() {
		return id_acesso;
	}

	public void setId_acesso(Integer id_acesso) {
		this.id_acesso = id_acesso;
	}

	public Integer getId_logradouro() {
		return id_logradouro;
	}

	public void setId_logradouro(Integer id_logradouro) {
		this.id_logradouro = id_logradouro;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getTipo_pessoa() {
		return tipo_pessoa;
	}

	public void setTipo_pessoa(String tipo_pessoa) {
		this.tipo_pessoa = tipo_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public Date getData_fim() {
		return data_fim;
	}

	public void setData_fim(Date data_fim) {
		this.data_fim = data_fim;
	}

	public String getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	@Override
	public String toString() {
		return "HistoricoAcesso [id=" + id + ", id_pessoa=" + id_pessoa + ", id_status=" + id_status + ", id_acesso="
				+ id_acesso + ", id_logradouro=" + id_logradouro + ", identificacao=" + identificacao + ", tipo_pessoa="
				+ tipo_pessoa + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", data_inicio="
				+ data_inicio + ", data_fim=" + data_fim + ", tipo_usuario=" + tipo_usuario + "]";
	}

}
