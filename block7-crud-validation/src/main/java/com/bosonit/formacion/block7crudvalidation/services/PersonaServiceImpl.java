package com.bosonit.formacion.block7crudvalidation;
import com.bosonit.formacion.block7crudvalidation.Model.Persona;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


        public PersonaOutputDTO buscarPersonaID (Long id){
            return personaRepository.findById(id)
                    .orElseThrow(() -> new EntityNotFoundException("Persona not found with id: " + id))
                    .personatoPersonaOutputDto();
        }

        public PersonaOutputDTO buscarPersonaPorUsuario (String name){
            return personaRepository.findByName(name)
                    .orElseThrow(() -> new EntityNotFoundException("Persona not found with username: " + name))
                    .personatoPersonaOutputDto();
        }

        public List<PersonaOutputDTO> mostrarTodos() {
            List<Persona> personas = personaRepository.findAll();
            List<PersonaOutputDTO> personasOutput = new ArrayList<>();
            for (Persona persona : personas) {
                personasOutput.add(persona.personatoPersonaOutputDto());
            }
            return personasOutput;
        }


        public PersonaOutputDTO agregarPersona(PersonaInputDTO personaInputDTO) {
                Persona persona = new Persona(personaInputDTO);
                Persona personaAgregada = personaRepository.save(persona);
                return personaAgregada.personatoPersonaOutputDto();
            }


            public void borrarPersona(Long id) {
                personaRepository.deleteById(id);
            }
    }

