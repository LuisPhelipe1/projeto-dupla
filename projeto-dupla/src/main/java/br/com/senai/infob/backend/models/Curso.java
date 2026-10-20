package br.com.senai.infob.backend.models;

import java.time.LocalDate;
import java.util.jar.Attributes;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

//
@Entity
@Table (name= "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name= "nome")
    private integer nome;

    @Column (name= "descrição")
    private String descrição;

    @Column (name= "data_de_inicio")
    private LocalDate data_de_inicio;

    @Column (name= "data_de_termino")
    private LocalDate data_de_termino;
}
