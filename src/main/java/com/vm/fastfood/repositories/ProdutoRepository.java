package com.vm.fastfood.repositories;

import com.vm.fastfood.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,Long> {
}
