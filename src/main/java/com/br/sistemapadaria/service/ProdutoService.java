package com.br.sistemapadaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sistemapadaria.model.Produto;
import com.br.sistemapadaria.repository.ProdutoRepository;

/*
 * Descrição: Classe Produto service
 * Data: 23/07/2020  20:13
 * Autor: José Walter
 */

@Service
public class ProdutoService {
	
	@Autowired
    ProdutoRepository produtoRepository;
	
	public Produto cadastrar(Produto produto){
		
		if(produto != null){
			produtoRepository.save(produto);
	    	 System.out.println("O produto " + produto + ", foi salvo com sucesso!!");
	    	 	     
		}else{
		    System.out.println("O produto já existe!!!");
		
	}
		return produto;
	}
	
	
//=======================================================================================
	// Busca todos os dados do banco
	public List<Produto> buscarTodos(){
		
		return produtoRepository.findAll();
		
	}
	
//=======================================================================================
	//Excclui um produto do banco
	public void excluir(Produto produto){
		
		if(produto.getCodigoProduto() != 0){
			produtoRepository.delete(produto);
			System.out.println(" O produto " + produto + " foi excluido com sucesso!!");
		}else{
			System.out.println(" O produto não foi encontrado!!");
		}
		
	}
	
//=======================================================================================
	// Faz a busca de um produto pelo ID
	public Produto buscarPorId(Long id) {
		
		return produtoRepository.getOne(id);
	}
	
//=======================================================================================
	//Faz a alteração do produto cadastrado no banco 
	public Produto alterar(Produto produto){
		
		if(produto.getCodigoProduto() != 0){
			produtoRepository.save(produto);
			System.out.println(" O produto " + produto + " foi alterado com sucesso!!");
		}else{
			System.out.println("Não conseguimos fazer a alteração do produto!!");
		}
		
		return produto;
	}

}
