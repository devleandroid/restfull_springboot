package com.project.rest.app.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_clinte")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
    private String idade;

    @Column(name = "genero")
    private String genero;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "contata")
    private String contato;

    public Pessoa() { }

    public Pessoa( Long id, String nome, String idade, String genero, String endereco, String contato ) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.endereco = endereco;
        this.contato = contato;
    }

    public Long getId() {
        return id;
    }

    public void setId( Long id ) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome( String nome ) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade( String idade ) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero( String genero ) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco( String endereco ) {
        this.endereco = endereco;
    }

    public String getContato() {
        return contato;
    }

    public void setContato( String contato ) {
        this.contato = contato;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", genero='" + genero + '\'' +
                ", endereco='" + endereco + '\'' +
                ", contato='" + contato + '\'' +
                '}';
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals( id, pessoa.id ) &&
                Objects.equals( nome, pessoa.nome ) &&
                Objects.equals( idade, pessoa.idade ) &&
                Objects.equals( genero, pessoa.genero ) &&
                Objects.equals( endereco, pessoa.endereco ) &&
                Objects.equals( contato, pessoa.contato );
    }

    @Override
    public int hashCode() {

        return Objects.hash( id, nome, idade, genero, endereco, contato );
    }
}
