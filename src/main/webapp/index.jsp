<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="rwc">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Test</title>
	
	<script type="text/javascript" src="js/angular.js"></script>
	<script type="text/javascript" src="js/app.js"></script>
	
</head>
<body ng-controller="MainController">
	<h3>test</h3>
	<hr />
	<input ng-model="name" id="myName" type="text" />
	<button ng-click="sendName()">Send Name</button>
	<p>{{wsname}}</p>
</body>
</html>