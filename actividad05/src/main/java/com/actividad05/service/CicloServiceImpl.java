package com.actividad05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad05.entidad.Ciclo;
import com.actividad05.repository.CicloRepository;

@Service
public class CicloServiceImpl implements CicloService {
	
	@Autowired
	private CicloRepository repositorio;
	
	@Override
	public List<Ciclo> listaCiclo(){
		return repositorio.findAll();
	}
}
