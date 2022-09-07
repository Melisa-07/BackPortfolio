package com.apbackend.apbackend.repository;

import com.apbackend.apbackend.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonaRepo extends JpaRepository<Persona, Long> {
}
