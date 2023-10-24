package com.example.demoApi.controller;

import com.example.demoApi.model.Professor;
import com.example.demoApi.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("apiProfessor")
public class ProfessorController {

    @Autowired
    ProfessorRepository profRepo;

    @GetMapping("/todos")
    public List<Professor> buscarTodosProfessores() {

        return profRepo.findAll();
    }

    @GetMapping("/todos/ra/{ra}")
    public Optional<Professor> buscarPorRa(@PathVariable("ra") int ra) {

        return profRepo.findById(ra);
    }

    @GetMapping("/todos/nome/{nome}")
    public List<Professor> buscaPorNome(@PathVariable("nome") String nome){
        return profRepo.findByNome(nome);
    }

    @PostMapping("/inserir")
    public void inserir(@RequestBody Professor p){
        profRepo.save(p);
    }


    @DeleteMapping("/deletar")
    public void deletar(@RequestBody Professor p){
        profRepo.delete(p);
    }

    @DeleteMapping("/deletar/ra/{ra}")
    public void deletarPorRa(@PathVariable("ra") int ra){
        profRepo.deleteById(ra);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Professor p){
        profRepo.save(p);
    }

    @GetMapping("/todos/nomeSalario/{nome}/{salario}")
    public List<Professor> findByNomeSalario(
            @PathVariable("nome") String nome,
            @PathVariable("salario") double salario
            ) {

        return profRepo.findByNomeSalario(nome, salario);
    }

    @GetMapping("/todos/nomeRa/{nome}/{ra}")
    public List<Professor> findByNomeRa(
            @PathVariable("nome") String nome,
            @PathVariable("ra") int ra
    ) {

        return profRepo.findByNomeRa(nome, ra);
    }
}
