package br.com.controle_funcionario.service;

import br.com.controle_funcionario.entity.Desenvolvedor;
import br.com.controle_funcionario.repository.DesenvolvedorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DesenvolvedorService {

    private final DesenvolvedorRepository desenvolvedorRepository;

    public String criar(Desenvolvedor desenvolvedor){
        this.desenvolvedorRepository.save(desenvolvedor);
        return "Desenvolvedor criado com sucesso";
    }

    public List<Desenvolvedor> listar(){
        return this.desenvolvedorRepository.findAll();
    }

    public Desenvolvedor listarPorId(Long id){
        return this.desenvolvedorRepository.findById(id).get();
    }

    public String deletar(Long id){
        this.desenvolvedorRepository.deleteById(id);
        return "Desenvolvedor do id " + id + " deletado com sucesso";
    }

    public String atualizar(Long id, Desenvolvedor desenvolvedor){

        Desenvolvedor devDB = this.desenvolvedorRepository.findById(id).get(); //Retorno do objeto com id que o usuário passou

        if(desenvolvedor.getCpf() != null) devDB.setCpf(desenvolvedor.getCpf());
        if(desenvolvedor.getDepartamento() != null) devDB.setDepartamento(desenvolvedor.getDepartamento());
        if(desenvolvedor.getIdade() != null) devDB.setIdade(desenvolvedor.getIdade());
        if(desenvolvedor.getNome() != null) devDB.setNome(desenvolvedor.getNome());
        if(desenvolvedor.getSalario() != null) devDB.setSalario(desenvolvedor.getSalario());

        this.desenvolvedorRepository.save(devDB);

        return "Desenvolvedor do id " + id + " atualizado com sucesso";
    }

}
