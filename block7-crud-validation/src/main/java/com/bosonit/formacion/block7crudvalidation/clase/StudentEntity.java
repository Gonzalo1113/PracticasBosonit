package com.bosonit.formacion.block7crudvalidation;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id_student;

    @OneToOne
    @JoinColumn(name = "id_persona")
    private Persona persona;

    @Column(name = "num_hours_week", nullable = false)
    private int numHoursWeek;

    @Column(name = "coments")
    private String coments;

    @ManyToOne
    @JoinColumn(name = "id_profesor")
    private Profesor profesor;

    @Column(name = "branch", nullable = false)
    private String branch;

    @OneToMany(mappedBy = "student")
    private List<Asignatura> asignaturas;
