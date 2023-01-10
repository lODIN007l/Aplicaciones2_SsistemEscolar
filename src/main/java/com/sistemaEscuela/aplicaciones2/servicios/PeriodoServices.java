package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.modelo.Periodo;
import com.sistemaEscuela.aplicaciones2.repositorio.PeriodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PeriodoServices {
    @Autowired
    PeriodoRepository periodoRepository;
    public ArrayList<Periodo> obtenerPeriodos(){
        return (ArrayList<Periodo>)  periodoRepository.findAll();
    }
    public Periodo guardarPeriodo(Periodo period){
        return periodoRepository.save(period);
    }
    public Optional<Periodo> obtenerporID(Long id){
        return periodoRepository.findById(id);
    }

    public boolean EliminarPeriodo (Long id ){
        try {
            periodoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }

    }


}
