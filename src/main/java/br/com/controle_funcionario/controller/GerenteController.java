package br.com.controle_funcionario.controller;

import br.com.controle_funcionario.entity.Gerente;
import br.com.controle_funcionario.service.GerenteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/gerente")
public class GerenteController {

    private final GerenteService gerenteService;

    @PostMapping("/criar")
    public ResponseEntity<String> criar(@RequestBody Gerente gerente){
        String resposta = this.gerenteService.criar(gerente);

        return ResponseEntity.ok(resposta);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Gerente>> listar(){
        return ResponseEntity.ok(this.gerenteService.listar());
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Gerente> listarPorId(@PathVariable Long id){
        return ResponseEntity.ok(this.gerenteService.listarPorId(id));
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id){
        String resposta = this.gerenteService.deletar(id);

        return ResponseEntity.ok(resposta);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<String> atualizar(@PathVariable Long id, @RequestBody Gerente gerente){
        String resposta = this.gerenteService.atualizar(id, gerente);

        return ResponseEntity.ok(resposta);
    }

}
