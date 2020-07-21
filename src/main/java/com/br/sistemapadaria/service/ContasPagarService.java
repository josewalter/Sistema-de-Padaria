package com.br.sistemapadaria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sistemapadaria.model.ContasPagar;
import com.br.sistemapadaria.repository.ContasPagarRepository;

/*
 * Descrição: Classe Contas service
 * Data: 15/07/2020  02:23
 * Autor: José Walter
 */

@Service
public class ContasPagarService {

	@Autowired
	ContasPagarRepository contasRepository;

	public ContasPagar cadastrar(ContasPagar contas){
		
		if(contas != null){
			contasRepository.save(contas);
	    	 System.out.println("A conta " + contas+ ", foi salva com sucesso!!");
	    	 	     
		}else{
		    System.out.println("A conta já existe!!!");
		
	}
		return contas;
	}

// =======================================================================================
	// Busca todos os dados do banco
	public List<ContasPagar> buscarTodos(){
		
		return contasRepository.findAll();
		
	}

	// =======================================================================================
	// Excclui um contas do banco
	public void excluir(ContasPagar contas){
		
		if(contas.getCodigoContasPagar() != 0){
			contasRepository.delete(contas);
			System.out.println(" A conta " + contas + " foi excluida com sucesso!!");
		}else{
			System.out.println(" O conta não foi encontrada!!");
		}
		
	}

	// =======================================================================================
	// Faz a busca de um contas pelo ID
	public ContasPagar buscarPorId(Long id) {
		
		return contasRepository.getOne(id);
	}

	// =======================================================================================
	// Faz a alteração do cliente cadastrado no banco
	public ContasPagar alterar(ContasPagar contas){
		
		if(contas.getCodigoContasPagar() != 0){
			contasRepository.save(contas);
			System.out.println(" A conta " + contas + " foi alterada com sucesso!!");
		}else{
			System.out.println("Não conseguimos fazer a alteração da conta!!");
		}
		
		return contas;
	}

}
