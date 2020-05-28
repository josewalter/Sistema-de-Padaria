package com.br.sistemapadaria.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sistemapadaria.model.Cliente;
import com.br.sistemapadaria.repository.ClienteRepository;

@Service
public class ClienteService {
	
		@Autowired
	    ClienteRepository clienteRepository;
		
		public Cliente cadastrar(Cliente cliente){
			
			if(cliente.getCodigoCliente()==0){
			 clienteRepository.save(cliente);
			 System.out.println("O cliente " + cliente+ ", foi salvo com sucesso!!");
		     
		}else{
			System.out.println("O cliente já existe!!!");
			
		}
			return cliente;
		}
		
		
	//======================================================================
		// Busca todos os dados do banco
		public List<Cliente> buscarTodos(){
			
			return clienteRepository.findAll();
			
		}
		
	//======================================================================
		//Excclui um cliente do banco
		public void excluir(Cliente cliente){
			
			clienteRepository.delete(cliente);
		}
		
	//======================================================================
		// Faz a busca de um cliente pelo ID
		public Cliente buscarPorId(Long id) {
			
			return clienteRepository.getOne(id);
		}
		
	//======================================================================
		//Faz a alteração do cliente cadastrado no banco 
		public Cliente alterar(Cliente cliente){
			
			clienteRepository.save(cliente);
			return cliente;
		}
	}


