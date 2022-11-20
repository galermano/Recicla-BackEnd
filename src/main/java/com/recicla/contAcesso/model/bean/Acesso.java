package com.recicla.contAcesso.model.bean;

public class Acesso {
	
	private Integer id;
	private Integer id_modulo;
	private String tipo;
	private Modulo modulo;
	

	public Acesso(Integer id, Integer id_modulo, String tipo) {
		this.id = id;
		this.id_modulo = id_modulo;
		this.tipo = tipo;
	}
	
	public Acesso(Integer id_modulo, String tipo) {
		this.id_modulo = id_modulo;
		this.tipo = tipo;
	}

	public Acesso(Integer id) {
		this.id = id;
	}

	public Acesso(String tipo) {
		this.tipo = tipo;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId_modulo() {
		return id_modulo;
	}
	public void setId_modulo(Integer id_modulo) {
		this.id_modulo = id_modulo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Modulo getModulo() {
		return modulo;
	}

	public void setModulo(Modulo modulo) {
		this.modulo = modulo;
	}
	
	public Acesso( Integer id_modulo, String tipo, Integer id) {
		super();
		this.id_modulo = id_modulo;
		this.tipo = tipo;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Acesso [id_modulo=" + id_modulo + ", tipo=" + tipo + ", id=" + id + "]";
	}
	
}
