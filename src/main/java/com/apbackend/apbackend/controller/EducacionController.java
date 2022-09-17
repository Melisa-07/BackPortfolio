package com.apbackend.apbackend.controller;

import com.apbackend.apbackend.models.Educacion;
import com.apbackend.apbackend.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/educacion")
@CrossOrigin(origins = "https://portfolio-alfonsomelisa.web.app/")
public class EducacionController {

    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educacion=educacionService.buscarEducacion();
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Educacion> obtenerEducacion(@PathVariable("id") Long id){
        Optional<Educacion> educacion=educacionService.buscarEducacionPorId(id);
        return new ResponseEntity<>(educacion.get(), HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion=educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion=educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id")Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
