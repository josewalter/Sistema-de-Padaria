//Criação do fornecedorController
appSistemaPadaria.controller ("fornecedorController", function ($scope, $http){
	
	$scope.fornecedores = [];
	$scope.fornecedor = {};
	
	//Método carregar fornecedor
	carregarFornecedores = function (){
		$http({method:'GET', url:'http://localhost:8080/fornecedores'})
		.then(function (response){
		    $scope.fornecedores = response.data;
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			
		});
	};
	
	//Método salvar fornecedor
	$scope.salvarFornecedor = function (fornecedor){
		$http({method:'POST', url:'http://localhost:8080/fornecedor', data:$scope.fornecedor})
		.then(function (response){
			$scope.fornecedor.push(response.data);
			$scope.cancelarAlteracaoFornecedor(); //Esse comando limpa os campos na tela
			confirm("O fornecedor foi salvo com sucesso!!");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar o fornecedor!!");
			
		});
	};
	
	//Método excluir da parte fornecedor
	$scope.excluirFornecedor = function (fornecedor){
		$http({method:'DELETE', url:'http://localhost:8080/fornecedores/'+fornecedor.codigoFornecedor})
		.then(function (response){
			posicaoFornecedor = $scope.fornecedor.indexOf(fornecedor);
			$scope.fornecedores.splice(posicaoFornecedor , 1);
			confirm("Deseja realmente excluir esse fornecedor?");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao excluir o fornecedor!!");
			
		});
	};
	
	//Método alterar fornecedor
	$scope.alterarFornecedor = function (fornecedor){
		$scope.fornecedor = angular.copy(fornecedor);
						
	};
	
	//Método cancelar fornecedor
	$scope.cancelarAlteracaoFornecedor = function (fornecedor){
		$scope.fornecedor={};
		
	};
	carregarFornecedores();

});