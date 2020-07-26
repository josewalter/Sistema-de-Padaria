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

import com.br.sistemapadaria.model.Produto;
import com.br.sistemapadaria.service.ProdutoService;

/*
 * Descrição: Classe Produto Controller
 * Data: 23/07/2020  19:56
 * Autor: José Walter
 */

@RestController
public class ProdutoController {

	   @Autowired
	   ProdutoService produtoService;	
		
		//EndPoints
			
		@RequestMapping(method=RequestMethod.POST,
				       value="/produtos", consumes =
				       MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Produto> cadastrarProduto
		              (@RequestBody Produto produto){
			
			Produto produtoSalvo = produtoService.cadastrar(produto);
			return new ResponseEntity<>(produtoSalvo, HttpStatus.CREATED);
		}
		
	//================================================================================================================
		@RequestMapping(method=RequestMethod.GET,
				       value="/produtos", produces =
				       MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<List<Produto>> buscarTodosProdutos(){
			
			List<Produto> produtoEncontrado = produtoService.buscarTodos();
			return new ResponseEntity<>(produtoEncontrado, HttpStatus.OK);
		}
		
	//================================================================================================================	
		@RequestMapping(method=RequestMethod.DELETE, value="/produtos/{id}")
		public ResponseEntity<Produto> excluirProduto(@PathVariable Long id){
			
			Produto produtoEncontrado = produtoService.buscarPorId(id);
			if (produtoEncontrado == null){
				return new ResponseEntity<>( HttpStatus.NOT_FOUND);
			  	
			} else{
				produtoService.excluir(produtoEncontrado);
				return new ResponseEntity<>(HttpStatus.OK);	
			}		
		}
		
	//=================================================================================================================	
		@RequestMapping(method=RequestMethod.PUT,
				       value="/produtos", consumes =MediaType.APPLICATION_JSON_VALUE)
		public ResponseEntity<Produto> alterarProduto
		       (@RequestBody Produto produto){
			
			Produto produtoAlterado = produtoService.alterar(produto);
			return new ResponseEntity<>(produtoAlterado, HttpStatus.OK);
		}
}
