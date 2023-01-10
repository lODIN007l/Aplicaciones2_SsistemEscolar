package com.sistemaEscuela.aplicaciones2.repositorio;

import com.sistemaEscuela.aplicaciones2.modelo.Periodo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodoRepository extends CrudRepository<Periodo,Long> {
}
