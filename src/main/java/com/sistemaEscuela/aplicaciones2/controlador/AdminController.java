package com.sistemaEscuela.aplicaciones2.controlador;

import com.sistemaEscuela.aplicaciones2.Security.Validations;
import com.sistemaEscuela.aplicaciones2.modelo.Admin;
import com.sistemaEscuela.aplicaciones2.servicios.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    Validations validator;

    @Autowired
    AdminService adminService;

    @GetMapping()
    public ArrayList<Admin> obAdmins(){
        return adminService.obtenerAdmins();
    }

    @PostMapping("/register")
    public Admin registrarAdmin(@RequestBody Admin admin){
        if(adminService.existeAdmin(admin.getCedula()) || validator.validarCedula(admin.getCedula())){
            return null;
        }
        return this.adminService.guardarAdmin(admin);
    }

    @GetMapping(path = "/{id}")
    public Optional<Admin> obtenerAdminPorId(@PathVariable("id") Long id){
        return this.adminService.obtenerporID(id);
    }

    @GetMapping(path = "/{cedula}")
    public Optional<Admin> obtenerAdminPorCedula(@PathVariable("cedula") String cedula) {return  this.adminService.obtenerAdminCedula(cedula);}

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.adminService.EliminarAdmin(id);
        if(ok){
            return "Administrador Eliminado Correctamente";

        }else{
            return "No se ha encontrado al Administrador";
        }
    }


}
