package br.edu.fatecfranca.ecommerce.service;

import br.edu.fatecfranca.ecommerce.dto.ItemPedidoDTO;
import br.edu.fatecfranca.ecommerce.dto.PedidoDTO;
import br.edu.fatecfranca.ecommerce.model.Cliente;
import br.edu.fatecfranca.ecommerce.model.ItemPedido;
import br.edu.fatecfranca.ecommerce.model.Pedido;
import br.edu.fatecfranca.ecommerce.model.Produto;
import br.edu.fatecfranca.ecommerce.repository.ClienteRepository;
import br.edu.fatecfranca.ecommerce.repository.PedidoRepository;
import br.edu.fatecfranca.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    public List<Pedido> listarTodos(){
        return  pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido salvar(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido();
        // verifica se usuario existe
        Cliente cliente = clienteRepository.findById(pedidoDTO.getIdCliente()).orElseThrow(
                () -> new IllegalArgumentException("Cliente não encontrado"));
        pedido.setCliente(cliente);
        // Define o status do pedido
        pedido.setStatus(pedidoDTO.getStatus());
        // Salvar cada item do pedido
        for(ItemPedidoDTO itemPedidoDTO : pedidoDTO.getItens()){
            Produto produto = produtoRepository.findById(pedidoDTO.getIdCliente()).orElseThrow(
                    () ->  new IllegalArgumentException("Produto não encontrado"
            ));
            ItemPedido itemPedido = new ItemPedido();
            itemPedido.setProduto(produto);
            itemPedido.setQtde(itemPedidoDTO.getQtde());
            itemPedido.setPreco(itemPedidoDTO.getPreco());
            itemPedido.setPedido(pedido);
            //adiciona o itemPedido no vetor de iTENS DE PEDIDO
            pedido.getItens().add(itemPedido);
        }
        return pedidoRepository.save(pedido);
    }

    public void excluir(Long id) {
        if(pedidoRepository.existsById(id)){
            pedidoRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Pedido não encontrado");
        }
    }


}
