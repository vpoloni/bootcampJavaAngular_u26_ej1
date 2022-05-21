package com.tienda.service;

import java.util.List;

import com.tienda.dto.Pieza;

public interface IPiezaService {

	//Metodos del CRUD
		public List<Pieza> listarPiezas(); //Listar All 
		
		public Pieza guardarPieza(Pieza pieza);	//Guarda un Curso CREATE
		
		public Pieza piezaXID(int id); //Leer datos de un Curso READ
		
		public Pieza actualizarPieza(Pieza pieza); //Actualiza datos del Curso UPDATE
		
		public void eliminarPieza(int id);// Elimina el Curso DELETE
	

}


