package com.recicla.contAcesso.model.bean;

import java.util.Date;

public class Usuario {
	private Integer id;
	private Integer id_pessoa;
	private Integer id_status;
	private Integer id_acesso;
	private String login;
	private String senha;
	private String tipo;
	private Date data_inicio;
	private Date data_fim;
	
	public Usuario() {
	}
	
	public Usuario(Integer id, Integer id_pessoa, Integer id_status, Integer id_acesso, String login, String senha, String tipo,
			Date data_inicio, Date data_fim) {
		
		this.id = id;
		this.id_pessoa = id_pessoa;
		this.id_status = id_status;
		this.id_acesso = id_acesso;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}
	
	public Usuario(Integer id_pessoa, Integer id_status, Integer id_acesso, String login, String senha, String tipo,
			Date data_inicio, Date data_fim) {
		
		this.id_pessoa = id_pessoa;
		this.id_status = id_status;
		this.id_acesso = id_acesso;
		this.login = login;
		this.senha = senha;
		this.tipo = tipo;
		this.data_inicio = data_inicio;
		this.data_fim = data_fim;
	}

	public Usuario(Integer id) {
		super();
		this.id = id;
	}

	public Usuario(String login) {
		super();
		this.login = login;
	}

	public Usuario(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_pessoa=" + id_pessoa + ", id_status=" + id_status + ", id_acesso="
				+ id_acesso + ", login=" + login + ", senha=" + senha + ", tipo=" + tipo + ", data_inicio="
				+ data_inicio + ", data_fim=" + data_fim + "]";
	}

	
}	
