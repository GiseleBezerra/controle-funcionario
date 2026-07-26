package br.com.controle_funcionario.repository;

import br.com.controle_funcionario.entity.Estagiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstagiarioRepository extends JpaRepository<Estagiario, Long> {
}
