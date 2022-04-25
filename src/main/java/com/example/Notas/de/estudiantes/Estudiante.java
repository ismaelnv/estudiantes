package com.example.Notas.de.estudiantes;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Estudiante {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("note")
    private Double note;

    public Estudiante(Integer id, String name, Double note){

        this.id = id;
        this.name = name;
        this.note = note;

    }

    public Integer getId(){

        return id;
    }

    public String getName(){
        
        return name;
    }

    public Double getNote(){

        return note;
    }

    public void setId(Integer id){

        this.id = id;

    }

    public void setName(String name){

        this.name = name;
    }

    public void setNote(Double note){

        this.note = note;

    }
    
}
