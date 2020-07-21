package com.br.sistemapadaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sistemapadaria.model.ContasPagar;

/*
 * Descrição: Classe Contas repository
 * Data: 15/07/2020  02:25
 * Autor: José Walter
 */

@Repository
public interface ContasPagarRepository extends JpaRepository<ContasPagar, Long> {

}
