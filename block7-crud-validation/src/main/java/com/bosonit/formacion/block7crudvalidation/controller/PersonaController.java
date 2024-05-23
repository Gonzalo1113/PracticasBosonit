package com.bosonit.formacion.block7crudvalidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/{id}")
    public PersonaOutputDTO buscarPersonaPorId(@PathVariable Long id) {
        return personaService.buscarPersonaID(id);
    }

    @GetMapping("/buscar")
    public PersonaOutputDTO buscarPersonaPorUsuario(@RequestParam String usuario) {
        return personaService.buscarPersonaPorUsuario(usuario);
    }

    @GetMapping
    public List<PersonaOutputDTO> mostrarTodos() {
        return personaService.mostrarTodos();
    }

    @PostMapping
    public PersonaOutputDTO agregarPersona(@RequestBody PersonaInputDTO personaInputDTO) {
        return personaService.agregarPersona(personaInputDTO);
    }

    @DeleteMapping("/{id}")
    public void borrarPersona(@PathVariable Long id) {
        personaService.borrarPersona(id);
    }
}