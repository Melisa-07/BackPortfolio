package com.apbackend.apbackend.repository;

import com.apbackend.apbackend.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
