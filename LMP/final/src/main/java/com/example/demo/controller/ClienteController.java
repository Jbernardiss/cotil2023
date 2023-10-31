package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepo;

    @PostMapping("/inserir")
    public void inserirAluno(@RequestBody Cliente cliente) {
        clienteRepo.save(cliente);
    }

    @GetMapping("/buscar/todos")
    public List<Cliente> buscarClientes() {
        return clienteRepo.findAll();
    }

    @GetMapping("/buscar/codigo/{codigo}")
    public List<Cliente> buscarClientesPorCodigo(@PathVariable("codigo") int codigo) {
        return clienteRepo.findByCodigo(codigo);
    }

    @GetMapping("/buscar/comecoNome/{comecoNome}")
    public List<Cliente> buscarClientesPorComecoNome(@PathVariable("comecoNome") String comecoNome) {
        return clienteRepo.findByComecoNome(comecoNome);
    }

    @GetMapping("/buscar/email/{email}")
    public List<Cliente> buscarClientesPorEmail(@PathVariable("email") String email) {
        return clienteRepo.findByEmail(email);
    }

    @GetMapping("buscar/parteNomeParteEmail/{parteNome}/{parteEmail}")
    public List<Cliente> buscarClientesPorParteNomeEParteEmail(@PathVariable("parteNome") String parteNome, @PathVariable("parteEmail") String parteEmail) {
        return clienteRepo.findByParteNomeEParteEmail(parteNome, parteEmail);
    }

    @DeleteMapping("deletar")
    public void deletarCliente(@RequestBody Cliente cliente) {
        clienteRepo.delete(cliente);
    }

    @DeleteMapping("deletar/codigo/{codigo}")
    public void deletarClientePorCodigo(@PathVariable("codigo") int codigo) {
        clienteRepo.deleteById(codigo);
    }

    @PutMapping("atualizar")
    public void atualizarAluno(@RequestBody Cliente cliente) {
        clienteRepo.save(cliente);
    }
}
