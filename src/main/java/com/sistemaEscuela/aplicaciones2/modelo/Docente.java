package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;


@Entity
@Table(name="Docentes")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    private String nombres;
    private String apellidos;
    private Integer cedula;
    private String rol="docente";
    private Integer codigo;

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Integer getCedula() {
        return cedula;
    }

    public long getId() {
        return id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public String getRol() {
        return rol;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
