
package com.example.service;

import com.example.domain.Cliente;
import java.util.List;

public interface ClienteService {
    
Cliente add(Cliente cliente);
List<Cliente> getClientes();
Cliente update(Cliente cliente);
void delete(Integer id);

}
    

