package com.example.controller;

import com.example.domain.Pais;
import com.example.service.PaisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/paises")
public class PaisController {

    private final PaisService paisService;

    public PaisController(PaisService paisService) {
        this.paisService = paisService;
    }


    @GetMapping("/nuevo")
    public  String nuevoPais(Model model) {
        var paises = paisService.getPaises();
        model.addAttribute("paises", paises);
        return "paises/nuevo";
    }
    @PostMapping("/agregar")
    public String addPais(@ModelAttribute("pais") Pais pais) {
        paisService.add(pais);
        return "redirect:/paises/nuevo";
    }

    @PutMapping("/modificar/{id}")
 public String modifyPais(@ModelAttribute("pais") Pais pais) {
        paisService.add(pais);
        return "redirect:/paises/nuevo";
    }

@RequestMapping(value = "/eliminar/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
public String delete(@PathVariable Integer id) {
    paisService.delete(id);
    return "redirect:/paises/nuevo";
}
}
