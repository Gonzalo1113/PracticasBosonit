package com.bosonit.formacion.block7crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public Persona agregarPersona(Persona persona) {
            if (persona.getNombre() != null && !persona.getNombre().isEmpty()) {
                Persona personaAgregada = personaRepository.save(persona);
                return personaAgregada;
            }
            throw new CagadaException("El nombre de la persona no puede ser nulo o vacío");
        }




        public Persona modificarPersona(String nombre, Persona persona) {
        // Condiciones... chequear. Si hay error, lanza CagadaException
        if (nombre == null) {
            throw new CagadaException("El nombre no puede ser nulo");
        }
        if (persona == null) {
            throw new CagadaException("La persona a modificar no puede ser nula");
        }
        if (!nombre.equals(persona.getNombre())) {
            throw new CagadaException("El nombre proporcionado no coincide con el nombre de la persona");
        }



        persona.setPoblacion(persona.getPoblacion());
        persona.setNombre(persona.getNombre());
        persona.setEdad(persona.getEdad());

        // Guardar la persona modificada
        Persona personaModificada = personaRepository.save(persona);
        return personaModificada;
    }

    public void borrarPersona(String nombre) {
        Persona personaABorrar = personaRepository.findByNombre(nombre);
        if (personaABorrar.getNombre() != nombre ) {
            throw new NotFoundException("No se encuentra la persona con ese nombre");
        }
        personaRepository.delete(personaABorrar);
    }

    public Persona obtenerPersonaPorNombre(String nombre) {
        // Buscar la persona por su nombre
        Persona personaEncontrada = personaRepository.findByNombre(nombre);
        if (personaEncontrada == null) {
            throw new NotFoundException("No se encuentra la persona con ese nombre");
        }
        return personaEncontrada;
    }

    public List<Persona> obtenerTodasLasPersonas() {
        return personaRepository.findAll();
    }

}

