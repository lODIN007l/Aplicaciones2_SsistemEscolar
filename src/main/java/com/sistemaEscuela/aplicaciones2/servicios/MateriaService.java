package com.sistemaEscuela.aplicaciones2.servicios;


import com.sistemaEscuela.aplicaciones2.modelo.Materia;
import com.sistemaEscuela.aplicaciones2.repositorio.MateriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MateriaService {
    @Autowired
    MateriaRepository materiaRepository;
    public ArrayList<Materia> obtenerMaterias(){
        return (ArrayList<Materia>)  materiaRepository.findAll();
    }
    public Materia guardarMateria(Materia mate){
        return materiaRepository.save(mate);
    }
    public Optional<Materia> obtenerporID(Long id){
        return materiaRepository.findById(id);
    }

    public boolean EliminarMateria (Long id ){
        try {
            materiaRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }
}
