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

}
