package com.example.demoApi.repository;

import com.example.demoApi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlunoRepository extends JpaRepository <Aluno, Integer> { // <Aluno(classe instanciada), Integer(type chave primária)>

    List<Aluno> findByNome(String nome);

    List<Aluno> findByAltura(double altura);
}
