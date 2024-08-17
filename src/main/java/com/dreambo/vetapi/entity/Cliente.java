package com.dreambo.vetapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente {
    @Id
    Integer id_cliente;
    String name_cliente;
    String lastname_cliente;

    public Integer getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Integer id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getName_cliente() {
        return name_cliente;
    }

    public void setName_cliente(String name_cliente) {
        this.name_cliente = name_cliente;
    }

    public String getLastname_cliente() {
        return lastname_cliente;
    }

    public void setLastname_cliente(String lastname_cliente) {
        this.lastname_cliente = lastname_cliente;
    }
}
