package br.com.senai.infob.backend.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//correção de commit 

@Entity 
@Table (name= "Usuário")
public class Usuario {
    @Id
    GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name= "id")
    private Integer id;

    @Column (name= "nome")
    private String nome;

    @Column (name= "cpf")
    private String cpf;

    @Column (name= "data_de_nascimento")
    private Date data_de_nascimento;

    
}
