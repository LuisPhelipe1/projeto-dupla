package br.com.senai.infob.backend.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

 

@Entity 
@Table (name= "Usuário")
public class Usuario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column (name= "id")
    private Integer id;

    @Column (name= "nome")
    private String nome;

    @Column (name= "cpf")
    private String cpf;

    @Column (name= "data_de_nascimento")
    private Date data_de_nascimento;

}

@ManyToMany 
@JoinTable (
    name = "usuario_curso",
    joinColumns = @JoinColumn (name = "usuario_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn (name = "curso_id", referencedColumnName  = "id")
)

private List <Curso> curso;

public Usuario() {
}

public Usuario(Integer id, String nome, String cpf, Date data_de_nascimento, List<Curso> curso) {
    this.id = id;
    this.nome = nome;
    this.cpf = cpf;
    this.data_de_nascimento = data_de_nascimento;
    this.curso = curso;
}
