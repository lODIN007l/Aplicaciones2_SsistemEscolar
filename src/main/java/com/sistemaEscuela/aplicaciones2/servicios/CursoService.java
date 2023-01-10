package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.modelo.Curso;
import com.sistemaEscuela.aplicaciones2.repositorio.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;
    public ArrayList<Curso> obtenerCursos(){
        return (ArrayList<Curso>)  cursoRepository.findAll();
    }
    public Curso guardarCursos(Curso cursoT){
        return cursoRepository.save(cursoT);
    }
    public Optional<Curso> obtenerporID(Long id){
        return cursoRepository.findById(id);
    }

    public boolean EliminarCurso (Long id ){
        try {
            cursoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }
}
