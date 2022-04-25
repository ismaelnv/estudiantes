package com.example.Notas.de.estudiantes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Categoria {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("gradeSection")
    private String gradeSection;

    public Categoria(Integer id,String name,String gradeSection){

        this.id = id;
        this.name = name;
        this.gradeSection = gradeSection;

    }

    public Integer getId(){

        return id;
    }

    public String getName(){

        return name;
    }

    public String getGradeSection(){
        
        return gradeSection;

    }

    public void setId(Integer id){

        this.id = id;

    }

    public void setName(String name){

        this.name = name;

    }

    public void setGradeSection(String gradeSection ){

        this.gradeSection = gradeSection;
    }
  
}
