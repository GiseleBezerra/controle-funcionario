package br.com.controle_funcionario.service;

import br.com.controle_funcionario.entity.Gerente;
import br.com.controle_funcionario.repository.GerenteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GerenteService {

    private final GerenteRepository gerenteRepository;

    public String criar(Gerente gerente){
        this.gerenteRepository.save(gerente);
        return "Gerente criado com sucesso";
    }

    public List<Gerente> listar(){
        return this.gerenteRepository.findAll();
    }

    public Gerente listarPorId(Long id){
        return this.gerenteRepository.findById(id).get();
    }

    public String deletar(Long id){
        this.gerenteRepository.deleteById(id);
        return "Gerente do id " + id + " deletado com sucesso";
    }

    public String atualizar(Long id, Gerente gerente){

        Gerente gerDB = this.gerenteRepository.findById(id).get(); //Retorno do objeto com id que o usuário passou

        if(gerente.getCpf() != null) gerDB.setCpf(gerente.getCpf());
        if(gerente.getDepartamento() != null) gerDB.setDepartamento(gerente.getDepartamento());
        if(gerente.getIdade() != null) gerDB.setIdade(gerente.getIdade());
        if(gerente.getNome() != null) gerDB.setNome(gerente.getNome());
        if(gerente.getSalario() != null) gerDB.setSalario(gerente.getSalario());

        this.gerenteRepository.save(gerDB);

        return "Gerente do id " + id + " atualizado com sucesso";
    }

}
