package com.estudo.projetospring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.projetospring.models.Cliente;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {

        return new Cliente(29, "Pedro", "111-222-333-44");

    }
}
