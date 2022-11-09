package com.recicla.contAcesso.model.bean;

public class Acesso {
	private Integer id_usuario;
	private Integer id_modulo;
	private String tipo;
	
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
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
	public Acesso(Integer id_usuario, Integer id_modulo, String tipo, Integer id) {
		super();
		this.id_usuario = id_usuario;
		this.id_modulo = id_modulo;
		this.tipo = tipo;
		this.id = id;
	}
	
	public Acesso(Integer id_usuario, Integer id_modulo, Integer id, String tipo) {
		super();
		this.id_usuario = id_usuario;
		this.id_modulo = id_modulo;
		this.id = id;
		this.tipo = tipo;
	}
	public Acesso(int int1, int int2, int int3, String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Acesso [id_usuario=" + id_usuario + ", id_modulo=" + id_modulo + ", tipo=" + tipo + ", id=" + id + "]";
	}
	
	
}
