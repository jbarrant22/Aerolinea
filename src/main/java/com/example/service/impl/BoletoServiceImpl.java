/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.domain.Boleto;
import com.example.repository.BoletoRepository;
import com.example.service.BoletoService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author vse10
 */
@Service
@AllArgsConstructor
public class BoletoServiceImpl implements BoletoService{
    
    private BoletoRepository boletoRepository;
    
    
    @Override
    public Boleto add(Boleto boleto) {
    return boletoRepository.save(boleto);
        }

    @Override
    public List<Boleto> getBoletos() {
    return boletoRepository.findAll();
    }

    @Override
    public Boleto update(Boleto boleto) {
    return boletoRepository.save(boleto);
     }

    @Override
    public void delete(Long id) {
    boletoRepository.deleteById(id);
    }
    
}
