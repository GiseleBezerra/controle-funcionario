package br.com.controle_funcionario.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass // Significa que esta classe serve apenas para fornecer atributos às classes filhas. Ela NÃO terá uma tabela própria.
public class Pessoa {
    private String nome;
    private String cpf;
    private Integer idade;

    public Pessoa(String nome, String cpf, Integer idade) { //Construtor -> valores iniciais do objeto
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    protected Pessoa() {

    }
}
