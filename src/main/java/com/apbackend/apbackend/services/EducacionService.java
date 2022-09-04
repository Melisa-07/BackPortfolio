package com.apbackend.apbackend.services;

import com.apbackend.apbackend.models.Educacion;
import com.apbackend.apbackend.repository.EducacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;

    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }

   public Educacion addEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
   }

   public List<Educacion> buscarEducacion(){
        return educacionRepo.findAll();
   }

    public Optional<Educacion> buscarEducacionPorId(Long id){
        return educacionRepo.findById(id);
    }

   public Educacion editarEducacion(Educacion educacion){
        return educacionRepo.save(educacion);
}

   public void borrarEducacion(Long id){
        educacionRepo.deleteById(id);
}

}
