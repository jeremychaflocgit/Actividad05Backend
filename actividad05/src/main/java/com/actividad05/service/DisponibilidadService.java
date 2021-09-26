package com.actividad05.service;

import java.util.List;

import com.actividad05.entidad.Disponibilidad;

public interface DisponibilidadService {

	public Disponibilidad insertaActualizaDisponibilidad(Disponibilidad obj);
	public List<Disponibilidad> listaDisponibilidad();
}