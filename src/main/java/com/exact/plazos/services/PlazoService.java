package com.exact.plazos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.plazos.dao.IPlazoDao;
import com.exact.plazos.entity.Plazo;
import com.exact.plazos.service.interfaces.IPlazoService;

@Service
public class PlazoService implements IPlazoService{

	@Autowired
	IPlazoDao plazodao;
	
	@Override
	public Iterable<Plazo> listarAll() {
		
		return plazodao.findAll();
	}
	
	

}
