
package com.example.service;

import com.example.domain.Boleto;
import java.util.List;

public interface BoletoService {
    
Boleto add(Boleto boleto);
List<Boleto> getBoletos();
Boleto update(Boleto boleto);
void delete(Long id);

}
    

