package com.example.demoApi.repository;

import com.example.demoApi.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findByCargaHoraria(int carga_horaria);

    List<Disciplina> findBySigla(String sigla);
}
