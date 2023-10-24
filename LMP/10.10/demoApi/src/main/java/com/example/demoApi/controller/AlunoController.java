package com.example.demoApi.controller;

import com.example.demoApi.model.Aluno;
import com.example.demoApi.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAluno")
public class AlunoController {

    @Autowired
    AlunoRepository alRepo;

    @GetMapping("/todos")
    public List<Aluno> buscarTodosAlunos() { return  alRepo.findAll(); }

    @GetMapping("/todos/ra/{ra}")
    public Optional<Aluno> buscarPorRa(@PathVariable("ra") int ra) {

        return alRepo.findById(ra);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Aluno> buscarPorNome(@PathVariable("nome") String nome) {

        return alRepo.findByNome(nome);
    }

    @GetMapping("/todos/altura/{altura}")
    public List<Aluno> buscaPorAltura(@PathVariable("altura") double altura) {

        return alRepo.findByAltura(altura);
    }

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Aluno al) {

        alRepo.save(al);
    }

    @DeleteMapping("/remover")
    public void removerAluno(@RequestBody Aluno al){
        alRepo.delete(al);
    }

    @DeleteMapping("/remover/ra/{ra}")
    public void removerAlunoPorId(@PathVariable("ra") int ra) {
        alRepo.deleteById(ra);
    }

    @PutMapping("/atualizar")
    public void atualizarAluno(@RequestBody Aluno al) {
        alRepo.save(al);
    }

    @GetMapping("/todos/parteNome/{parteNome}")
    public List<Aluno> buscarPorParteNome(@PathVariable("parteNome") String parteNome){
        return alRepo.findByParteNome(parteNome);
    }

    @GetMapping("/todos/raMaiorQue/{ra}")
    public List<Aluno> buscarRaMaiorQue(@PathVariable("ra") int ra) {
        return alRepo.findByRaMaiorQue(ra);
    }

    @GetMapping("/todos/alturaMenorQue/{altura}")
    public List<Aluno> buscaAlturaMenorQue(@PathVariable("altura") double altura) {
        return alRepo.findByAlturaMenorQue(altura);
    }

    @GetMapping("/todos/nomeRA/{nome}/{ra}")
    public List<Aluno> findByNomeRa(@PathVariable("nome") String nome,@PathVariable("ra") int ra){
        return alRepo.findByNomeRa(nome, ra);
    }

    @GetMapping("/todos/nomeAlturaMenorQue/{nome}/{altura}")
    public List<Aluno> findByNomeAluraMenorQue(
            @PathVariable("nome") String nome,
            @PathVariable("altura") double altura
            ) {
        return alRepo.findByNomeAlturaMenorQue(nome, altura);
    }
}
