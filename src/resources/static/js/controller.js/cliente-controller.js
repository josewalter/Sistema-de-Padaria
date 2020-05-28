//Criação do clienteController
appSistemaPadaria.controller ("clienteController", function ($scope, $http){
	
	$scope.clientes = [];
	$scope.cliente = {};
	
	//Método carregar clientes
	carregarClientes = function (){
		$http({method:'GET', url:'http://localhost:8085/clientes'})
		.then(function (response){
		    $scope.clientes = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar o cliente
	$scope.salvarCliente = function (){
		$http({method:'POST', url:'http://localhost:8085/clientes', data:$scope.cliente})
		.then(function (response){
			
			carregarClientes();
			$scope.cancelarAlteracaoCliente();
			alert("Cliente salvo com sucesso!!");			
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar o cliente!");
			
		});
	};
	
	//Método para excluir o cliente
	$scope.excluirCliente = function (cliente){
		$http({method:'DELETE', url:'http://localhost:8085/clientes/'+cliente.id})
		
		 .then(function (response){
		 	pos = $scope.clientes.indexOf(cliente);
			$scope.clientes.splice(pos , 1);	
									            	 
		 } , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método para alterar o cliente
	$scope.alterarCliente = function (cli){
		$scope.cliente= angular.copy(cli);
				
	};
	
	//Método para cancelar o cliente
	$scope.cancelarAlteracaoCliente = function (){
		$scope.cliente={};
		
	};
	carregarClientes();

});