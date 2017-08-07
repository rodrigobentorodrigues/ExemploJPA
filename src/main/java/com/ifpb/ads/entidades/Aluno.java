
package com.ifpb.ads.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "AlunoTB")
@TableGenerator(name = "minha_tb", 
        table = "MinhaTabela", 
        pkColumnName = "Alunos", 
        pkColumnValue = "ValorAluno",
        valueColumnName = "ValorAlunoColuna", allocationSize = 1)
public class Aluno implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "minha_tb")
    private int id;
    @Column(length = 30)
    private String nome;
    @Column(length = 30, unique = true)
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public Aluno(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", matricula=" + matricula + '}';
    }
    
}
