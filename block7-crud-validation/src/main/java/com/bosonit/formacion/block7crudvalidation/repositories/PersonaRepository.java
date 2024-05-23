package com.bosonit.formacion.block7crudvalidation;

import com.bosonit.formacion.block7crudvalidation.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  PersonaRepository extends JpaRepository<Persona, Long> {

    Optional<Persona> findByName(String name);
}
