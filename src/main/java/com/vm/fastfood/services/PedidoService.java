package com.vm.fastfood.services;

import com.vm.fastfood.models.Pedido;
import com.vm.fastfood.repositories.PedidoRepository;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> findAll(){
        return this.pedidoRepository.findAll();
    }

    public Optional<Pedido> findById(Long id){
        return this.pedidoRepository.findById(id);
    }

    public Pedido salvarPedido(Pedido pedido){
        return this.pedidoRepository.save(pedido);
    }

    public void deletePedido(Long id){
        this.pedidoRepository.deleteById(id);
    }

}