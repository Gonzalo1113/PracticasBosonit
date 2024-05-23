package com.bosonit.formacion.block7crudvalidation.clase;
import com.bosonit.formacion.block7crudvalidation.dtos.AsignaturaInputDTO;
import com.bosonit.formacion.block7crudvalidation.dtos.AsignaturaOutputDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "asignatura")
public class AsignaturasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_asignatura;

    @ManyToOne
    @JoinColumn(name = "id_student")
    private List<StudentEntity> estudiantesenAsignatura;

    @Column(name = "asignatura")
    private String asignatura;

    @Column(name = "coments")
    private String coments;

    @Column(name = "initial_date", nullable = false)
    private Date initialDate;

    @Column(name = "finish_date")
    private Date finishDate;


    public AsignaturasEntity (AsignaturaInputDTO asignaturaInputDto){
        this.id_asignatura = Long.valueOf(asignaturaInputDto.getIdAsignatura());
        this.asignatura= asignaturaInputDto.getAsignatura();
        this.coments = asignaturaInputDto.getComents();
        this.initialDate = asignaturaInputDto.getInitialDate();
        this.finishDate = asignaturaInputDto.getFinishDate();
    }
    public AsignaturaOutputDTO asignaturatoasignaturaOutputDto(){
        return new AsignaturaOutputDTO(
                this.id_asignatura,
                this.asignatura,
                this.coments,
                this.initialDate,
                this.finishDate,
                this.estudiantesenAsignatura
        );
    }
}