myApp.service('registerService', function($http) {
	console.log("registerService...");
	
    this.userRegister = function (registerObject) {
        return  $http({
            method : "POST",
            url : "http://localhost:8080/TodoApp/userRegister",
            data : registerObject
        });
    }
});