package com.actividad05.service;

import java.util.List;

import com.actividad05.entidad.Usuario;

public interface UsuarioService {
	
	public abstract List<Usuario> listaUsuario();
	public abstract Usuario insertaActualizaUsuario(Usuario obj);
}
