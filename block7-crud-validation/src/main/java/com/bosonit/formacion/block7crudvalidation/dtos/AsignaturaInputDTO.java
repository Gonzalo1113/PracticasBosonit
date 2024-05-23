package com.bosonit.formacion.block7crudvalidation.dtos;

import com.bosonit.formacion.block7crudvalidation.clase.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data

public class AsignaturaInputDTO {
    private long idAsignatura;
    private String asignatura;
    private String coments;
    private Date initialDate;
    private Date finishDate;

    @Getter
    private List<EstudianteInputDTO> estudiantes;

}