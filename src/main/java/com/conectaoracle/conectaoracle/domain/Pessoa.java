package com.conectaoracle.conectaoracle.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Table(name = "pessoa")
@Entity
public class Pessoa implements Serializable {

    @SequenceGenerator(name="PESSOAID_GENERATOR", sequenceName="DIARIO.PESSOAID_GENERATOR", allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="PESSOAID_GENERATOR")
    @Id
    private Long id;
    private String cpf;
    private String nome;

    @OneToMany()
    private List<Trabalho> trabalhoList;


    public Pessoa() {
    }

    public Pessoa(String cpf, String nome, List<Trabalho> trabalhoList) {
        this.cpf = cpf;
        this.nome = nome;
        this.trabalhoList = trabalhoList;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Trabalho> getTrabalhoList() {
        return trabalhoList;
    }

    public void setTrabalhoList(List<Trabalho> trabalhoList) {
        this.trabalhoList = trabalhoList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pessoa pessoa = (Pessoa) o;

        return id.equals(pessoa.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
