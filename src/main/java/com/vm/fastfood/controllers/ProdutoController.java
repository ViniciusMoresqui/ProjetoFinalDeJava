package com.vm.fastfood.controllers;

import com.vm.fastfood.models.Produto;
import com.vm.fastfood.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping(path = "/produto")
@RestController
public class ProdutoController{

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produto> findAll(){
        return this.produtoService.findAll();
    }

    @GetMapping("/{id}")
    public Produto findById(@PathVariable Long id){
        return this.produtoService.findByid(id).orElse(null);
    }

    @PostMapping
    public Produto saveProduto(@RequestBody Produto produto){
        return this.produtoService.salvarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(@PathVariable Long id){
        this.produtoService.deleteProduto(id);
    }
}