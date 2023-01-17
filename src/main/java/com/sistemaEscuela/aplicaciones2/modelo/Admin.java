package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;
import java.security.NoSuchAlgorithmException;

//Security
import org.apache.commons.codec.digest.DigestUtils;

/* TODO:
    Crear Entidad Admin;
    Agg campo: cargo
    Rol = admin
    Agg password y hash16
    No va codigo
    Validacion del login
*/
@Entity
@Table(name = "Admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;

    private String nombres;
    private String apellidos;
    private String cedula;
    private String cargo;
    private String rol="admin";
    private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String hashedPass = DigestUtils.md5Hex(password);
        this.password = hashedPass;
    }
}

/*
String password = "1234";
String bcryptHashString = BCrypt.withDefaults().hashToString(12, password.toCharArray());
// $2a$12$US00g/uMhoSBm.HiuieBjeMtoN69SN.GE25fCpldebzkryUyopws6
    ...
BCrypt.Result result = BCrypt.verifyer().verify(password.toCharArray(), bcryptHashString);
// result.verified == true
 */