package com.example.demoApi.repository;

import com.example.demoApi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> { // <Aluno(classe instanciada), Integer(type chave primária)>

    List<Aluno> findByNome(String nome);

    List<Aluno> findByAltura(double altura);

    @Query("select a from Aluno a where a.nome like %?1%")
    List<Aluno> findByParteNome(String parteNome);

    @Query("select a from Aluno a where a.ra > ?1")
    List<Aluno>findByRaMaiorQue(int ra);

    @Query("select a from Aluno a where a.altura < ?1")
    List<Aluno>findByAlturaMenorQue(double altura);

    @Query("select a from Aluno a where a.nome like %?1% and a.ra > ?2")
    List<Aluno> findByNomeRa(String nome, int ra);

    @Query("select a from Aluno a where a.nome like %?1% and a.altura < ?2")
    List<Aluno> findByNomeAlturaMenorQue(String nome, double altura);
}
