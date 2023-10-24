package com.example.demoApi.controller;

import com.example.demoApi.model.Disciplina;
import com.example.demoApi.model.Professor;
import com.example.demoApi.repository.DisciplinaRepository;
import org.hibernate.query.sqm.sql.internal.DiscriminatorPathInterpretation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiDisciplina")
public class DiscplinaController {

    @Autowired
    DisciplinaRepository discRep;

    @GetMapping("/todas")
    public List<Disciplina> buscarTodos(){
        return discRep.findAll();
    }

    @GetMapping("/todas/id/{id}")
    public Optional<Disciplina> buscaPorId(@PathVariable("id") int id){
        return discRep.findById(id);
    }

    @GetMapping("/todas/nome/{nome}")
    public List<Disciplina> buscaPorNome(@PathVariable("nome") String nome){
        return discRep.findByNome(nome);
    }

    @GetMapping("/todas/carga_horaria/{carga_horaria}")
    public List<Disciplina> buscaPorCargaHoraria(@PathVariable("carga_horaria") int carga_horaria){
        return discRep.findByCargaHoraria(carga_horaria);
    }

    @GetMapping("todas/sigla/{sigla}")
    public List<Disciplina> buscaPorSigla(@PathVariable("sigla") String sigla){
        return discRep.findBySigla(sigla);
    }

    @PostMapping("/inserir")
    public void inserir(@RequestBody Disciplina disc){
        discRep.save(disc);
    }

    @DeleteMapping("/deletar")
    public void deletar(@RequestBody Disciplina disc) {
        discRep.delete(disc);
    }

    @DeleteMapping("/deletar/codigo/{codigo}")
    public void deletarPorId(@PathVariable("codigo") int codigo) {
        discRep.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Disciplina disc) {
        discRep.save(disc);
    }

    @GetMapping("/todas/siglaCodigo/{sigla}/{codigo}")
    public List<Disciplina> buscaSiglaCodigo(@PathVariable("sigla") String sigla,@PathVariable("codigo") int codigo){
        return discRep.findBySiglaCod(sigla, codigo);
    }

    @GetMapping("/todas/nomeCodigo/{nome}/{codigo}")
    public List<Disciplina> buscaNomeCodigo(@PathVariable("nome") String nome, @PathVariable("codigo") int codigo){
        return discRep.findByNomeCod(nome, codigo);
    }

    @GetMapping("/todas/nomeSigla/{nome}/{sigla}")
    public List<Disciplina> buscaNomeSigla(@PathVariable("nome") String nome, @PathVariable("sigla") String sigla){
        return discRep.findByNomeSigla(nome, sigla);
    }
}
