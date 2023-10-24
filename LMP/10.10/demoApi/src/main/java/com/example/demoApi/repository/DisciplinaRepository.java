package com.example.demoApi.repository;

import com.example.demoApi.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository <Disciplina, Integer> {

    List<Disciplina> findByNome(String nome);

    List<Disciplina> findByCargaHoraria(int carga_horaria);

    List<Disciplina> findBySigla(String sigla);

    @Query("select a from Disciplina a where a.sigla like %?1% and a.codigo > ?2")
    List<Disciplina> findBySiglaCod(String sigla, int cod);

    @Query("select a from Disciplina a where a.nome like %?1% and a.codigo < ?2")
    List<Disciplina> findByNomeCod(String nome, int codigo);

    @Query("select a from Disciplina a where a.nome like %?1% and a.sigla like ?2")
    List<Disciplina> findByNomeSigla(String nome, String sigla);
}
