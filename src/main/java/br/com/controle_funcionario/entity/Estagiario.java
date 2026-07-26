package br.com.controle_funcionario.entity;

import br.com.controle_funcionario.entity.enums.Cargo;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Estagiario extends Funcionario{

    public Estagiario(Long id, Double salario, String nome, String departamento, String cpf, Integer idade) {
        super(id, salario, nome, departamento, Cargo.ESTAGIARIO, cpf, idade);
    }

    protected Estagiario(){} // Pode se usar o notation @NoArgsConstructor e @AllArgsConstructor para não ter a necessidade de criar o construtor
}
