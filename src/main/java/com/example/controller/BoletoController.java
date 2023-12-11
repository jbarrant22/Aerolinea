package com.example.controller;

import com.example.domain.Boleto;
import com.example.service.BoletoService;
import com.example.service.PaisService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/boletos")
public class BoletoController {

    private final BoletoService boletoService;
    private final PaisService paisService;  

    public BoletoController(BoletoService boletoService, PaisService paisService) {
        this.boletoService = boletoService;
        this.paisService = paisService;
    }



    @GetMapping("/nuevo")
    public  String nuevoBoleto(Model model) {
        var boletos = boletoService.getBoletos();
        var paises = paisService.getPaises();
        model.addAttribute("boletos", boletos);
        model.addAttribute("paises", paises);
        return "boletos/nuevo";
    }
    @PostMapping("/agregar")
    public String addBoleto(@ModelAttribute("boleto") Boleto boleto) {
        boletoService.add(boleto);
        return "redirect:/boletos/nuevo";
    }

    @PutMapping("/modificar/{id}")
    public String modifyBoleto(@ModelAttribute("boleto") Boleto boleto) {
        boletoService.update(boleto);
        return "redirect:/boletos/nuevo";
    }

@RequestMapping(value = "/eliminar/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
public String delete(@PathVariable Long id) {
        boletoService.delete(id);
                return "redirect:/boletos/nuevo";

    }
}
