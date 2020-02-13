package com.exact.plazos.services;

import java.io.IOException;


import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.plazos.dao.IPlazoDao;
import com.exact.plazos.entity.Plazo;
import com.exact.plazos.service.interfaces.IPlazoService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Service
public class PlazoService implements IPlazoService{

	@Autowired
	IPlazoDao plazodao;
	
	@Override
	public Iterable<Plazo> listarAll() {
		
		return plazodao.findAll();
	}
	

	@Override
	public Plazo listarById(Long id) {
		return plazodao.findById(id).orElse(null);
	}


	@Override
	public Plazo guardar(Plazo plazo) {
		return plazodao.save(plazo);
		
	}

}
