package com.example.Notas.de.estudiantes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Materia {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("gradeSection")
    private String gradeSection;

    public Materia(Integer id,String name,String gradeSection){
        this.id = id;
        this.name = name;
        this.gradeSection = gradeSection;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getGradeSection(){
        return this.gradeSection;
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
