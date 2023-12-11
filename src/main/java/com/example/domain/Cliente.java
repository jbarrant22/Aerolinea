/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author vse10
 */
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;



    @Data
@Entity
@Table(name="clientes")
@NoArgsConstructor
public class Cliente {
            @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(name = "idClientes")
    private int idClientes;
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String nacionalidad;
       @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaDeNacimiento;
    private String pasaporte;
    private String contraseña;

    

    public Cliente(String nombre, String apellidos, String correo, String telefono, String nacionalidad, Date fechaDeNacimiento, String pasaporte, String contraseña) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.nacionalidad = nacionalidad;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.pasaporte = pasaporte;
        this.contraseña = contraseña;
    }
    

    
    
}
