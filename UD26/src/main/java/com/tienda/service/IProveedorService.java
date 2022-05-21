package com.tienda.service;

import java.util.List;

import com.tienda.dto.Proveedor;

public interface IProveedorService {

	//Metodos del CRUD
		public List<Proveedor> listarProveedores(); //Listar All 
		
		public Proveedor guardarProveedor(Proveedor proveedor);	//Guarda un Estudiante CREATE
		
		public Proveedor proveedorXID(int id); //Leer datos de un Estudiante READ
		
		public Proveedor actualizarProveedor(Proveedor proveedor); //Actualiza datos del estudiante UPDATE
		
		public void eliminarProveedor(int id);// Elimina el estudiante DELETE
	
}


