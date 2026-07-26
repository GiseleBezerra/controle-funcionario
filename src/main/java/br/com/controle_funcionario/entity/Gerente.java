package br.com.controle_funcionario.entity;

import br.com.controle_funcionario.entity.enums.Cargo;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Gerente extends Funcionario {

    public Gerente(Long id, Double salario, String nome, String departamento, String cpf, Integer idade) {
        super(id, salario, nome, departamento, Cargo.GERENTE, cpf, idade);
    }


}
