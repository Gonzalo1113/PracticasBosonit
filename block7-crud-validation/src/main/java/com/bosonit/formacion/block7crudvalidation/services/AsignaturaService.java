package com.bosonit.formacion.block7crudvalidation.services;

import com.bosonit.formacion.block7crudvalidation.dtos.AsignaturaInputDTO;
import com.bosonit.formacion.block7crudvalidation.dtos.AsignaturaOutputDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AsignaturaService {

    AsignaturaOutputDTO buscarAsignatura(Long id, String outputType);

    List<AsignaturaOutputDTO> listarAsignatura(String outputType);

    AsignaturaOutputDTO añadirAsignatura(AsignaturaInputDTO asignaturaInput) throws Exception;

    void borrarAsignarura(Long id);

    AsignaturaOutputDTO updateAsignatura(Long id, AsignaturaInputDTO asignaturaInput);
}