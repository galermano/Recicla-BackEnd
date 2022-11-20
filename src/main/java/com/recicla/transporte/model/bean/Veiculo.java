package com.recicla.transporte.model.bean;

public class Veiculo {

	private int id;
	private String placa;
	private int idtipo;
//	private TipoVeiculo tipo;
	private int capacidade;
	private int idusuario;
	
	
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
	
}