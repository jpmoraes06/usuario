package com.usuario.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.entities.Usuario;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {

}
