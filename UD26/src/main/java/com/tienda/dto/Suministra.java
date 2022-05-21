package com.tienda.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="suministra")//en caso que la tabala sea diferente
public class Suministra {

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "id_proveedor")
    Proveedor proveedor;
 
    @ManyToOne
    @JoinColumn(name = "codigo_pieza")
    Pieza pieza;
	
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	//Constructores
	
	public Suministra() {
	
	}

	public Suministra(int id, Proveedor proveedor, Pieza pieza, int precio) {
		this.id = id;
		this.proveedor = proveedor;
		this.pieza = pieza;
		this.precio = precio;
	}



	//Getters y Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Pieza getPieza() {
		return pieza;
	}

	public void setPieza(Pieza pieza) {
		this.pieza = pieza;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", proveedor=" + proveedor + ", pieza=" + pieza + ", precio=" + precio + "]";
	}

	
	
	
	




		
	
	
	
}
