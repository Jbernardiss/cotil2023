package com.example.demo.repository;

import com.example.demo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository <Cliente, Integer>{

    List<Cliente> findByCodigo(int codigo);

    List<Cliente> findByEmail(String email);

    @Query("select a from Cliente a where a.nome like ?1%")
    List<Cliente> findByComecoNome(String comecoNome);

    @Query("select a from Cliente a where a.nome like %?1% and a.email like %?2%")
    List<Cliente> findByParteNomeEParteEmail(String parteNome, String parteEmail);
}
