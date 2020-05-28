package com.br.sistemapadaria.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.sistemapadaria.model.Cliente;


/*
 * Descrição: Entidade cliente repository
 * Data: 30/12/2019  19:17
 * Autor: José Walter
 */
@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	// List<Cliente> findByLastname();

}
