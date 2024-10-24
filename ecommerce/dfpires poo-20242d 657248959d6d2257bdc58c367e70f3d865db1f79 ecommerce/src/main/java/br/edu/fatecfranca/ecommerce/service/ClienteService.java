package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.model.Cliente;
import br.edu.fatecfranca.ecommerce.dto.ClienteDTO;
import br.edu.fatecfranca.ecommerce.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {
    // injeção de dependência - não precisa instanciar objeto para chamar seus métodos
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodos(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> buscarPorId(Long id){
        return clienteRepository.findById(id);
    }

    public Cliente salvar(ClienteDTO ClienteDTO){
        Cliente Cliente = new Cliente();
        Cliente.setNome(ClienteDTO.getNome());
        Cliente.setEmail(ClienteDTO.getEmail());
        Cliente.setUsername(ClienteDTO.getUsername());
        Cliente.setPassword(ClienteDTO.getPassword());
        return clienteRepository.save(Cliente);

    }

    public Cliente remove(long id){
        Optional<Cliente> Cliente = clienteRepository.findById(id);
        if(Cliente.isPresent()){
            clienteRepository.delete(Cliente.get());
            return Cliente.get();
        }
        return null;
    }

    public Cliente atualizar(Long id, ClienteDTO ClienteDTO){
        Optional<Cliente> Cliente = clienteRepository.findById(id);
        if(Cliente.isPresent()){
            Cliente.get().setNome(ClienteDTO.getNome());
            Cliente.get().setEmail(ClienteDTO.getEmail());
            Cliente.get().setUsername(ClienteDTO.getUsername());
            Cliente.get().setPassword(ClienteDTO.getPassword());
            return clienteRepository.save(Cliente.get());
        }
        return null;
    }
}
