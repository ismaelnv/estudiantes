package com.example.Notas.de.estudiantes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServiceMaterias {

    private List<Materia> categorias = new ArrayList<>();

    public  String crearMaterias(Materia materia){
        categorias.add(materia);
        return "Added successfully";
    }
    
    public List<Materia> getMaterias(){
        return categorias;
    }

    public Materia BuscarPorId(Integer id){
        for (Materia categoria : categorias) {
          if(categoria.getId() == id){
            return categoria;
          }    
        }
        return null;
    }

    public String setMaterias(Integer id, Materia materia){
        for (int i = 0; i < categorias.size(); i++) {
            if( categorias.get(i).getId() == id ){
                categorias.set(i, materia);
            }
        }
        return "Was updated correctly";
    }

    public String eliminarMaterias(Integer id){
        for (int i = 0; i < categorias.size(); i++) {
            if(categorias.get(i).getId() == id){  
                categorias.remove(i);
            }
        }
        return "Is deleted correctly";
    }
}
