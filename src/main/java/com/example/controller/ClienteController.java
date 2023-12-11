package com.example.controller;

import com.example.domain.Cliente;
import com.example.service.ClienteService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
@Controller
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    @GetMapping("/nuevo")
    public  String nuevoCliente(Model model) {
        var clientes = clienteService.getClientes();
        model.addAttribute("clientes", clientes);
        return "clientes/nuevo";
    }
    @PostMapping("/agregar")
    public String addCliente(@ModelAttribute("cliente") Cliente cliente) {
        String fechaDeNacimientoString = cliente.getFechaDeNacimiento().toString();
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); // Adjust the date format as needed
            Date fechaDeNacimiento = dateFormat.parse(fechaDeNacimientoString);
            cliente.setFechaDeNacimiento(fechaDeNacimiento);
        } catch (ParseException e) {
            // Handle the parsing exception, e.g., log it or show an error message
            e.printStackTrace();
        }
        clienteService.add(cliente);
        return "redirect:/clientes/nuevo";
    }

    @PutMapping("/modificar/{id}")
 public String modifyCliente(@ModelAttribute("cliente") Cliente cliente) {
        clienteService.add(cliente);
        return "redirect:/clientes/nuevo";
    }

@RequestMapping(value = "/eliminar/{id}", method = {RequestMethod.DELETE, RequestMethod.POST})
public String delete(@PathVariable Integer id) {
    clienteService.delete(id);
    return "redirect:/clientes/nuevo";
}
}
