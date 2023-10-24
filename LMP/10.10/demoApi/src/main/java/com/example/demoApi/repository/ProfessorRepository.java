package com.example.demoApi.repository;

import com.example.demoApi.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    public List<Professor> findByNome(String nome);

    @Query("select a from Professor a where a.nome like %?1% and a.salario > ?2")
    public List<Professor> findByNomeSalario(String nome, double salario);

    @Query("select a from Professor a where a.nome like %?1? and a.ra < ?2")
    public List<Professor> findByNomeRa(String nome, int ra);
}
