package com.exact.plazos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.plazos.entity.Plazo;

@Repository
public interface IPlazoDao extends CrudRepository<Plazo, Long> {
	
}
