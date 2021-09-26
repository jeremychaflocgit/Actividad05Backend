package com.actividad05.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.actividad05.entidad.Disponibilidad;
import com.actividad05.repository.DisponibilidadRepository;

@Service
public class DisponibilidadServiceImpl implements DisponibilidadService {
	
	@Autowired
	private DisponibilidadRepository repositorio;
	
	@Override
	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj) {
		return repositorio.save(obj);
	}
	
	@Override
	public List<Disponibilidad> listaDisponibilidad(){
		return repositorio.findAll();
	}
}
