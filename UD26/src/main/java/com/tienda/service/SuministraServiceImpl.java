package com.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.dao.ISuministraDAO;
import com.tienda.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService {
	
	@Autowired
	ISuministraDAO iSuministraDAO;

	@Override
	public List<Suministra> listarSuministra() {
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra pieza) {
		return iSuministraDAO.save(pieza);
	}

	@Override
	public Suministra suministraXID(int id) {
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra pieza) {
		return iSuministraDAO.save(pieza);
	}

	@Override
	public void eliminarSuministra(int id) {
		iSuministraDAO.deleteById(id);
	}

}
