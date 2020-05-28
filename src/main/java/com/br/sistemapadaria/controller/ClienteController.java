package com.br.sistemapadaria.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	//EndPoints
		
	@RequestMapping(method=RequestMethod.POST,
			       value="/clientes", consumes =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> cadastrarCliente
	              (@RequestBody Cliente cliente){
		
		Cliente clienteSalvo = clienteService.cadastrar(cliente);
		return new ResponseEntity<>(clienteSalvo, HttpStatus.CREATED);
	}
	
//================================================================================================================
	@RequestMapping(method=RequestMethod.GET,
			       value="/clientes", produces =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Cliente>> buscarTodosClientes(){
		
		List<Cliente> clienteEncontrado = clienteService.buscarTodos();
		return new ResponseEntity<>(clienteEncontrado, HttpStatus.OK);
	}
	
//================================================================================================================	
	@RequestMapping(method=RequestMethod.DELETE, value="/clientes/{id}")
	public ResponseEntity<Cliente> excluirCliente(@PathVariable Long id){
		
		Cliente clienteEncontrado = clienteService.buscarPorId(id);
		if (clienteEncontrado == null){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  	
		} else{
			clienteService.excluir(clienteEncontrado);
			return new ResponseEntity<>(HttpStatus.OK);	
		}		
	}
	
//=================================================================================================================	
	@RequestMapping(method=RequestMethod.PUT,
			       value="/clientes", consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Cliente> alterarCliente
	       (@RequestBody Cliente cliente){
		
		Cliente clienteAlterado = clienteService.alterar(cliente);
		return new ResponseEntity<>(clienteAlterado, HttpStatus.OK);
	}

}
