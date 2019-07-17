package com.conectaoracle.conectaoracle.domain;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "trabalho")
@Entity
public class Trabalho implements Serializable {



    @SequenceGenerator(name="TRABALHOID_GENERATOR", sequenceName="DIARIO.TRABALHOID_GENERATOR", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="TRABALHOID_GENERATOR")
    @Id
    private Long id;

    private String nome;



    public Trabalho() {
    }

    public Trabalho(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trabalho trabalho = (Trabalho) o;

        return id.equals(trabalho.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
