package com.sistemaEscuela.aplicaciones2.modelo;

import javax.persistence.*;

@Entity
@Table(name="Periodos")
public class Periodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private long id;
    private String Periodo;
    private Integer cod_periodo;

    public void setId(long id) {
        this.id = id;
    }

    public void setCod_periodo(Integer cod_periodo) {
        this.cod_periodo = cod_periodo;
    }

    public void setPeriodo(String periodo) {
        Periodo = periodo;
    }

    public long getId() {
        return id;
    }

    public Integer getCod_periodo() {
        return cod_periodo;
    }

    public String getPeriodo() {
        return Periodo;
    }
}
