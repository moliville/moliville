'use strict';

function HomeController($scope) {
	$scope.products = {
			"p1" : {
				name : "SkinFood Black Sugar Wash Off Mask",
				description : "...",
				img: "http://img.auctiva.com/imgdata/5/3/3/4/8/3/webimg/797959235_o.jpg?nc=91"
			},
			"p2" : {
				name : "SkinFood Peach Sake Powder",
				description : "...",
				img: "http://img.auctiva.com/imgdata/5/3/3/4/8/3/webimg/798207688_o.jpg?nc=918"
			},
			"p3" : {
				name : "SkinFood Rice Wash Off Mask",
				description : "...",
				img: "http://img.auctiva.com/imgdata/5/3/3/4/8/3/webimg/798216714_o.jpg?nc=126"
			},
			"p4" : {
				name : "SkinFood Black Sugar Wash Off Mask",
				description : "...",
				img: "http://img.auctiva.com/imgdata/5/3/3/4/8/3/webimg/797959235_o.jpg?nc=91"
			}
	};
}
HomeController.$inject = ["$scope"];