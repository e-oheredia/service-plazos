package com.exact.plazos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exact.plazos.entity.Plazo;
import com.exact.plazos.service.interfaces.IPlazoService;

@RestController
@RequestMapping("/plazos")
public class PlazoController {

	@Autowired
	IPlazoService plazoservice;
	
	@GetMapping
	public ResponseEntity<Iterable<Plazo>> listarAll() {
		return new ResponseEntity<Iterable<Plazo>>(plazoservice.listarAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Plazo> listarById(@PathVariable Long id){
		Plazo plazo = plazoservice.listarById(id);
		return new ResponseEntity<Plazo>(plazo, plazo == null ? HttpStatus.NOT_FOUND: HttpStatus.OK);
	}
}
