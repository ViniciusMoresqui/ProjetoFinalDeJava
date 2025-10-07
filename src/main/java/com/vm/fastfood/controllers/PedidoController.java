package com.vm.fastfood.controllers;

import com.vm.fastfood.models.Pedido;
import com.vm.fastfood.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/pedido")
@RestController
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> findAll(){
        return this.pedidoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findById(@PathVariable Long id){
        return this.pedidoService.findById(id);
    }

    @PostMapping
    public Pedido savePedido(@RequestBody Pedido pedido){
        return this.pedidoService.salvarPedido(pedido);
    }

    @DeleteMapping("/{id}")
    public void deletePedido(@PathVariable Long id){
        this.pedidoService.deletePedido(id);
    }

}
