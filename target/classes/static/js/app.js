//Criação do modulo principal da aplicação
var appSistemaPadaria = angular.module("appSistemaPadaria",['ngRoute']);

appSistemaPadaria.config(function ($routeProvider, $locationProvider){
	
	$routeProvider
	.when("/clientes",      {
		templateUrl:'view/cliente.html',       
		controller:'clienteController'
	}).when("/funcionarios",  {
		templateUrl:'view/funcionario.html',   
		controller:'funcionarioController'
	}).when("/fornecedores",  {
		templateUrl:'view/fornecedor.html',    
		controller:'fornecedorController'
	}).when("/produtos",      {
		templateUrl:'view/produto.html',       
		controller:'produtoController'
	}).when("/notasfiscais",  {
		templateUrl:'view/notaFiscal.html',    
		controller:'notaFiscalController'
	}).when("/contaspagar",   {
		templateUrl:'view/contaspagar.html',   
		controller:'contasPagarController'
	}).when("/contasreceber", {
		templateUrl:'view/contasReceber.html', 
		controller:'contasReceberController'
	}).when("/relatorio",     {
		templateUrl:'view/relatorio.html',     
		controller:'relatorioController'
	}).when("/vendas",        {
		templateUrl:'view/vendas.html',        
		controller:'vendasController'
	}).otherwise({rediretTo:'/'
	});

	 
});



