package com.br.sistemapadaria.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sistemapadaria.model.Cliente;
import com.br.sistemapadaria.repository.ClienteRepository;

/*
 * Descrição: Entidade Cliente Service
 * Data: 04/01/2020  23:44
 * Autor: José Walter
 */
@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	// Regras de negócios.
	
	public Cliente cadastrar(Cliente cliente){
		
		return clienteRepository.save(cliente);
		
	}
	
	
	public Collection<Cliente> buscarTodos(){
		return clienteRepository.findAll();
	}
	
	public void excluir (Cliente cliente){
		clienteRepository.delete(cliente);
	} 
	
	public Cliente buscarPorCodigo(long codigo) {
		
		return clienteRepository.findById(codigo).get();
	}
	
	public Cliente editar(Cliente cliente){
		
		 return clienteRepository.save(cliente);
	}

}
