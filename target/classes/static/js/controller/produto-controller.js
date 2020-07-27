//Criação do produtoController
appSistemaPadaria.controller ("produtoController", function ($scope, $http){
	
	$scope.produtos = [];
	$scope.produto = {};
	
	//Método carregar produtos
	carregarProdutos = function (){
		$http({method:'GET', url:'http://localhost:8080/produtos'})
		.then(function (response){
		    $scope.produtos = response.data;
				   
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
						
		});
	};
	
	//Método salvar produto
	$scope.salvarProduto = function (produto){
		$http({method:'POST', url:'http://localhost:8080/produtos', data:$scope.produto})
		.then(function (response){
			$scope.produtos.push(response.data);
			$scope.cancelarAlteracaoProduto(); //Esse comando limpa os campos na tela
			confirm("O produto foi salvo com sucesso!!");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao salvar o produto!!");
			
		});
	};
	
	//Método excluir da parte produto
	$scope.excluirProduto = function (produto){
		$http({method:'DELETE', url:'http://localhost:8080/produtos/'+produto.codigoProduto})
		.then(function (response){
			posicaoProduto = $scope.produtos.indexOf(produto);
			$scope.produtos.splice(posicaoProduto , 1);
			confirm("Deseja realmente excluir esse produto?");
						            	 
			} , function(response){
			console.log(response.data);
			console.log(response.status);
			alert("Erro ao excluir o produto!!");
			
		});
	};
	
	//Método alterar produto
	$scope.alterarProduto = function (produto){
		$scope.produto = angular.copy(produto);
						
	};
	
	//Método cancelar produto
	$scope.cancelarAlteracaoProduto = function (produto){
		$scope.produto={};
		
	};
	carregarProdutos();

});