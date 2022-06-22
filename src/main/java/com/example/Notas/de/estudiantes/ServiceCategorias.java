package com.example.Notas.de.estudiantes;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServiceCategorias {

    private List<Categoria> categorias = new ArrayList<>();

    public  String crearCategorias(Categoria categoria){
        categorias.add(categoria);
        return "Added successfully";
    }
    
    public List<Categoria> getCategorias(){
        return categorias;
    }

    public Categoria BuscarPorId(Integer id){
        for (Categoria categoria : categorias) {
          if(categoria.getId() == id){
            return categoria;
          }    
        }
        return null;
    }

    public String setCategorias(Integer id, Categoria categoria){
        for (int i = 0; i < categorias.size(); i++) {
            if( categorias.get(i).getId() == id ){
                categorias.set(i, categoria);
            }
        }
        return "Was updated correctly";
    }

    public String eliminarCategorias(Integer id){
        for (int i = 0; i < categorias.size(); i++) {
            if(categorias.get(i).getId() == id){  
                categorias.remove(i);
            }
        }
        return "Is deleted correctly";
    }
}
