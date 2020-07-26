package com.br.sistemapadaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sistemapadaria.model.Produto;

/*
 * Descrição: Interface Produto repository
 * Data: 23/07/2020  20:15
 * Autor: José Walter
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
