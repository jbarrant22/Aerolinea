
package com.example.service;

import com.example.domain.Pais;
import java.util.List;

public interface PaisService {
    
Pais add(Pais pais);
List<Pais> getPaises();
Pais update(Pais pais);
void delete(Integer id);

}
    

