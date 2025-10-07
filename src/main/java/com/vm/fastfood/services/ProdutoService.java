package com.vm.fastfood.services;

import com.vm.fastfood.models.Pedido;
import com.vm.fastfood.models.Produto;
import com.vm.fastfood.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> findAll(){
        return this.produtoRepository.findAll();
    }

    public Optional<Produto> findByid(Long id){
        return this.produtoRepository.findById(id);
    }

    public Produto salvarProduto(Produto produto){
        return this.produtoRepository.save(produto);
    }

    public void deleteProduto(Long id){
        this.produtoRepository.deleteById(id);
    }

}
