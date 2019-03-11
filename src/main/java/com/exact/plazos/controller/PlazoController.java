package com.exact.plazos.controller;

import java.io.IOException;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.plazos.entity.Plazo;
import com.exact.plazos.service.interfaces.IPlazoService;
import com.fasterxml.jackson.databind.ObjectMapper;

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
	
	@PostMapping
	public ResponseEntity<Plazo> guardar(@RequestBody String plazo)  {
		ObjectMapper mapper = new ObjectMapper();
		Plazo plazoBD=null;
		try {
			plazoBD = mapper.readValue(plazo, Plazo.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		plazoBD.setActivo(true);
		return new ResponseEntity<Plazo>(plazoservice.guardar(plazoBD), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Plazo> modificar(@PathVariable Long id,@RequestBody String plazo) {
		ObjectMapper mapper = new ObjectMapper();
		Plazo plazoBD=null;
		try {
			plazoBD = mapper.readValue(plazo, Plazo.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		plazoBD.setId(id);
		return new ResponseEntity<Plazo>(plazoservice.guardar(plazoBD), HttpStatus.OK);
	}
}
