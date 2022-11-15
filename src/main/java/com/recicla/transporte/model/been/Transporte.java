package com.recicla.transporte.model.been;

public class Transporte {

	private int id;
	private String recipiente;
	
	
	public Transporte(int id, String recipiente) {
		super();
		this.id = id;
		this.recipiente = recipiente;
	}

	public Transporte(String recipiente) {
		super();
		this.recipiente = recipiente;
	}
	
	public Transporte(int id) {
		super();
		this.id = id;
	}

	public Transporte() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRecipiente() {
		return recipiente;
	}

	public void setRecipiente(String recipiente) {
		this.recipiente = recipiente;
	}
	
}