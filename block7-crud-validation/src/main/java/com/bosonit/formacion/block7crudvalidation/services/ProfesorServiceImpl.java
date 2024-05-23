package com.bosonit.formacion.block7crudvalidation.services;


import com.bosonit.formacion.block7crudvalidation.clase.Persona;
import com.bosonit.formacion.block7crudvalidation.clase.ProfesorEntity;
import com.bosonit.formacion.block7crudvalidation.dtos.ProfesorInputDTO;
import com.bosonit.formacion.block7crudvalidation.dtos.ProfesorOutputDTO;
import com.bosonit.formacion.block7crudvalidation.exceptions.EntidadNoEncontrada;
import com.bosonit.formacion.block7crudvalidation.repositories.PersonaRepository;
import com.bosonit.formacion.block7crudvalidation.repositories.ProfesorRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProfesorServiceImpl implements  ProfesorService{
    @Autowired
    ProfesorRepository profesorRepository;
    @Autowired
    PersonaRepository personaRepository;
    @Autowired
    private EntidadNoEncontrada entidadNoEncontrada;


    public ProfesorOutputDTO addProfesor(ProfesorInputDTO profesorInputDTO ) {
        Persona persona= personaRepository.findById(ProfesorInputDTO.getId_persona).orElseThrow(() -> new EntityNotFoundException("No se encontro el profesor  con nombre: " + ProfesorInputDTO.getID_persona));

        ProfesorEntity profesor = new ProfesorEntity(profesorInputDTO);
        profesor.setPersona(persona);
        return profesorRepository.save(profesor).profesortoProfesorOutputDto();
    }

    @Override
    public ProfesorOutputDTO getProfesor(long id) {

        return profesorRepository.findById((id).get().profesortoProfesorOutputDto()).orElseThrow(() -> new EntityNotFoundException("No se encontro el profesor con nombre: " + id));
    }

    @Override
    public List<ProfesorOutputDTO> getAllProfesores() {

        return profesorRepository.findAll().stream().map(ProfesorEntity::profesortoProfesorOutputDto).toList();
    }

    @Override
    public ProfesorOutputDTO updateProfesor(long id, ProfesorInputDTO profesorInputDto) {
        ProfesorEntity profesor = ProfesorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No se encontro el profesor con nombre: " + id));
        if (profesor != null) {

            profesor.setComents(profesorInputDto.getComents());
            profesor.setBranch(profesorInputDto.getBranch());
            profesor.setStudents(profesorInputDto.getEstudiantes());
            return profesorRepository.save(profesor).profesortoProfesorOutputDto();
        } else {
            return null;
        }
    }

    @Override
    public void deleteProfesor(long id) {
        ProfesorEntity profesor = ProfesorRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("No se encontro el profesor con ID: " + id));
        personaRepository.deleteById(id);
        System.out.println("Se ha borrado el profesor con ID: " + id + " correctamente");
    }
}


