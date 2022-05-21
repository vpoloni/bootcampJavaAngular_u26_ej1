package com.tienda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tienda.dto.Suministra;
import com.tienda.service.SuministraServiceImpl;

@RestController
@RequestMapping("/api")
public class SuministraController {
	
	@Autowired
	SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listarSuministra(){
		return suministraServiceImpl.listarSuministra();
	}
	
	
	@PostMapping("/suministra")
	public Suministra salvarSuministra(@RequestBody Suministra suministra) {
		
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	
	
	@GetMapping("/suministra/{id}")
	public Suministra SuministraXID(@PathVariable(name="id") int id) {
		
		Suministra Suministra_xid= new Suministra();
		
		Suministra_xid=suministraServiceImpl.suministraXID(id);
		
		//System.out.println("RegistroCurso XID: "+RegistroCurso_xid);
		
		return Suministra_xid;
	}
	
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id")int id,@RequestBody Suministra Suministra) {
		
		Suministra Suministra_seleccionado= new Suministra();
		Suministra Suministra_actualizado= new Suministra();
		
		Suministra_seleccionado= suministraServiceImpl.suministraXID(id);
		
		
		Suministra_seleccionado.setPieza(Suministra.getPieza());
		Suministra_seleccionado.setProveedor(Suministra.getProveedor());
		Suministra_seleccionado.setPrecio(Suministra.getPrecio());
		
		Suministra_actualizado = suministraServiceImpl.actualizarSuministra(Suministra_seleccionado);
		
		//System.out.println("El RegistroCurso actualizado es: "+ RegistroCurso_actualizado);
		
		return Suministra_actualizado;
	}
	
	@DeleteMapping("/suministra/{id}")
	public void eleiminarSuministra(@PathVariable(name="id")int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
	
	
}
