package com.bosonit.formacion.block7crudvalidation.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AsignaturaInputDTO {


    private long id_estudiante;
    private String asignatura;
    private String coments;
    private Date initial_date;
    private Date finish_date;
}