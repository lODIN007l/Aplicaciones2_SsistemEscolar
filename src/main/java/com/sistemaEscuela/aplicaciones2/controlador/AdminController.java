package com.sistemaEscuela.aplicaciones2.controlador;

import com.sistemaEscuela.aplicaciones2.Security.Validations;
import com.sistemaEscuela.aplicaciones2.modelo.Admin;
import com.sistemaEscuela.aplicaciones2.servicios.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/admin")
public class AdminController {
    Validations validator = new Validations();

    @Autowired
    AdminService adminService;

    @GetMapping()
    public ArrayList<Admin> obAdmins(){
        return adminService.obtenerAdmins();
    }

    @PostMapping("/register")
    public String registrarAdmin(@RequestBody Admin admin){
        if(adminService.existeAdmin(admin.getCedula()))
            return "Este administrador ya existe";
        if(!validator.validarCedula(admin.getCedula()))
            return "La cedula no es valida";
        adminService.guardarAdmin(admin);
        return "Usted se registro exitosamente";
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

    @PutMapping(path = "editarAdmin/{cedula}")
    public String editarAdmin (@PathVariable("cedula") String cedula, @RequestBody Admin admin){
        return this.adminService.actualizarAdmin(cedula,admin);
    }


}
