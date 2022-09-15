package com.apbackend.apbackend.security.repository;

import com.apbackend.apbackend.security.entity.Rol;
import com.apbackend.apbackend.security.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}