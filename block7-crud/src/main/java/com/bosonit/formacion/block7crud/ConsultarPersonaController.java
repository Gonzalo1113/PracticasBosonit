package com.bosonit.formacion.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class ConsultarPersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/{nombre}")
    public Persona obtenerPersonaPorNombre(@PathVariable String nombre) {
        Persona persona = personaService.obtenerPersonaPorNombre(nombre);
        return persona;
    }

    @GetMapping
    public List<Persona> obtenerTodasLasPersonas() {
        List<Persona> personas = personaService.obtenerTodasLasPersonas();
        return personas;
    }
}
