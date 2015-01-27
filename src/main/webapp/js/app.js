'use strict';

var moliville = angular.module('moliville', [ 'ngRoute', 'ngResource' ]);

moliville.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'views/home.html',
		controller : HomeController
	});
	$routeProvider.when('/products', {
		templateUrl : 'views/products.html',
		controller : HomeController
	});
	$routeProvider.when('/info', {
		templateUrl : 'views/info.html',
		controller : HomeController
	});
	$routeProvider.when('/help', {
		templateUrl : 'views/help.html',
		controller : HomeController
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);
