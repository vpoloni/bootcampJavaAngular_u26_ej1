package com.tienda.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.dto.Proveedor;

/**
 * @author Jose
 *
 */
public interface IProveedorDAO extends JpaRepository<Proveedor, Integer>{
	
}
