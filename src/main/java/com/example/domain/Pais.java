/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author vse10
 */
@Data
@Entity
@Table(name="paises")
@NoArgsConstructor

public class Pais {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "idPaises")
    private int idPaises;
    private String descripcion;
    private boolean activo;

    // Constructors, getters, and setters

    public Pais(String descripcion, boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
}
