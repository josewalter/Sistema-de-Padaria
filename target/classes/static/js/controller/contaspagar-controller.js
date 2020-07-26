//Criação do contasPagarController
appSistemaPadaria.controller ("contasPagarController", function ($scope, $http){
	
	$scope.contaspagas = [];
	$scope.contaspagar = {};
	
	//Método carregar contas a pagar
	carregarContasPagar = function (){
		$http({method:'GET', url:'http://localhost:8080/contaspagar'})
		.then(function (response){
		    $scope.contaspagas = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar contas
	$scope.salvarContasPagar = function (){
		$http({method:'POST', url:'http://localhost:8080/contaspagar', data:$scope.contaspagar})
		.then(function (response){
			//$scope.clientes.push(response.data);
			carregarContasPagar();
			$scope.cancelarAlteracaoContas(); //Esse comando limpa os campos na tela
			alert("A conta foi salva com sucesso!!");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar a conta!!");
			
		});
	};
	
	//Método excluir da parte contas
	$scope.excluirCOntas = function (contas){
		$http({method:'DELETE', url:'http://localhost:8080/contaspagar/'+contas.id})
		.then(function (response){
			pos = $scope.contaspagas.indexOf(cliente);
			$scope.contaspagas.splice(pos , 1);
			confirm("Deseja realmente excluir a conta?");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao excluir a conta!!");
			
		});
	};
	
	//Método alterar contas
	$scope.alterarContas = function (forncontas){
		$scope.contaspagar = angular.copy(contas);
				
	};
	
	//Método cancelar contas
	$scope.cancelarAlteracaoContas = function (){
		$scope.contaspagar={};
		
	};
	carregarContasPagar();

});