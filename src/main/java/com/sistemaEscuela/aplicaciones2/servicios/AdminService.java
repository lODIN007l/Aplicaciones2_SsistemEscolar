package com.sistemaEscuela.aplicaciones2.servicios;

import com.sistemaEscuela.aplicaciones2.modelo.Admin;
import com.sistemaEscuela.aplicaciones2.modelo.Curso;
import com.sistemaEscuela.aplicaciones2.repositorio.AdminRepository;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    AdminRepository adminRepository;

    public ArrayList<Admin> obtenerAdmins(){
        return (ArrayList<Admin>) adminRepository.findAll();
    }

    public Admin guardarAdmin(Admin adminT){
        return adminRepository.save(adminT);
    }

    public Optional<Admin> obtenerporID(Long id){
        return adminRepository.findById(id);
    }

    public boolean EliminarAdmin (Long id ){
        try {
            adminRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }

    public Optional<Admin> obtenerAdminCedula(String cedula){
        return adminRepository.findByCedula(cedula);
    }

    public boolean existeAdmin(String cedula) {
        return obtenerAdminCedula(cedula).isPresent();
    }
}
