//Criação do modulo principal da aplicação
var appSistemaPadaria = angular.module("appSistemaPadaria",['ngRoute']);

appSistemaPadaria.config(function ($routeProvider, $locationProvider){
	
	$routeProvider
	.when("/clientes", {templateUrl:'view/cliente.html', controller:'clienteController'})
	.when("/usuarios", {templateUrl:'view/usuario.html', controller:'usuarioController'})
	.otherwise({rediretTo:'/'});
	
  });
