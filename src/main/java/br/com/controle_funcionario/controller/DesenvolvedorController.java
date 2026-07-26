package br.com.controle_funcionario.controller;

import br.com.controle_funcionario.entity.Desenvolvedor;
import br.com.controle_funcionario.service.DesenvolvedorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/desenvolvedor")
@RequiredArgsConstructor
public class DesenvolvedorController {

    private final DesenvolvedorService desenvolvedorService;

    @PostMapping("/criar")
    public ResponseEntity<String> criar(@RequestBody Desenvolvedor desenvolvedor){
        String resposta = this.desenvolvedorService.criar(desenvolvedor);

        return ResponseEntity.ok(resposta);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Desenvolvedor>> listar(){
        return ResponseEntity.ok(this.desenvolvedorService.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Desenvolvedor> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.desenvolvedorService.listarPorId(id));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){
        String resposta = this.desenvolvedorService.deletar(id);

        return ResponseEntity.ok(resposta);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Long id, @RequestBody Desenvolvedor desenvolvedor){
        String resposta = this.desenvolvedorService.atualizar(id, desenvolvedor);

        return ResponseEntity.ok(resposta);
    }
}
