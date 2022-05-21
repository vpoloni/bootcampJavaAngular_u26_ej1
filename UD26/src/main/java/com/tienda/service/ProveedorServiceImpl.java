package com.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dao.IProveedorDAO;
import com.tienda.dto.Proveedor;

@Service
public class ProveedorServiceImpl implements IProveedorService {
	
	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listarProveedores() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardarProveedor(Proveedor pieza) {
		return iProveedorDAO.save(pieza);
	}

	@Override
	public Proveedor proveedorXID(int id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor pieza) {
		return iProveedorDAO.save(pieza);
	}

	@Override
	public void eliminarProveedor(int id) {
		iProveedorDAO.deleteById(id);
	}

}
