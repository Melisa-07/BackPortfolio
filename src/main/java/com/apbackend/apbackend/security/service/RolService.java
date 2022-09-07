package com.apbackend.apbackend.security.service;


import com.apbackend.apbackend.security.entity.Rol;
import com.apbackend.apbackend.security.enums.RolNombre;
import com.apbackend.apbackend.security.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository rolRepository;
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);

    }
}
