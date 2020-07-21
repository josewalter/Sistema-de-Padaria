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

import com.br.sistemapadaria.model.ContasPagar;
import com.br.sistemapadaria.service.ContasPagarService;

/*
 * Descrição: Classe Contas a Pagar Controller
 * Data: 01/1/2020  01:56
 * Autor: José Walter
 */
@RestController
public class ContasPagarController {

	@Autowired
    ContasPagarService contasService;	
	
	//EndPoints
		
	@RequestMapping(method=RequestMethod.POST,
			       value="/contaspagar", consumes =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ContasPagar> cadastrarContasPagar
	              (@RequestBody ContasPagar contasPagar){
		
		ContasPagar contaSalva = contasService.cadastrar(contasPagar);
		return new ResponseEntity<>(contaSalva, HttpStatus.CREATED);
	}
	
//================================================================================================================
	@RequestMapping(method=RequestMethod.GET,
			       value="/contaspagar", produces =
			       MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ContasPagar>> buscarTodasContas(){
		
		List<ContasPagar> contaEncontrada = contasService.buscarTodos();
		return new ResponseEntity<>(contaEncontrada, HttpStatus.OK);
	}
	
//================================================================================================================	
	@RequestMapping(method=RequestMethod.DELETE, value="/contaspagar/{id}")
	public ResponseEntity<ContasPagar> excluirConta(@PathVariable Long id){
		
		ContasPagar contaEncontrada = contasService.buscarPorId(id);
		if (contaEncontrada == null){
			return new ResponseEntity<>( HttpStatus.NOT_FOUND);
		  	
		} else{
			contasService.excluir(contaEncontrada);
			return new ResponseEntity<>(HttpStatus.OK);	
		}		
	}
	
//=================================================================================================================	
	@RequestMapping(method=RequestMethod.PUT,
			       value="/contaspagar", consumes =MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ContasPagar> alterarConta
	       (@RequestBody ContasPagar contas){
		
		ContasPagar contaAlterada = contasService.alterar(contas);
		return new ResponseEntity<>(contaAlterada, HttpStatus.OK);
	}
}
