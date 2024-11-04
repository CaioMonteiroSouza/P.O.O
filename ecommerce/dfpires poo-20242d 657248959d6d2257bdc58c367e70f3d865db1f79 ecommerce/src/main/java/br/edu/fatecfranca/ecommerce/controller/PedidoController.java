package br.edu.fatecfranca.ecommerce.controller;
import br.edu.fatecfranca.ecommerce.dto.PedidoDTO;
import br.edu.fatecfranca.ecommerce.model.Pedido;
import br.edu.fatecfranca.ecommerce.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clientes")
public class PedidoController {
    @Autowired
    private PedidoService PedidoService;

    @GetMapping
    public ResponseEntity<List<Pedido>> listarTodos(){
        return new ResponseEntity<>(PedidoService.listarTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> listarPorId(@PathVariable Long id){
        Optional Pedido = PedidoService.buscarPorId(id);
        if(Pedido.isPresent()){
            return new ResponseEntity<>(Pedido.get(), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Pedido não encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Pedido> salvar(@RequestBody PedidoDTO PedidoDTO){
        return new ResponseEntity<>(PedidoService.salvar(PedidoDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> excluir(@PathVariable Long id){
        PedidoService.excluir(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

//    @PatchMapping("/{id}")
//    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody PedidoDTO PedidoDTO){
//        Pedido aux = PedidoService.atualizar(id, PedidoDTO);
//        if(aux != null){
//            return new ResponseEntity<>(aux, HttpStatus.OK);
//        }
//        else {
//            return new ResponseEntity<>("Pedido não encontrado", HttpStatus.NOT_FOUND);
//        }
//    }
}
