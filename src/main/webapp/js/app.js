
angular.module( "rwc", [] )
	
	.controller( "MainController", function( $scope, $http, WebsocketService ) {
		
		$scope.wsname = "No name yet...";
		WebsocketService.onMessage( function( event ) {
			$scope.wsname = event.data;
		});
		
		$scope.sendName = function() {
			$http.post( 'services/setname', $scope.name ).then(
				function() { console.log( "Success" ) },
				function() { console.log( "Failure" ) }
			);
		}
	})
	
	.factory( "WebsocketService", function() {
		var ws = new WebSocket( "ws://localhost:6060/rest-ws-example/name" );
		ws.onopen = function() {
			console.log( "websocket opened" )
		}
		
		ws.onmessage = function( event ) {
			console.log( "no onmessage handler set..." )
		}
		
		return {
			onMessage: function( func ) {
				ws.onmessage = func;
			}
		};
	});