package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.modelo.Estudiante;
import com.sistemaEscuela.aplicaciones2.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EstudianteService {
    @Autowired
    EstudianteRepository estudianteRepository;
    public ArrayList<Estudiante> obtenerEstudiantes(){
        return (ArrayList<Estudiante>)  estudianteRepository.findAll();
    }
    public Estudiante guardarEstudiante(Estudiante estu){
//        TODO: COMPROBAR QUE NO SE REPITA EL INGRESO DE LOS ESTUDIANTES
        return estudianteRepository.save(estu);
    }
    public Optional<Estudiante> obtenerporID(Long id){
        return estudianteRepository.findById(id);
    }

    public boolean EliminarEstudiante (Long id ){
        try {
            estudianteRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }

}
