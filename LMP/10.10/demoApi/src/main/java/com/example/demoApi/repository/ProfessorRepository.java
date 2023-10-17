package com.example.demoApi.repository;

import com.example.demoApi.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {
    public List<Professor> findByNome(String nome);
}
