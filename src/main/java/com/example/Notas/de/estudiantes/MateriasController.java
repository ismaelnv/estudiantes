package com.example.Notas.de.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MateriasController {

    @Autowired
    private ServiceMaterias serviceMaterias;

    @PostMapping("/cursos")
    public String agregarMaterias(@RequestBody Materia materia){
        return serviceMaterias.crearMaterias(materia);
    }

    @GetMapping("/cursos")
    public List<Materia> obtenerMaterias(){
        return serviceMaterias.getMaterias();
    }

    @GetMapping("/cursos/{id}")
    public Materia obtenerPorId(@PathVariable("id") Integer id){
        return serviceMaterias.BuscarPorId(id);
    }

    @PutMapping("/cursos/{id}")
    public String actualizarMaterias(@PathVariable("id") Integer id ,@RequestBody Materia materia){
        return serviceMaterias.setMaterias(id, materia);
    }

    @DeleteMapping("/cursos/{id}")
    public String eliminarMAterias(@PathVariable("id") Integer id){
        return serviceMaterias.eliminarMaterias(id);
    }

    
}
