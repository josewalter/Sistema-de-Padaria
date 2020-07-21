package com.br.sistemapadaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sistemapadaria.model.Fornecedor;
import com.br.sistemapadaria.repository.FornecedorRepository;

/*
 * Descrição: Classe Fornecedor service responsável pelas reqras de negócios
 * Data: 21/07/2020  00:13
 * Autor: José Walter
 */

@Service
public class FornecedorService {

	@Autowired
    FornecedorRepository fornecedorRepository;
	
	//Regras de negócios
	public Fornecedor cadastrar(Fornecedor fornecedor){
		
		if(fornecedor != null){
			fornecedorRepository.save(fornecedor);
	    	 System.out.println("O fornecedor " + fornecedor+ ", foi salvo com sucesso!!");
	    	 	     
		}else{
		    System.out.println("O fornecedor já existe!!!");
		
	}
		return fornecedor;
	}
	
	
//=======================================================================================
	// Busca todos os dados do banco
	public List<Fornecedor> buscarTodos(){
		
		return fornecedorRepository.findAll();
		
	}
	
//=======================================================================================
	//Excclui um fornecedor do banco
	public void excluir(Fornecedor fornecedor){
		
		if(fornecedor.getCodigoFornecedor() != 0){
			fornecedorRepository.delete(fornecedor);
			System.out.println(" O fornecedor " + fornecedor + " foi excluido com sucesso!!");
		}else{
			System.out.println(" O fornecedor não foi encontrado!!");
		}
		
	}
	
//=======================================================================================
	// Faz a busca de um fornecedor pelo ID
	public Fornecedor buscarPorId(Long id) {
		
		return fornecedorRepository.getOne(id);
	}
	
//=======================================================================================
	//Faz a alteração do fornecedor cadastrado no banco 
	public Fornecedor alterar(Fornecedor fornecedor){
		
		if(fornecedor.getCodigoFornecedor() != 0){
			fornecedorRepository.save(fornecedor);
			System.out.println(" O fornecedor " + fornecedor + " foi alterado com sucesso!!");
		}else{
			System.out.println("Não conseguimos fazer a alteração do cliente!!");
		}
		
		return fornecedor;
	}
}
