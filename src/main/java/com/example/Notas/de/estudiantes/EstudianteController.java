package com.example.Notas.de.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
        serviceEstudiantes.createEstudiantes(estudiante);
        return "The student was added correctly";
    }
    
    @GetMapping("/estudiantes")
    public List<Estudiante> obtenerEstudiantes(){
      return serviceEstudiantes.getEstudiantes();
    }

    @PutMapping("/estudiantes/{id}")
    public String actualizarEstudiante( @PathVariable("id") Integer id ,@RequestBody Estudiante estudiante){
        serviceEstudiantes.setEstudiantes(id, estudiante);
        return"was updated correctly";
    }


}
