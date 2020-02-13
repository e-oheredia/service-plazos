package com.exact.plazos.service.interfaces;

import com.exact.plazos.entity.Plazo;

public interface IPlazoService {
	
	public Iterable<Plazo> listarAll();
	public Plazo listarById(Long id);
	public Plazo guardar(Plazo plazo);
	
}
