package com.sistemaEscuela.aplicaciones2.controlador;


import com.sistemaEscuela.aplicaciones2.modelo.Materia;
import com.sistemaEscuela.aplicaciones2.servicios.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;


@RestController
@RequestMapping("/materia")
public class MateriaController {
    @Autowired
    MateriaService materiaServi;

    @GetMapping()
    public ArrayList<Materia> obDocentes(){
        return materiaServi.obtenerMaterias();
    }

    @PostMapping()
    public Materia guardarEstudiante(@RequestBody Materia curso){
        return this.materiaServi.guardarMateria(curso);
    }
    @GetMapping(path = "/{id}" )
    public Optional<Materia> obtenerEstudianteID (@PathVariable("id") Long id){
        return this.materiaServi.obtenerporID(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporID (@PathVariable("id") Long id){
        boolean ok = this.materiaServi.EliminarMateria(id);
        if(ok){
            return "Estudiante Eliminado Correctamente";

        }else{
            return "No se ha encontrado al estudiante";
        }
    }
}
