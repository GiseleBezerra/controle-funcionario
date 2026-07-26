package br.com.controle_funcionario.service;

import br.com.controle_funcionario.entity.Estagiario;
import br.com.controle_funcionario.repository.EstagiarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstagiarioService {

    private final EstagiarioRepository estagiarioRepository;

    public String criar(Estagiario estagiario){
        this.estagiarioRepository.save(estagiario);
        return "Estagiário criado com sucesso";
    }

    public String deletar(Long id){
        this.estagiarioRepository.deleteById(id);
        return "Estagiário de id " + id + " foi deletado com sucesso";
    }

    public Estagiario listarPorId(Long id){
        return this.estagiarioRepository.findById(id).get();
    }

    public List<Estagiario> listar(){
        return this.estagiarioRepository.findAll();
    }

    public String atualizar(Long id, Estagiario estagiario){

        estagiario.setId(id);

        Estagiario estagDB = this.estagiarioRepository.findById(id).get(); //Retorno do objeto com id que o usuário passou

        if (estagiario.getNome() != null) estagDB.setNome(estagiario.getNome());
        if (estagiario.getCpf() != null) estagDB.setCpf(estagiario.getCpf());
        if (estagiario.getDepartamento() != null) estagDB.setDepartamento(estagiario.getDepartamento());
        if (estagiario.getSalario() != null) estagDB.setSalario(estagiario.getSalario());
        if (estagiario.getIdade() != null) estagDB.setIdade(estagiario.getIdade());

        this.estagiarioRepository.save(estagDB);

        return "Estagiário do id " + id + " atualizado com sucesso";
    }

}
