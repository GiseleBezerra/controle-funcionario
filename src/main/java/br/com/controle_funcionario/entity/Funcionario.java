package br.com.controle_funcionario.entity;

import br.com.controle_funcionario.entity.enums.Cargo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
// JOINED          - Cria uma tabela para cada classe.
// SINGLE_TABLE    - Tabela única para todas as classes.
// TABLE_PER_CLASS - Cada classe possui todos os atributos.
public class Funcionario extends Pessoa { // (extends) Herança - Funcionario herda atributos e métodos de Pessoa

    @Id // PK do banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT do banco
    private Long id;

    private Double salario;
    private String departamento;

    @Enumerated(EnumType.STRING) // Sem o notion fica o ID do Enum (neste exemplo, ficaria 2)
    private Cargo cargo; //enum

    public Funcionario(Long id, Double salario, String nome, String departamento, Cargo cargo,String cpf, Integer idade) {
        super(nome, cpf, idade); //chama o construtor da classe Pessoa

        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
        this.cargo = cargo;
    }

}
