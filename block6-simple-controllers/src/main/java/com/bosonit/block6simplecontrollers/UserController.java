package com.bosonit.block6simplecontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bosonit.block6simplecontrollers.services.*;

@RestController
public class UserController {

    @Autowired
    SimpleControllerService simpleControllerService;

    @GetMapping("/user/{nombre}")
    public String saludar(@PathVariable String nombre) {
        return simpleControllerService.saludar(nombre);
    }

    @PostMapping("/useradd")
    public Persona agregarUsuario(@RequestBody Persona persona) {
          persona.setEdad(persona.getEdad() + 1);
        return persona;
    }
}