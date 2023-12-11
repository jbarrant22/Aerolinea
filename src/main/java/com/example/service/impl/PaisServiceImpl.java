/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.domain.Pais;
import com.example.repository.PaisRepository;
import com.example.service.PaisService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author vse10
 */
@Service
@AllArgsConstructor
public class PaisServiceImpl implements PaisService{
    
    private PaisRepository paisRepository;
    
    
    @Override
    public Pais add(Pais pais) {
    return paisRepository.save(pais);
        }


    @Override
    public Pais update(Pais pais) {
    return paisRepository.save(pais);
     }


    @Override
    public List<Pais> getPaises() {
    return paisRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
    paisRepository.deleteById(id);
    }


}
