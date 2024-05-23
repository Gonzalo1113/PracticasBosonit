package com.bosonit.formacion.block7crudvalidation.dtos;

import com.bosonit.formacion.block7crudvalidation.clase.StudentEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AsignaturaOutputDTO {
    private long idAsignatura;
    private String asignatura;
    private String coments;
    private Date initialDate;
    private Date finishDate;
    private List<StudentEntity> estudiantes;

    public List<StudentEntity> getEstudiantes() {
        return estudiantes;
    }
}