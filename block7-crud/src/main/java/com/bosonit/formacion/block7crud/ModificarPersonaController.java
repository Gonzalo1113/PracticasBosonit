package com.bosonit.formacion.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class ModificarPersonaController {

    @Autowired
    private PersonaService personaService;

    @PutMapping("/{nombre}")
    public Persona modificarPersona(@PathVariable String nombre, @RequestBody Persona persona) {
        Persona personaModificada = personaService.modificarPersona(nombre, persona);
        return personaModificada;
    }
}
