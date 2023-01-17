package com.sistemaEscuela.aplicaciones2.controlador;

import com.sistemaEscuela.aplicaciones2.modelo.Curso;
import com.sistemaEscuela.aplicaciones2.servicios.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    CursoService cursoServi;

    @GetMapping()
    public ArrayList<Curso> obDocentes(){
        return cursoServi.obtenerCursos();
    }

    @PostMapping()
    public Curso guardarEstudiante(@RequestBody Curso curso){
        return this.cursoServi.guardarCursos(curso);
    }
    @GetMapping(path = "/{id}" )
    public Optional<Curso> obtenerEstudianteID (@PathVariable("id") Long id){
        return this.cursoServi.obtenerporID(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporID (@PathVariable("id") Long id){
        boolean ok = this.cursoServi.EliminarCurso(id);
        return ok?  "Estudiante Eliminado Correctamente" :  "No se ha encontrado al estudiante";
    }
}
