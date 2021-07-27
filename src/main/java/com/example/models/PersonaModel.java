package com.example.models;

import javax.persistence.*;

@Entity
@Table(name = "persona")
public class PersonaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String paternal;

    @Column(length = 50)
    private String maternal;


    private Double age;
    private Double weight;
    private Double height;
    private String marital_status;

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setPaternal(String paternal){
        this.paternal = paternal;
    }

    public String getPaternal(){
        return this.paternal;
    }
    
    public void setMaternal(String maternal){
        this.maternal = maternal;
    }

    public String getMaternal(){
        return this.maternal;
    }

    public void setAge(Double age){
        this.age = age;
    }

    public Double getAge(){
        return this.age;
    }

    public void setWeight(Double weight){
        this.weight = weight;
    }

    public Double getWeight(){
        return this.weight;
    }

    public void setHeight(Double height){
        this.height = height;
    }

    public Double getHeight(){
        return this.height;
    }

    public void setMarital_status(String marital_status){
        this.marital_status= marital_status;
    }

    public String getMarital_status(){
        return this.marital_status;
    }

}
