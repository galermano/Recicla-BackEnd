package com.recicla.contAcesso.model.bean;

public class Acesso {
<<<<<<< HEAD
=======
	
	private Integer id;
	private Integer id_usuario;
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8
	private Integer id_modulo;
	private String tipo;
	
	
	public Acesso(Integer id, Integer id_usuario, Integer id_modulo, String tipo) {
		this.id = id;
		this.id_usuario = id_usuario;
		this.id_modulo = id_modulo;
		this.tipo = tipo;
	}
	

	public Acesso(Integer id_usuario,Integer id_modulo, String tipo) {
		this.id_usuario = id_usuario;
		this.id_modulo = id_modulo;
		this.tipo = tipo;
	}


	public Acesso(Integer id) {
		this.id = id;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
<<<<<<< HEAD

=======
	
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}
	
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8
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
<<<<<<< HEAD
	public Acesso( Integer id_modulo, String tipo, Integer id) {
		super();
		this.id_modulo = id_modulo;
		this.tipo = tipo;
		this.id = id;
	}
	
	public Acesso(Integer id_modulo, Integer id, String tipo) {
		super();
		this.id_modulo = id_modulo;
		this.id = id;
		this.tipo = tipo;
	}
	public Acesso(int int1, int int2, int int3, String string) {
		// TODO Auto-generated constructor stub
	}
=======
	
	
>>>>>>> 61af8e64aba1630d9affb9009e67a2f195efdaa8
	@Override
	public String toString() {
		return "Acesso [id_modulo=" + id_modulo + ", tipo=" + tipo + ", id=" + id + "]";
	}
	
}
