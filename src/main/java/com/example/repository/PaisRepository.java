/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.repository;

import com.example.domain.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author vse10
 */
public interface PaisRepository extends JpaRepository<Pais,Integer>{
    
}