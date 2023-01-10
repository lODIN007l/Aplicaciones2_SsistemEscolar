package com.sistemaEscuela.aplicaciones2.repositorio;

import com.sistemaEscuela.aplicaciones2.modelo.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository  extends CrudRepository<Estudiante,Long> {

}
