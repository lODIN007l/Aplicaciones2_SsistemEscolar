package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;


@Entity
@Table(name="Cursos")
public class Materia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    private String nombre_materia;
    private Integer cod_materia;

    public void setId(long id) {
        this.id = id;
    }

    public void setCod_materia(Integer cod_materia) {
        this.cod_materia = cod_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public long getId() {
        return id;
    }

    public Integer getCod_materia() {
        return cod_materia;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }
}
