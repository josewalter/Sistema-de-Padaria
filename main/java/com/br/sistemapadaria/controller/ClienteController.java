package com.br.sistemapadaria.controller;


import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.sistemapadaria.model.Cliente;
import com.br.sistemapadaria.service.ClienteService;
/*
 * Descrição: Entidade Cliente Controller
 * Data: 01/1/2020  16:14
 * Autor: José Walter
 */
@RestController
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	//End Points
	@RequestMapping(method=RequestMethod.POST, value="/clientes" , consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente){
		
		Cliente clienteCadastrado = clienteService.cadastrar(cliente);
		return new ResponseEntity<Cliente>(clienteCadastrado, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/clientes", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Collection<Cliente>> buscarTodosClientes(){
		
		Collection<Cliente> clienteBuscados = clienteService.buscarTodos();
		return new ResponseEntity<>(clienteBuscados, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/clientes/{codigo}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable long codigo){
		
		Cliente clienteEncontrado = clienteService.buscarPorCodigo(codigo);
		
		if(clienteEncontrado==null){
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		clienteService.excluir(clienteEncontrado);
		return new ResponseEntity<Cliente>( HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/clientes" , consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> editarCliente(@RequestBody Cliente cliente){
		
		Cliente clienteEditado = clienteService.editar(cliente);
		return new ResponseEntity<Cliente>(clienteEditado, HttpStatus.OK);
	}
}
