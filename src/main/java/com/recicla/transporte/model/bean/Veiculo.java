package com.recicla.transporte.model.bean;

import com.recicla.contAcesso.model.bean.Usuario;

public class Veiculo {

	private int id;
	private String placa;
	private int idtipo;
	private TipoVeiculo tipo;
	private int capacidade;
	private int idusuario;
	private Usuario usuario;
	
	
	public Veiculo(int id, String placa, int idtipo, TipoVeiculo tipo, int capacidade, int idusuario, Usuario usuario) {
		super();
		this.id = id;
		this.placa = placa;
		this.idtipo = idtipo;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.idusuario = idusuario;
		this.usuario = usuario;
	}
	
	public Veiculo(int id) {
		super();
		this.id = id;
	}
	
	public Veiculo(TipoVeiculo tipo) {
		super();
		this.tipo = tipo;
	}
	
	public Veiculo(String placa, int idtipo, TipoVeiculo tipo, int capacidade, int idusuario, Usuario usuario) {
		super();
		this.placa = placa;
		this.idtipo = idtipo;
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.idusuario = idusuario;
		this.usuario = usuario;
	}

	public Veiculo(int id, String placa, int idtipo, int capacidade, int idusuario) {
		super();
		this.id = id;
		this.placa = placa;
		this.idtipo = idtipo;
		this.capacidade = capacidade;
		this.idusuario = idusuario;
	}

	public Veiculo(String placa, int idtipo, int capacidade, int idusuario) {
		super();
		this.placa = placa;
		this.idtipo = idtipo;
		this.capacidade = capacidade;
		this.idusuario = idusuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getIdtipo() {
		return idtipo;
	}

	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", placa=" + placa + ", idtipo=" + idtipo + ", tipo=" + tipo + ", capacidade="
				+ capacidade + ", idusuario=" + idusuario + ", usuario=" + usuario + "]";
	}
	
	
	
}