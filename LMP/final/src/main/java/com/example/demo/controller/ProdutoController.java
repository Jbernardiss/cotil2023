package com.example.demo.controller;


import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    ProdutoRepository produtoRepo;

    @PostMapping("/inserir")
    public void inserir(@RequestBody Produto produto){
        produtoRepo.save(produto);
    }

    @GetMapping("/todos")
    public List<Produto> consultarTodos(){
        return produtoRepo.findAll();
    }

    @GetMapping("/todos/codigo/{codigo}")
    public List<Produto> consultarPorCodigo(@PathVariable("codigo") int codigo){
        return produtoRepo.findByCodigo(codigo);
    }

    @GetMapping("/todos/parteDescricao/{parteDescricao}")
    public List<Produto> buscaPorParteDescricao(@PathVariable("parteDescricao") String parteDescricao){
        return produtoRepo.findByParteDescricao(parteDescricao);
    }

    @GetMapping("/todos/precoMenorQue/{preco}")
    public List<Produto> buscaPorPrecoMenorQue(@PathVariable("preco") double preco){
        return produtoRepo.findByPrecoMenorQue(preco);
    }

    @GetMapping("/todos/marca/{marca}")
    public List<Produto> buscaPorMarca(@PathVariable("marca") String marca){
        return produtoRepo.findByMarca(marca);
    }

    @GetMapping("/todos/marcaPreco/{marca}/{preco}")
    public List<Produto> buscaProMarcaPreco(@PathVariable("marca") String marca, @PathVariable("preco") double preco){
        return produtoRepo.findByMarcaPreco(marca, preco);
    }

    @DeleteMapping("/deletar")
    public void excluir(@RequestBody Produto produto){
        produtoRepo.delete(produto);
    }

    @DeleteMapping("/deletar/codigo/{codigo}")
    public void excluir(@PathVariable("codigo") int codigo){
        produtoRepo.deleteById(codigo);
    }

    @PutMapping("/atualizar")
    public void atualizar(@RequestBody Produto produto){
        produtoRepo.save(produto);
    }
}
