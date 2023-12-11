/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service.impl;

import com.example.domain.Cliente;
import com.example.repository.ClienteRepository;
import com.example.service.ClienteService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author vse10
 */
@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService{
    
    private ClienteRepository clienteRepository;
    
    
    @Override
    public Cliente add(Cliente cliente) {
    return clienteRepository.save(cliente);
        }


    @Override
    public Cliente update(Cliente cliente) {
    return clienteRepository.save(cliente);
     }


    @Override
    public List<Cliente> getClientes() {
    return clienteRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
    clienteRepository.deleteById(id);
    }


}
