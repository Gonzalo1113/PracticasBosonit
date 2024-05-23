package com.bosonit.formacion.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@RestController
@RequestMapping("/persona")
public class BorrarPersonaController {

    @Autowired
    private PersonaService personaService;

    @DeleteMapping("/{nombre}")
    public void borrarPersona(@PathVariable String nombre) {
        personaService.borrarPersona(nombre);
            System.out.println("Persona Borrada Perfectamente");
    }
}
