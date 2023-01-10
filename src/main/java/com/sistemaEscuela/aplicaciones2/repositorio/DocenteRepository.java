package com.sistemaEscuela.aplicaciones2.repositorio;

import com.sistemaEscuela.aplicaciones2.modelo.Docente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends CrudRepository<Docente,Long> {

}
