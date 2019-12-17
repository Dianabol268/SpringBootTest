package com.saul.model;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CUST_SEQ")    
	private int id;
	
	@Column(name = "nombre", length = 80)
	private String nombre;
	
	@Column(name = "descripcion", length = 500)
	private String descripcion;
	
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
