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

import com.tienda.dto.Proveedor;
import com.tienda.service.ProveedorServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedorController {
	
	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedor> listarPiezas(){
		return proveedorServiceImpl.listarProveedores();
	}
	
	
	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor pieza) {
		
		return proveedorServiceImpl.guardarProveedor(pieza);
	}
	
	
	@GetMapping("/proveedores/{id}")
	public Proveedor ProveedorXID(@PathVariable(name="id") int id) {
		
		Proveedor Proveedor_xid= new Proveedor();
		
		Proveedor_xid=proveedorServiceImpl.proveedorXID(id);
		
		//System.out.println("Estudiante XID: "+Estudiante_xid);
		
		return Proveedor_xid;
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name="id")int id,@RequestBody Proveedor Proveedor) {
		
		Proveedor Proveedor_seleccionado= new Proveedor();
		Proveedor Proveedor_actualizado= new Proveedor();
		
		Proveedor_seleccionado= proveedorServiceImpl.proveedorXID(id);
		
		Proveedor_seleccionado.setNombre(Proveedor.getNombre());

		
		Proveedor_actualizado = proveedorServiceImpl.actualizarProveedor(Proveedor_seleccionado);
		
		//System.out.println("El Estudiante actualizado es: "+ Estudiante_actualizado);
		
		return Proveedor_actualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eleiminarProveedor(@PathVariable(name="id")int id) {
		proveedorServiceImpl.eliminarProveedor(id);
	}
	
	
}
