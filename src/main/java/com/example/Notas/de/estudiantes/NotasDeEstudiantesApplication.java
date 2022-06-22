package com.example.Notas.de.estudiantes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
@SpringBootApplication
public class NotasDeEstudiantesApplication {

	@Autowired
	ServiceCategorias categorias;

	public static void main(String[] args) {
		SpringApplication.run(NotasDeEstudiantesApplication.class, args);
	}

	@PostMapping("/categorias")
	public String CrearCategorias(@RequestBody Categoria categoria){

		return categorias.crearCategorias(categoria);
	}

	@GetMapping("/categorias")
	public List<Categoria> getCategorias(){

		return categorias.getCategorias();
	}

	@GetMapping("/categorias/{id}")
	public Categoria buscarId(@PathVariable Integer id){

		return categorias.BuscarPorId(id);
	}

	@PutMapping("/categorias/{id}")
	public String setCategorias(@PathVariable("id") Integer id, @RequestBody Categoria categoria){

		return categorias.setCategorias(id,categoria);
	}
	@DeleteMapping ("/categorias/{id}")
	public String eliminarCategorias(@PathVariable("id") Integer id){

		return categorias.eliminarCategorias(id);
	}




}
