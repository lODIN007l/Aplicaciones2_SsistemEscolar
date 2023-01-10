package com.sistemaEscuela.aplicaciones2.controlador;


import com.sistemaEscuela.aplicaciones2.modelo.Periodo;
import com.sistemaEscuela.aplicaciones2.servicios.PeriodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/periodo")
public class PeriodoController {
    @Autowired
    PeriodoServices periodoServi;

    @GetMapping()
    public ArrayList<Periodo> obDocentes(){
        return periodoServi.obtenerPeriodos();
    }

    @PostMapping()
    public Periodo guardarEstudiante(@RequestBody Periodo period){
        return this.periodoServi.guardarPeriodo(period);
    }
    @GetMapping(path = "/{id}" )
    public Optional<Periodo> obtenerEstudianteID (@PathVariable("id") Long id){
        return this.periodoServi.obtenerporID(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporID (@PathVariable("id") Long id){
        boolean ok = this.periodoServi.EliminarPeriodo(id);
        if(ok){
            return "Estudiante Eliminado Correctamente";

        }else{
            return "No se ha encontrado al estudiante";
        }
    }
}
