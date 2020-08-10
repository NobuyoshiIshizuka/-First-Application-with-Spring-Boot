package com.nobuwebdeveloper.casadocodigo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nobuwebdeveloper.casadocodigo.dominio.Propriedade;

@RestController
@RequestMapping
public class PropriedadeController {

	@Autowired
	private PropriedadeController repository;
	
	@RequestMapping(value="/find{filtro}",method = RequestMethod.GET)
	List<Propriedade> findByFiltro
		(@PathVariable("filtro") String filtro) {
		return repository.findByFiltro(filtro);
	}
}
