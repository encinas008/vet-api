package com.dreambo.vetapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {
    @Id
    Integer id_pet;
    String name_pet;
    String color_pet;
    String raza_pet;

    public Integer getId_pet() {
        return id_pet;
    }

    public void setId_pet(Integer id_pet) {
        this.id_pet = id_pet;
    }

    public String getName_pet() {
        return name_pet;
    }

    public void setName_pet(String name_pet) {
        this.name_pet = name_pet;
    }

    public String getColor_pet() {
        return color_pet;
    }

    public void setColor_pet(String color_pet) {
        this.color_pet = color_pet;
    }

    public String getRaza_pet() {
        return raza_pet;
    }

    public void setRaza_pet(String raza_pet) {
        this.raza_pet = raza_pet;
    }
}
