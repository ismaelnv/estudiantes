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
public class EstudianteController {

    @Autowired
    private ServiceEstudiantes serviceEstudiantes;
    
    @PostMapping("/estudiantes")
    public String crearEstudiantes(@RequestBody Estudiante estudiante){
        return serviceEstudiantes.createEstudiantes(estudiante);
    }
    
    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes(){
      return serviceEstudiantes.getEstudiantes();
    }

    @GetMapping("/estudiantes/{id}")
    public Estudiante obtenerEstudiantePorId(@PathVariable("id") Integer id){
        return serviceEstudiantes.searchForId(id);
    }
    
    @PutMapping("/estudiantes/{id}")
    public String actualizarEstudiante( @PathVariable("id") Integer id ,@RequestBody Estudiante estudiante){
        return serviceEstudiantes.setEstudiantes(id, estudiante);  
    }
    
    @DeleteMapping("/estudiantes/{id}")
    public String eliminarEstudiantes(@PathVariable("id") Integer id){
       return serviceEstudiantes.eliminarEstudiante(id);
    }


}
