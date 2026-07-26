package br.com.controle_funcionario.repository;

import br.com.controle_funcionario.entity.Desenvolvedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesenvolvedorRepository extends JpaRepository<Desenvolvedor, Long> {
}
