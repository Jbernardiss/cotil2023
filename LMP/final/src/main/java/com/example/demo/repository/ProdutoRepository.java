package com.example.demo.repository;

import com.example.demo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByCodigo(int codigo);

    List<Produto> findByMarca(String marca);



    @Query("select a from Produto a where a.descricao like ?1%")
    List<Produto> findByParteDescricao(String desc);

    @Query("select a from Produto a where a.preco < ?1")
    List<Produto> findByPrecoMenorQue(double preco);

    @Query("select a from Produto a where a.marca like %?1% and a.preco < ?2")
    List<Produto> findByMarcaPreco(String marca, double preco);
}
