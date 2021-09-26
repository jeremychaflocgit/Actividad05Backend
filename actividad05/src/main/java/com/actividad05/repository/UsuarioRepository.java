package com.actividad05.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.actividad05.entidad.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
