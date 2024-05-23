package com.bosonit.formacion.block7crudvalidation.repositories;

import com.bosonit.formacion.block7crudvalidation.clase.AsignaturasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface  AsignaturasRepository extends JpaRepository<AsignaturasEntity, Long> {

    List<AsignaturasEntity> findAllById(List<String> idAsignatura);
}
