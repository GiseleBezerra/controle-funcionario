package br.com.controle_funcionario.controller;

import br.com.controle_funcionario.entity.Estagiario;
import br.com.controle_funcionario.service.EstagiarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estagiario")
@RequiredArgsConstructor
public class EstagiarioController {

    private final EstagiarioService estagiarioService;

    @PostMapping("/criar")
    public ResponseEntity<String> criar(@RequestBody Estagiario estagiario){
        String resposta = this.estagiarioService.criar(estagiario);

        return ResponseEntity.ok(resposta);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Estagiario>> listar(){
        return ResponseEntity.ok(this.estagiarioService.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Estagiario> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.estagiarioService.listarPorId(id));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){

        return ResponseEntity.ok(this.estagiarioService.deletar(id));
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Long id, @RequestBody Estagiario estagiario){
        String resposta = this.estagiarioService.atualizar(id, estagiario);

        return ResponseEntity.ok(resposta);
    }

}
