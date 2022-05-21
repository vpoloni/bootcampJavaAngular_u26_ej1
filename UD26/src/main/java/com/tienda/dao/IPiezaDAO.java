package com.tienda.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tienda.dto.Pieza;

/**
 * @author Jose
 *
 */
public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{
	
}
