package com.sistemaEscuela.aplicaciones2.controlador;

import com.sistemaEscuela.aplicaciones2.modelo.Docente;
import com.sistemaEscuela.aplicaciones2.servicios.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/docente")
public class DocenteController {
    @Autowired
    DocenteService docenServi;

    @GetMapping()
    public ArrayList<Docente> obDocentes(){
        return docenServi.obtenerDocentes();
    }

    @PostMapping()
    public Docente guardarEstudiante(@RequestBody Docente docen){
        return this.docenServi.guardarDocente(docen);
    }
    @GetMapping(path = "/{id}" )
    public Optional<Docente> obtenerEstudianteID (@PathVariable("id") Long id){
        return this.docenServi.obtenerporID(id);
    }
    @DeleteMapping(path = "/{id}")
    public String eliminarporID (@PathVariable("id") Long id){
        boolean ok = this.docenServi.EliminarDocente(id);
        if(ok){
            return "Estudiante Eliminado Correctamente";

        }else{
            return "No se ha encontrado al estudiante";
        }
    }
}