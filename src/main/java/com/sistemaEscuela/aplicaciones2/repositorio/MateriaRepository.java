package com.sistemaEscuela.aplicaciones2.repositorio;

import com.sistemaEscuela.aplicaciones2.modelo.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends CrudRepository<Materia,Long> {


}
