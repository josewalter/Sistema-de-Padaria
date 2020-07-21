package com.br.sistemapadaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sistemapadaria.model.Fornecedor;

/*
 * Descrição: Entidade fornecedor repository
 * Data: 21/07/2020  00:16
 * Autor: José Walter
 */

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

}
