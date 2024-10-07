package com.example.exercicio_rest.controller;

import com.example.exercicio_rest.model.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ClienteController {
    private static final Map<Long, Cliente> clientes = new HashMap<>();
    static {

    }

    @GetMapping("/clientes/{id}")
    public Cliente findById(@PathVariable Long id) {
        Cliente cliente = clientes.get(id);
        if (cliente != null) {
            return cliente;
        }
        else {
            return new Cliente(0, "Cliente não encontrado", "", "");
        }
    }

    @PostMapping("/clientes")
    public Cliente add(@RequestBody Cliente cliente) {
        clientes.put(cliente.getId(), cliente);
        return cliente;
    }

    @GetMapping("/clientes")
    public Collection<Cliente> findAll() {
        return clientes.values();
    }

    @DeleteMapping("/clientes/{id}")
    public String delete(@PathVariable Long id) {
        Cliente cliente = clientes.remove(id);
        if (cliente != null) {
            return "Removido com sucesso";
        }
        else{
            return "Cliente não encontrado";
        }
    }

    @PutMapping("/clientes/{id}")
    public String update(@PathVariable Long id, @RequestBody Cliente cliente) {
        Cliente clienteExistente = clientes.get(id);
        if (clienteExistente != null) {
            clienteExistente.setNome(cliente.getNome());
            clienteExistente.setEmail(cliente.getEmail());
            clienteExistente.setTelefone(cliente.getTelefone());
            clientes.put(id, clienteExistente);
            return "Cliente atualizado com sucesso";
        }
        else {
            return "Cliente não encontrado";
        }
    }
}
