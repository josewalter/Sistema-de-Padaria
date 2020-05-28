//Criação do clienteController
appSistemaPadaria.controller ("clienteController", function ($scope, $http){
	
	$scope.clientes = [];
	$scope.cliente = {};
	
	//Método carregar clientes
	carregarClientes = function (){
		$http({method:'GET', url:'http://localhost:8080/clientes'})
		.then(function (response){
		    $scope.clientes = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar cliente
	$scope.salvarCliente = function (){
		$http({method:'POST', url:'http://localhost:8080/clientes', data:$scope.cliente})
		.then(function (response){
			//$scope.clientes.push(response.data);
			carregarClientes();
			$scope.cancelarAlteracaoCliente();
			
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método excluir da parte cliente
	$scope.excluirCliente = function (cliente){
		$http({method:'DELETE', url:'http://localhost:8080/clientes/'+cliente.id})
		.then(function (response){
			pos = $scope.clientes.indexOf(cliente);
			$scope.clientes.splice(pos , 1);
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método alterar cliente
	$scope.alterarCliente = function (forn){
		$scope.cliente = angular.copy(cli);
				
	};
	
	//Método cancelar cliente
	$scope.cancelarAlteracaoCliente = function (){
		$scope.cliente={};
		
	};
	carregarClientes();

});