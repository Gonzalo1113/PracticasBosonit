package com.bosonit.formacion.block7crudvalidation;

import java.util.List;

public interface PersonaService {

    PersonaOutputDTO buscarPersonaID(Long id);

    PersonaOutputDTO buscarPersonaPorUsuario(String usuario);

    List<PersonaOutputDTO> mostrarTodos ();

    PersonaOutputDTO agregarPersona (PersonaInputDTO persona);

    void borrarPersona(Long id);

}
