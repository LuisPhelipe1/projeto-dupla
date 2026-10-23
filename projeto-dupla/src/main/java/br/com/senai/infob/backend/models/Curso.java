package br.com.senai.infob.backend.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//
@Entity
@Table (name= "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name= "nome")
    private Integer nome;

    @Column (name= "descrição")
    private String descrição;

    @Column (name= "data_de_inicio")
    private LocalDate data_de_inicio;

    @Column (name= "data_de_termino")
    private LocalDate data_de_termino;

    public Curso() {
    }

    public Curso(Integer nome, String descrição, LocalDate data_de_inicio, LocalDate data_de_termino) {
        this.nome = nome;
        this.descrição = descrição;
        this.data_de_inicio = data_de_inicio;
        this.data_de_termino = data_de_termino;
    }
}
