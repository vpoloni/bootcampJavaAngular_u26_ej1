package com.tienda.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.tienda.dto.Suministra;


@Entity
@Table(name="proveedores")//en caso que la tabala sea diferente
public class Proveedor {

	//Atributos de entidad estudiante
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	
	@OneToMany
    @JoinColumn(name="id")
    private List<Suministra> suministra;
	
	//Constructores
	
	public Proveedor() {
	
	}

	public Proveedor(int id, String nombre, List<Suministra> suministra) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.suministra = suministra;
	}

	//Getters y Setters

	public int getId() {
		return id;
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

	/**
	 * @return the registroCurso
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getRegistroCurso() {
		return suministra;
	}

	/**
	 * @param registroCurso the registroCurso to set
	 */
	public void setRegistroCurso(List<Suministra> suministra) {
		this.suministra = suministra;
	}



	//Metodo toString


	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", nombre=" + nombre + ", suministra=" + suministra + "]";
	}


	
	
	
	
	
	

	
	
	
	
	
	
}
