package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;

@Entity
@Table(name="Cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id ;
    private String curso;
    private Integer curso_id;

    public void setId(long id) {
        this.id = id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setCurso_id(Integer curso_id) {
        this.curso_id = curso_id;
    }

    public long getId() {
        return id;
    }

    public Integer getCurso_id() {
        return curso_id;
    }

    public String getCurso() {
        return curso;
    }
}
