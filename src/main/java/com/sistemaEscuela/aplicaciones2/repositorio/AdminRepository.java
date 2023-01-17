package com.sistemaEscuela.aplicaciones2.repositorio;

import com.sistemaEscuela.aplicaciones2.modelo.Admin;
import com.sistemaEscuela.aplicaciones2.modelo.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends CrudRepository<Admin,Long>  {
    Optional<Admin> findByCedula(String cedula);
}
