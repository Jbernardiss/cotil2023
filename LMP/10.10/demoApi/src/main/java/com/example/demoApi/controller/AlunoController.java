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
}
