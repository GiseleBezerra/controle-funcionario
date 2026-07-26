package br.com.controle_funcionario.entity;

import br.com.controle_funcionario.entity.enums.Cargo;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(Long id, Double salario, String nome, String departamento, String cpf, Integer idade) {
        super(id, salario, nome, departamento, Cargo.DESENVOLVEDOR, cpf, idade);
    }


}
