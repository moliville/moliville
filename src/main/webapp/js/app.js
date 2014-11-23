'use strict';

var moliville = angular.module('moliville', [ 'ngRoute', 'ngResource' ])
.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/home', {
		templateUrl : 'views/home.html',
		controller : HomeController
	});
	$routeProvider.otherwise({
		redirectTo : '/home'
	});
} ]);
