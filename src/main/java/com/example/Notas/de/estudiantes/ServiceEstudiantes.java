package com.example.Notas.de.estudiantes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ServiceEstudiantes {
   
   
   private List<Estudiante>estudiantes = new ArrayList<>();

   public String createEstudiantes(Estudiante estudiante){

      estudiantes.add(estudiante);
      return "Added successfully";

   }

   public  List<Estudiante> getEstudiantes(){

    return estudiantes;

   }

   public Estudiante searchForId(Integer id){

      for (Estudiante estudiante : estudiantes) {
         if(estudiante.getId() == id){

            return estudiante;

         }
         
      }
      return null;
   }

   public String setEstudiantes(Integer id, Estudiante estudiante){

      for (int i = 0; i < estudiantes.size(); i++) {

        if(id == estudiantes.get(i).getId()){
           System.out.println("Entro");

          estudiantes.set(i, estudiante);
         }
         
      }
      return "Was updated correctly";

   }

   public String eliminarEstudiante(Integer id ){

      for (int index = 0; index < estudiantes.size(); index++) {

         if(estudiantes.get(index).getId() == id){
            
            estudiantes.remove(index);
          
         }
         
      }
  
      return "Is deleted correctly";
      
   }



   
    
}
